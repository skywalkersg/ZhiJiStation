package com.team.util;

/**
 * Created by BLACK on 2017/3/25.
 */
public class EditormdUploadResult {
    private int success = 1; // 0 表示上传失败，1 表示上传成功
    private String message="上传成功";
    private String url = ""; // 上传成功时才返回

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
