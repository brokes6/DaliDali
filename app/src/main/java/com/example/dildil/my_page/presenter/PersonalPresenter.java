package com.example.dildil.my_page.presenter;

import com.example.dildil.home_page.bean.RecommendVideoBean;
import com.example.dildil.login_page.bean.UserBean;
import com.example.dildil.my_page.contract.PersonalContract;
import com.example.dildil.my_page.model.PersonalModel;

import javax.inject.Inject;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class PersonalPresenter extends PersonalContract.Presenter {

    @Inject
    public PersonalPresenter() {

    }

    public void attachView(PersonalContract.View view) {
        this.mView = view;
        this.mModel = new PersonalModel();
    }

    public void detachView() {
        this.mView = null;
    }

    @Override
    public void getFindDetails(int uid) {
        mModel.getFindDetails(uid).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(UserBean userBean) {
                        mView.onGetFindUserDetailsSuccess(userBean);
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onGetFindUserDetailsFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void findHasCoinVideo(int pageNum, int pageSize, int uid) {
        mModel.findHasCoinVideo(pageNum, pageSize, uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecommendVideoBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull RecommendVideoBean recommendVideoBean) {
                        mView.onGetFindHasCoinVideoSuccess(recommendVideoBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.onGetFindHasCoinVideoFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void findPublishVideo(int pageNum, int pageSize, int uid) {
        mModel.findPublishVideo(pageNum, pageSize, uid)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<RecommendVideoBean>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull RecommendVideoBean recommendVideoBean) {
                        mView.onGetPublishVideoSuccess(recommendVideoBean);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        mView.onGetPublishVideoFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
