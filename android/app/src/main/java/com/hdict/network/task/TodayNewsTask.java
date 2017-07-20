package com.hdict.network.task;

import java.util.HashMap;

import android.content.Context;
import android.os.AsyncTask;

import Protobuf.Models.RespondBase;
import Protobuf.Models.NewsList;
import Protobuf.Models.NewsQuery;

import com.google.protobuf.InvalidProtocolBufferException;
import com.hdict.network.ICompletionListener;

/**
 *
 */
public class TodayNewsTask extends AsyncTask<HashMap<String, Object>, Void, RespondBase> {
    private Context mContext;
    private ICompletionListener mListener;

    public TodayNewsTask(Context context, ICompletionListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    protected RespondBase doInBackground(HashMap<String, Object>... params) {
        HashMap<String, Object> paramsMap = params[0];
        int querySize = (int)paramsMap.get("QuerySize");
        int queryIndex = (int)paramsMap.get("QueryIndex");

        NewsQuery.Builder builder = NewsQuery.newBuilder();
        builder.setQuerySize(querySize);
        builder.setQueryIndex(queryIndex);
        NewsQuery query = builder.build();

        return TaskCommon.doQuery(TaskCommon.SubCommand_NewsList, query.toByteArray());
    }

    @Override
    protected void onPostExecute(RespondBase result) {
        boolean succeed = TaskCommon.querySucceed(result, mContext, mListener);
        if (succeed) {
            try {
                NewsList newsList = NewsList.parseFrom(result.getData());
                mListener.onSuccess(newsList);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
