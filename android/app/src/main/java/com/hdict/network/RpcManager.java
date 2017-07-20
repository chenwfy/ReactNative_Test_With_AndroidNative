package com.hdict.network;

import android.content.Context;

import com.hdict.network.task.*;

import java.util.HashMap;

/**
 *
 */
public class RpcManager {
    private Context mContext;
    private static RpcManager mInstance;

    private RpcManager(Context appContext) {
        mContext = appContext;
    }

    public static RpcManager getRpcManager(Context appContext) {
        if (mInstance == null) {
            mInstance = new RpcManager(appContext);
        }
        return mInstance;
    }

    public IRpcService getRpcService() {
        return new RpcService();
    }

    private class RpcService implements IRpcService {
        /**
         * @param listener
         */
        @Override
        public void queryTodaySentence(ICompletionListener listener) {
            new TodaySentenceTask(mContext, listener).execute();
        }

        /**
         * @param querySize
         * @param queryIndex
         * @param listener
         */
        @Override
        public void queryTodayNews(int querySize, int queryIndex, ICompletionListener listener) {
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("QuerySize", querySize);
            map.put("QueryIndex", queryIndex);
            new TodayNewsTask(mContext, listener).execute(map);
        }

        /**
         * @param newsId
         * @param listener
         */
        @Override
        public void queryNewsDetail(int newsId, ICompletionListener listener) {
            new NewsDetailTask(mContext, listener).execute(newsId);
        }

        /**
         * @param Text
         * @param listener
         */
        @Override
        public void queryTranslation(String Text, ICompletionListener listener) {
            new TranslationTask(mContext, listener).execute(Text);
        }

        /**
         * @param Text
         * @param listener
         */
        @Override
        public void queryAssociation(String Text, ICompletionListener listener) {
            new AssociationTask(mContext, listener).execute(Text);
        }
    }
}
