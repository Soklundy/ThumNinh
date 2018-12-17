package com.thumninh.thumninh.presenter.common;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

public abstract class AbstractPresenter<V> implements Presenter<V> {

    private WeakReference<V> view;

    @Override
    public void resume() {
    }

    @Override
    public void pause() {
    }

    @Override
    public void destroy() {
        view = null;
    }

    @Override
    public void setView(V view) {
        this.view = new WeakReference<>(view);
    }

    @Nullable
    @Override
    public V getView() {
        return view == null ? null : view.get();
    }
}
