package com.thedeveloperworldisyours.mvpandroid.model.response;

import java.io.Serializable;

/**
 * Created by javiergonzalezcabezas on 4/11/15.
 */
public class SignInResponse implements Serializable {

    private String objectId;
    private String createdAt;

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
