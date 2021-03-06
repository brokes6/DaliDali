package com.example.dildil.my_page.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.databinding.DataBindingUtil;

import com.blankj.utilcode.util.ActivityUtils;
import com.example.dildil.MyApplication;
import com.example.dildil.R;
import com.example.dildil.base.BaseActivity;
import com.example.dildil.base.UserDaoOperation;
import com.example.dildil.component.activity.ActivityModule;
import com.example.dildil.component.activity.DaggerActivityComponent;
import com.example.dildil.databinding.ActivitySettingBinding;
import com.example.dildil.home_page.bean.VersionBean;
import com.example.dildil.home_page.dialog.AppUpdateDialog;
import com.example.dildil.login_page.view.LoginActivity;
import com.example.dildil.my_page.bean.LogoutBean;
import com.example.dildil.my_page.contract.MyContract;
import com.example.dildil.my_page.presenter.MyPresenter;
import com.example.dildil.util.AppDownloadManager;
import com.example.dildil.util.SharedPreferencesUtil;
import com.example.dildil.util.XToastUtils;
import com.gyf.immersionbar.ImmersionBar;

import javax.inject.Inject;

public class SettingActivity extends BaseActivity implements MyContract.View {
    private ActivitySettingBinding binding;
    private AppDownloadManager mDownloadManager;

    @Inject
    MyPresenter mPresenter;

    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_setting);

        ImmersionBar.with(this)
                .transparentStatusBar()
                .statusBarDarkFont(false)
                .statusBarColor(R.color.Pink)
                .init();

        DaggerActivityComponent.builder()
                .appComponent(MyApplication.getAppComponent())
                .activityModule(new ActivityModule(this))
                .build()
                .inject(this);
        mPresenter.attachView(this);
    }

    @Override
    protected void initView() {
        setLeftTitleText("设置");
        setBackBtn(getResources().getColor(R.color.While, null));
        setTitleBG(getResources().getColor(R.color.Pink, null));
        setLeftTitleTextColorWhite();
        binding.logOut.setOnClickListener(this);
        binding.DetectUpdates.setOnClickListener(this);
        binding.Title.findViewById(R.id.iv_back).setOnClickListener(this);
        setMargins(binding.Title, 0, getStatusBarHeight(this), 0, 0);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.logOut:
                showDialog();
                mPresenter.Logout();
                break;
            case R.id.DetectUpdates:
                showDialog();
                mPresenter.getVersion("http://116.196.105.203:8183/apk");
                break;
            case R.id.iv_back:
                finish();
                break;
        }
    }

    private void downloadApk(final VersionBean updateInfo) {
        mDownloadManager = new AppDownloadManager(this);
        AppUpdateDialog dialog = new AppUpdateDialog(this, updateInfo);
        dialog.setOnUpdateClickListener(new AppUpdateDialog.OnUpdateClickListener() {
            @Override
            public void update(final AppUpdateDialog updateDialog) {
                mDownloadManager.setUpdateListener(new AppDownloadManager.OnUpdateListener() {
                    @Override
                    public void update(int currentByte, int totalByte) {
                        updateDialog.setProgress(currentByte, totalByte);
                        if ((currentByte == totalByte) && totalByte != 0) {
                            updateDialog.dismiss();
                        }

                    }
                });
                mDownloadManager.downloadApk(updateInfo.getData().getUrl());
            }

        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
    }

    @Override
    public void onGetLogoutSuccess(LogoutBean logoutBean) {
        hideDialog();
        XToastUtils.success("退出成功！");
        UserDaoOperation.getDatabase(this).delUserDetail();
        UserDaoOperation.getDatabase(this).dellHistory();
        SharedPreferencesUtil.remove("cookie");
        ActivityUtils.startActivity(LoginActivity.class);
        this.finish();
    }

    @Override
    public void onGetLogoutFail(String e) {
        hideDialog();
    }

    @Override
    public void onGetVersionSuccess(VersionBean versionBean) {
        hideDialog();
        if (versionBean.getData().getVersion().compareTo(getVersionCode()) > 0) {
            downloadApk(versionBean);
        } else {
            XToastUtils.info("当前已是最新版本！");
        }
    }

    @Override
    public void onGetVersionFail(String e) {
        hideDialog();
        Log.e("why", "获取版本号出现错误:" + e);
    }

    @Override
    public void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }
}