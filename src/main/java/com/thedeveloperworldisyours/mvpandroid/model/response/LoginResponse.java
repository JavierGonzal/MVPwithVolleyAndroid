package com.thedeveloperworldisyours.mvpandroid.model.response;

import java.io.Serializable;

/**
 * Created by javiergonzalezcabezas on 4/11/15.
 */
public class LoginResponse implements Serializable {
    private  String createdAt;
    private  String objectId;
    private  String sessionToken;
    private  String updatedAt;
    private  String username;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "createdAt='" + createdAt + '\'' +
                ", objectId='" + objectId + '\'' +
                ", sessionToken='" + sessionToken + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
