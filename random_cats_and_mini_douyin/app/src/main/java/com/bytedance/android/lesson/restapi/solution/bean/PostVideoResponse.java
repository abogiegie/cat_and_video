package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("success") @Expose private boolean success;
    @SerializedName("item") @Expose private Feed item;

    public Feed getItem() {
        return item;
    }

    public boolean getSuccess(){
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setItem(Feed item) {
        this.item = item;
    }
}
