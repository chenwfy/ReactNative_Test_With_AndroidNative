package com.hdict.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 */
public class HttpHelper {
    /**
     * @param postUrl
     * @param postBuffer
     * @return
     */
    public static byte[] doHttpPost(String postUrl, byte[] postBuffer) {
        try {
            URL url = new URL(postUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            ////设置连接属性
            httpConn.setDoOutput(true);//使用 URL 连接进行输出
            httpConn.setDoInput(true);//使用 URL 连接进行输入
            httpConn.setUseCaches(false);//忽略缓存
            httpConn.setRequestMethod("POST");//设置URL请求方法
            httpConn.connect();

            //建立输出流，并写入数据
            DataOutputStream outputStream = new DataOutputStream(httpConn.getOutputStream());
            outputStream.write(postBuffer);
            outputStream.flush();
            outputStream.close();

            //获得响应状态
            int responseCode = httpConn.getResponseCode();
            if (HttpURLConnection.HTTP_OK == responseCode) {
                // 获取数据
                DataInputStream inputStream = new DataInputStream(httpConn.getInputStream());
                byte[] data = Utils.inputStreamToBytes(inputStream, 0);
                inputStream.close();
                httpConn.disconnect();

                return data;
            }

            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
