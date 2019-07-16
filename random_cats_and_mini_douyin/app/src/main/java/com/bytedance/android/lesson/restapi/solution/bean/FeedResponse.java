package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;
import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {

    // TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("feeds") private List<Feed> feeds;
    @SerializedName("success") private boolean success;

    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Feed> getFeeds() {
        return feeds;
    }

    public boolean getSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return "{" +
                "feeds=" + feeds +
                ",success=" + success +
                "}";

    }
}
