package com.hdict.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/**
 *
 */
public class Utils {
    /**
     * @param str
     * @param isShort
     * @return
     */
    public static String MD5(String str, Boolean isShort) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] byteArray = new byte[charArray.length];

            for (int i = 0; i < charArray.length; i++) {
                byteArray[i] = (byte) charArray[i];
            }
            byte[] md5Bytes = md5.digest(byteArray);

            StringBuffer hexValue = new StringBuffer();
            for (int i = 0; i < md5Bytes.length; i++) {
                int val = md5Bytes[i] & 0xff;
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }

            return isShort ? hexValue.toString().substring(8, 24) : hexValue.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * @param context
     * @return
     */
    public static String getImei(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }

    /**
     * @param context
     * @return
     */
    public static String getImsi(final Context context) {
        final TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        final String imsi = telephonyManager.getSubscriberId();
        return imsi == null ? "" : imsi;
    }

    /**
     * @return
     */
    public static String getModel() {
        final String model = Build.MODEL;
        return model == null ? "" : model;
    }

    /**
     * @param i
     * @return
     * @throws Exception
     */
    public static byte[] intToBytes(int i) throws Exception {
        byte[] result = new byte[4];
        result[0] = (byte) ((i >> 24) & 0xFF);
        result[1] = (byte) ((i >> 16) & 0xFF);
        result[2] = (byte) ((i >> 8) & 0xFF);
        result[3] = (byte) (i & 0xFF);
        return result;
    }

    /**
     * @param b
     * @return
     */
    public static int bytesToInt(byte[] b) {
        return b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }

    /**
     * @param stream
     * @param offset
     * @return
     * @throws IOException
     */
    public static byte[] inputStreamToBytes(InputStream stream, int offset) throws IOException {
        ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
        int ch;
        while ((ch = stream.read()) != -1) {
            bytestream.write(ch);
        }
        byte[] dataTemp = bytestream.toByteArray();
        byte[] data = new byte[dataTemp.length - offset];
        System.arraycopy(dataTemp, offset, data, 0, dataTemp.length - offset);
        bytestream.close();
        return data;
    }

    /**
     * @param context
     * @return
     */
    public static NetworkInfo getNetworkInfo(Context context) {
        final ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        final NetworkInfo network = cm.getActiveNetworkInfo();
        return network;
    }

    /**
     * @param context
     * @return
     */
    public static boolean isNetworkAvailable(Context context) {
        final NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo == null ? false : networkInfo.isAvailable();
    }

    /**
     * @param context
     * @return
     */
    public static boolean isWifiAvailable(Context context) {
        final NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.getType() == ConnectivityManager.TYPE_WIFI;
    }

    /**
     * @param context
     * @return
     */
    public static boolean isWifiConnected(Context context) {
        final NetworkInfo networkInfo = getNetworkInfo(context);
        return isWifiAvailable(context) && networkInfo.isConnected();
    }
}
