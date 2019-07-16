package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id") @Expose private String studentId;
    @SerializedName("user_name") @Expose private String userName;
    @SerializedName("image_url") @Expose private String imageUrl;
    @SerializedName("video_url") @Expose private String videoUrl;

    public void imageUrl(String image_url) {
        this.imageUrl = image_url;
    }

    public void setVideoUrl(String video_url) {
        this.videoUrl = video_url;
    }

    public void setStudentId(String student_id) {
        this.studentId = student_id;
    }

    public void setUserName(String user_name) {
        this.userName = user_name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "{" +
                "student_id=" + studentId +
                ",user_name=" + userName +
                ",image_url=" + imageUrl +
                ",video_url=" + videoUrl +
                "}";
    }
}
