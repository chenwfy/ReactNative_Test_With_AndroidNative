package com.hdict.network;

/**
 *
 */
public interface IRpcService {
    /**
     * @param listener
     */
    public void queryTodaySentence(ICompletionListener listener);

    /**
     * @param querySize
     * @param queryIndex
     * @param listener
     */
    public void queryTodayNews(int querySize, int queryIndex, ICompletionListener listener);

    /**
     * @param newsId
     * @param listener
     */
    public void queryNewsDetail(int newsId, ICompletionListener listener);

    /**
     * @param Text
     * @param listener
     */
    public void queryTranslation(String Text, ICompletionListener listener);

    /**
     * @param Text
     * @param listener
     */
    public void queryAssociation(String Text, ICompletionListener listener);

}
