package com.hdict.network;

/**
 *
 */
public interface ICompletionListener {
    /**
     *
     * @param result
     */
    public void onSuccess(Object result);

    /**
     *
     * @param errorCode
     */
    public void onFailure(int errorCode);
}