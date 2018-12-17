package com.thumninh.thumninh.presenter.common;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class RxPresenter<V> extends BasePresenter<V> {

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    @Override
    public void destroy() {
        super.destroy();
        mCompositeDisposable.dispose();
    }

    protected void addDisposable(Disposable disposable) {
        mCompositeDisposable.addAll(disposable);
    }

    protected void removeDisposable(Disposable disposable) {
        mCompositeDisposable.remove(disposable);
    }
}
