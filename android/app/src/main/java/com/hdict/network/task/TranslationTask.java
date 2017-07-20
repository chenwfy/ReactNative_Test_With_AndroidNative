package com.hdict.network.task;

import android.content.Context;
import android.os.AsyncTask;

import Protobuf.Models.RespondBase;
import Protobuf.Models.DictQuery;
import Protobuf.Models.DictResult;

import com.google.protobuf.InvalidProtocolBufferException;
import com.hdict.network.ICompletionListener;
/**
 *
 */
public class TranslationTask extends AsyncTask<String, Void, RespondBase> {
    private Context mContext;
    private ICompletionListener mListener;

    public TranslationTask(Context context, ICompletionListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    protected RespondBase doInBackground(String... params) {
        String word = params[0];
        DictQuery.Builder builder = DictQuery.newBuilder();
        builder.setText(word);
        builder.setQueryPart(DictQuery.ResultPart.All);
        builder.setExtendResult(true);
        DictQuery query = builder.build();

        return TaskCommon.doQuery(TaskCommon.SubCommand_Translation, query.toByteArray());
    }

    @Override
    protected void onPostExecute(RespondBase result) {
        boolean succeed = TaskCommon.querySucceed(result, mContext, mListener);
        if (succeed) {
            try {
                DictResult dictResult = DictResult.parseFrom(result.getData());
                mListener.onSuccess(dictResult);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
