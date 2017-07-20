package com.hdict.network.task;

import android.widget.Toast;
import android.content.Context;

import com.google.protobuf.ByteString;
import com.hdict.network.ICompletionListener;
import com.hdict.utils.HttpHelper;

import Protobuf.Models.RequestBase;
import Protobuf.Models.RespondBase;
import Protobuf.Models.Status;

/**
 *
 */
public class TaskCommon {
    protected final static String DataServerPath = "http://192.168.9.48:8095/Data";
    protected final static String MainCommand = "Material";
    protected final static String SubCommand_SentenceList = "TodaySentence";
    protected final static String SubCommand_NewsList = "TodayNews";
    protected final static String SubCommand_NewsDetail = "NewsDetail";
    protected final static String SubCommand_Translation = "Translation";
    protected final static String SubCommand_Association = "Association";

    /**
     * @param subCommand
     * @param data
     * @return
     */
    protected final static RespondBase doQuery(String subCommand, byte[] data) {
        RequestBase.Builder requestBuilder = RequestBase.newBuilder();
        requestBuilder.setCommand(MainCommand + "." + subCommand);
        if (data != null && data.length > 0) {
            requestBuilder.setData(ByteString.copyFrom(data));
        }
        RequestBase requestBase = requestBuilder.build();
        byte[] queryBuffer = requestBase.toByteArray();
        try {
            byte[] resultBuffer = HttpHelper.doHttpPost(DataServerPath, queryBuffer);
            if (resultBuffer != null && resultBuffer.length > 0) {
                return RespondBase.parseFrom(resultBuffer);
            }
            return null;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    /**
     * @param respondBase
     * @param context
     * @param listener
     * @return
     */
    protected final static boolean querySucceed(RespondBase respondBase, Context context, ICompletionListener listener) {
        if (respondBase == null) {
            listener.onFailure(0);
            Toast.makeText(context, "联网失败，请检查网络。", Toast.LENGTH_SHORT).show();
            return false;
        }

        Status status = respondBase.getStatus();
        if (status == Status.Failed) {
            listener.onFailure(0);
            Toast.makeText(context, "请求失败！", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}
