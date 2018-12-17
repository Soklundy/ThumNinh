package com.thumninh.thumninh.presenter.common;
import android.support.annotation.Nullable;

public interface Presenter<V> {

    /***
     *
     */
    void resume();

    /**
     *
     */
    void pause();

    /**
     *
     */
    void destroy();

    /**
     * @param view
     */
    void setView(V view);

    /**
     * @return
     */
    @Nullable
    V getView();
}
