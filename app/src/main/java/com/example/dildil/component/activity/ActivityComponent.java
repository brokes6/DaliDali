package com.example.dildil.component.activity;

import android.app.Activity;

import com.example.dildil.channel_page.fragment_tab.PartitionTabFragment;
import com.example.dildil.component.app.AppComponent;
import com.example.dildil.dynamic_page.fragment_tab.DetailsCommentFragment;
import com.example.dildil.dynamic_page.fragment_tab.SynthesizeTabFragment;
import com.example.dildil.dynamic_page.fragment_tab.VideoTabFragment;
import com.example.dildil.dynamic_page.view.DynamicDetailsActivity;
import com.example.dildil.home_page.fragment.fragment_tab.HotFragment;
import com.example.dildil.home_page.fragment.fragment_tab.PursueFramgment;
import com.example.dildil.home_page.fragment.fragment_tab.RecommendedFragment;
import com.example.dildil.home_page.fragment.fragment_tab.WholeStationFragment;
import com.example.dildil.home_page.view.HomeActivity;
import com.example.dildil.login_page.view.LoginActivity;
import com.example.dildil.my_page.fragment.MyHomePageFragment;
import com.example.dildil.my_page.view.PersonalActivity;
import com.example.dildil.my_page.view.SettingActivity;
import com.example.dildil.video.fragment_tab.CommentFragment;
import com.example.dildil.video.fragment_tab.IntroductionFragment;
import com.example.dildil.video.view.VideoActivity;

import dagger.Component;

/**
 * @author fuxinbo
 * @desc ActivityComponent 用于管理需要进行依赖注入的Activity
 * @date 2020/8/28
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    Activity getActivity();

    void inject(HomeActivity mainActivity);//用于注入HomeActivity

    void inject(LoginActivity loginActivity);//用于注入LoginActivity

    void inject(RecommendedFragment recommendedFragment);

    void inject(VideoActivity videoActivity);

    void inject(IntroductionFragment ntroductionFragment);

    void inject(CommentFragment commentFragment);

    void inject(SettingActivity settingActivity);

    void inject(HotFragment hotFragment);

    void inject(SynthesizeTabFragment synthesizeTabFragment);

    void inject(PersonalActivity personalActivity);

    void inject(MyHomePageFragment myHomePageFragment);

    void inject(VideoTabFragment videoTabFragment);

    void inject(WholeStationFragment wholeStationFragment);

    void inject(DetailsCommentFragment detailsCommentFragment);

    void inject(PartitionTabFragment partitionTabFragment);

    void inject(DynamicDetailsActivity dynamicDetailsActivity);

    void inject(PursueFramgment pursueFramgment);

    //TODO 后续需要注入的Activity类都可以在这里添加 中像上面一样写就好了
}