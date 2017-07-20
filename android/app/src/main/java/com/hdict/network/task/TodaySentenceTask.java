package com.hdict.network.task;

import java.util.HashMap;

import android.content.Context;
import android.os.AsyncTask;

import Protobuf.Models.RespondBase;
import Protobuf.Models.SentenceList;

import com.google.protobuf.InvalidProtocolBufferException;
import com.hdict.network.ICompletionListener;

/**
 *
 */
public class TodaySentenceTask extends AsyncTask<HashMap<String, Object>, Void, RespondBase> {
    private Context mContext;
    private ICompletionListener mListener;

    public TodaySentenceTask(Context context, ICompletionListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    protected RespondBase doInBackground(HashMap<String, Object>... params) {
        return TaskCommon.doQuery(TaskCommon.SubCommand_SentenceList, null);
    }

    @Override
    protected void onPostExecute(RespondBase result) {
        boolean succeed = TaskCommon.querySucceed(result, mContext, mListener);
        if (succeed) {
            try {
                SentenceList sentenceList = SentenceList.parseFrom(result.getData());
                mListener.onSuccess(sentenceList);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
