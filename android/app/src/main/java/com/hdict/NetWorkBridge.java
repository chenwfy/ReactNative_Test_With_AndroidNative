package com.hdict;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.facebook.react.bridge.WritableMap;
import com.hdict.network.ICompletionListener;
import com.hdict.network.IRpcService;

import com.alibaba.fastjson.JSON;

import Protobuf.Models.*;

/**
 *
 */
public class NetWorkBridge extends ReactContextBaseJavaModule {
    private MainApplication mApp;
    private IRpcService mRpcService;

    public NetWorkBridge(ReactApplicationContext reactContext) {
        super(reactContext);
        mApp = (MainApplication) reactContext.getApplicationContext();
        mRpcService = mApp.getRpcService();
    }

    @Override
    public String getName() {
        return "NetWorkBridge";
    }

    @ReactMethod
    public void fetchSentence(Promise promise) {
        mRpcService.queryTodaySentence(new SentenceCompletionListener(promise));
    }

    private class SentenceCompletionListener implements ICompletionListener {
        private Promise mPromise;

        public SentenceCompletionListener(Promise promise) {
            this.mPromise = promise;
        }

        @Override
        public void onSuccess(Object result) {
            SentenceList sentenceList = (SentenceList) result;
            mPromise.resolve(JSON.toJSONString(sentenceList));
        }

        @Override
        public void onFailure(int errorCode) {
            mPromise.reject("{}");
        }
    }
}
