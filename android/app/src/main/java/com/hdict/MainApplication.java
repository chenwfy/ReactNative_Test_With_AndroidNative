package com.hdict;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.hdict.network.IRpcService;
import com.hdict.network.RpcManager;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private static MainApplication appInstance = null;
    private RpcManager mRpcManager;

    @Override
    public void onCreate() {
        super.onCreate();
        appInstance = this;
        mRpcManager = RpcManager.getRpcManager(getApplicationContext());
    }

    public static MainApplication getInstance() {
        return appInstance;
    }

    public IRpcService getRpcService() {
        return mRpcManager.getRpcService();
    }


    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new NetWorkBridgePackage()
            );
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }
}
