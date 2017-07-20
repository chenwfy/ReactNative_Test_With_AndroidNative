package com.hdict.network.task;

import android.content.Context;
import android.os.AsyncTask;

import Protobuf.Models.RespondBase;
import Protobuf.Models.StringSingle;
import Protobuf.Models.DictResultPortion;

import com.google.protobuf.InvalidProtocolBufferException;
import com.hdict.network.ICompletionListener;

/**
 *
 */
public class AssociationTask extends AsyncTask<String, Void, RespondBase> {
    private Context mContext;
    private ICompletionListener mListener;

    public AssociationTask(Context context, ICompletionListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    protected RespondBase doInBackground(String... params) {
        String word = params[0];
        StringSingle.Builder builder = StringSingle.newBuilder();
        builder.setData(word);
        StringSingle query = builder.build();

        return TaskCommon.doQuery(TaskCommon.SubCommand_Association, query.toByteArray());
    }

    @Override
    protected void onPostExecute(RespondBase result) {
        boolean succeed = TaskCommon.querySucceed(result, mContext, mListener);
        if (succeed) {
            try {
                DictResultPortion dictResult = DictResultPortion.parseFrom(result.getData());
                mListener.onSuccess(dictResult);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
