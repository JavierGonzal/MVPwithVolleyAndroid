package com.thedeveloperworldisyours.mvpandroid.view;

import android.content.Context;

/**
 * Created by javiergonzalezcabezas on 4/11/15.
 */
public interface LoginView {
    void showLoading(boolean state);
    void onRequestSuccess(Object object);
    void onRequestError(Object object);

    Context getContext();

}
