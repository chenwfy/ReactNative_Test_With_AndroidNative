package com.hdict.network.task;

import android.content.Context;
import android.os.AsyncTask;

import Protobuf.Models.RespondBase;
import Protobuf.Models.Int32Single;
import Protobuf.Models.NewsInfo;

import com.google.protobuf.InvalidProtocolBufferException;
import com.hdict.network.ICompletionListener;


/**
 *
 */
public class NewsDetailTask extends AsyncTask<Integer, Void, RespondBase> {
    private Context mContext;
    private ICompletionListener mListener;

    public NewsDetailTask(Context context, ICompletionListener listener) {
        mContext = context;
        mListener = listener;
    }

    @Override
    protected RespondBase doInBackground(Integer... params) {
        int newsId = params[0];
        Int32Single.Builder builder = Int32Single.newBuilder();
        builder.setData(newsId);
        Int32Single query = builder.build();

        return TaskCommon.doQuery(TaskCommon.SubCommand_NewsDetail, query.toByteArray());
    }

    @Override
    protected void onPostExecute(RespondBase result) {
        boolean succeed = TaskCommon.querySucceed(result, mContext, mListener);
        if (succeed) {
            try {
                NewsInfo newsInfo = NewsInfo.parseFrom(result.getData());
                mListener.onSuccess(newsInfo);
            } catch (InvalidProtocolBufferException e) {
                e.printStackTrace();
            }
        }
    }
}
