package com.example.dildil;

import com.example.dildil.channel_page.bean.BeInterestedBean;
import com.example.dildil.channel_page.bean.HaveViewedBean;
import com.example.dildil.dynamic_page.bean.DynamicBean;
import com.example.dildil.dynamic_page.bean.TopicBean;
import com.example.dildil.home_page.bean.HotRankingBean;
import com.example.dildil.home_page.bean.VideoBean;
import com.example.dildil.my_page.bean.MyDataBean;
import com.example.dildil.search.bean.HotSearchBean;
import com.example.dildil.video.bean.SwitchVideoBean;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ResourcesData {
    private List<VideoBean> beans = new ArrayList<>();
    private List<TopicBean> topicBeans = new ArrayList<>();
    private List<DynamicBean> dynamicBeans = new ArrayList<>();
    private List<HotRankingBean> hotRankingBeans = new ArrayList<>();
    private List<SwitchVideoBean> urls = new ArrayList<>();
    private List<URL> bannerImageList = new ArrayList<>();
    private List<HotSearchBean> hotSearchBeans = new ArrayList<>();
    private List<BeInterestedBean> beInterestedBeans = new ArrayList<>();
    private List<HaveViewedBean> haveViewedBeans = new ArrayList<>();
    private VideoBean videoBean, videoBean2, videoBean3, videoBean4, videoBean6, videoBean7;
    private MyDataBean mMyDataBean;

    public ResourcesData() {
        initData();
    }

    private void initData() {
        videoBean = new VideoBean();
        videoBean.setImgurl("https://i0.hdslb.com/bfs/archive/fbbfd0170433ce67fb54f7c7e76a9081705259d6.jpg@257w_145h_1c_100q.webp");
        videoBean.setBarrage_volume(24 + "");
        videoBean.setPlay_volume(2 + "");
        videoBean.setTitle("这是介绍介绍介绍");

        videoBean2 = new VideoBean();
        videoBean2.setImgurl("https://i2.hdslb.com/bfs/archive/6fa9d164c643f39a7ca8b066a7d84e2205fb568f.jpg@257w_145h_1c_100q.webp");
        videoBean2.setBarrage_volume(28 + "");
        videoBean2.setPlay_volume(200 + "");
        videoBean2.setTitle("这是介绍介绍介绍2");

        videoBean3 = new VideoBean();
        videoBean3.setImgurl("https://i2.hdslb.com/bfs/archive/43917bb952b66f4460a7c067bec55c6a6ee5f5bf.jpg@257w_145h_1c_100q.webp");
        videoBean3.setBarrage_volume(27.0 + "万");
        videoBean3.setPlay_volume(3.1 + "万");
        videoBean3.setTitle("当 今 网 抑 云 现 状");

        videoBean4 = new VideoBean();
        videoBean4.setImgurl("https://i0.hdslb.com/bfs/archive/9c7b5059d3b45e5b17f9fbc62a33a880bcb778bd.jpg@257w_145h_1c_100q.webp");
        videoBean4.setBarrage_volume(135.1 + "万");
        videoBean4.setPlay_volume(11.1 + "万");
        videoBean4.setTitle("这才是世界的巅峰战力！！！");

        videoBean6 = new VideoBean();
        videoBean6.setImgurl("https://i0.hdslb.com/bfs/archive/08c6cf95e410f0f3315eed0334914c46890aac9f.jpg@257w_145h_1c_100q.webp");
        videoBean6.setBarrage_volume(5.7 + "万");
        videoBean6.setPlay_volume(1.1 + "万");
        videoBean6.setTitle("纱雾：再说我是你奶奶！？胸都给你拍平！！！");

        videoBean7 = new VideoBean();
        videoBean7.setImgurl("https://i0.hdslb.com/bfs/archive/ffccd8d54e5c795e1c65c7919f44088f2e1e1c65.jpg@257w_145h_1c_100q.webp");
        videoBean7.setBarrage_volume(43.3 + "万");
        videoBean7.setPlay_volume(408.8 + "万");
        videoBean7.setTitle("这样骂够吗？(200w粉纪念)");

        beans.add(videoBean);
        beans.add(videoBean2);
        beans.add(videoBean3);
        beans.add(videoBean4);
        beans.add(videoBean6);
        beans.add(videoBean7);
    }

    public List<VideoBean> getData() {
        return beans;
    }

    public void initTopicData() {

        TopicBean topicBean = new TopicBean();
        topicBean.setTopicType("话题");
        topicBean.setTopicName("手游暑假作业");

        TopicBean topicBean2 = new TopicBean();
        topicBean2.setTopicType("话题");
        topicBean2.setTopicName("和小熊一起画画");

        TopicBean topicBean3 = new TopicBean();
        topicBean3.setTopicType("订阅");
        topicBean3.setTopicName("COSPLAY");

        topicBeans.add(topicBean);
        topicBeans.add(topicBean2);
        topicBeans.add(topicBean3);
    }

    public List<TopicBean> getTopicData() {
        return topicBeans;
    }

    public void initDynamic() {
        DynamicBean dynamicBean = new DynamicBean();
        dynamicBean.setUser_img("https://i0.hdslb.com/bfs/face/d0f7a7ee34a4a45c8390eb3a07e4d7f2d70bae91.jpg_64x64.jpg");
        dynamicBean.setUser_name("极客湾Geekerwan");
        dynamicBean.setRelease_date("12分钟前");
        dynamicBean.setText("哈哈，你们会错意了，不是说b站的事");
        dynamicBean.setComment_num(256);
        dynamicBean.setThumbs_num(2174);

        DynamicBean dynamicBean2 = new DynamicBean();
        dynamicBean2.setUser_img("https://i2.hdslb.com/bfs/face/acc7a0e97bf9f6c4d047777e40270a39bc7f4f7d.jpg@.webp");
        dynamicBean2.setUser_name("Fracture6");
        dynamicBean2.setRelease_date("43分钟前");
        dynamicBean2.setText("抽奖抽奖");
        dynamicBean2.setComment_num(1);
        dynamicBean2.setThumbs_num(0);

        DynamicBean dynamicBean3 = new DynamicBean();
        dynamicBean3.setUser_img("https://i0.hdslb.com/bfs/face/c43e6cab13c9a0303cf8476cfd405cff61195726.jpg_64x64.jpg");
        dynamicBean3.setUser_name("STN工作室");
        dynamicBean3.setRelease_date("5小时前");
        dynamicBean3.setVideo_cover("https://i1.hdslb.com/bfs/archive/38214b16a2b8b0e1ed38b7467b2e498ad4542c38.jpg@257w_145h_1c_100q.webp");
        dynamicBean3.setText("竟然是真的新女主持而不是女装口口，不仅拯救了酷报也拯救了观众们的眼睛");
        dynamicBean3.setVideo_time(13.90 + "");
        dynamicBean3.setVideo_Playback_volume(5320);
        dynamicBean3.setVideo_bullet_chat(777);
        dynamicBean3.setComment_num(99);
        dynamicBean3.setThumbs_num(2386);

        DynamicBean dynamicBean4 = new DynamicBean();
        dynamicBean4.setUser_img("https://i1.hdslb.com/bfs/face/816b2f8c9eb9bcc2784e923cd75dd42ec2c087a5.jpg_64x64.jpg");
        dynamicBean4.setUser_name("笔吧评测室");
        dynamicBean4.setRelease_date("08-12");
        dynamicBean4.setText("\u200D本来筹备了一期“大机机”的评测，预计这个月发的\n" +
                "结果，跑游戏就开始闪退...\n" +
                "哎，只能延期（被动） 一段时间了 ");
        dynamicBean4.setComment_num(191);
        dynamicBean4.setThumbs_num(1752);

        dynamicBeans.add(dynamicBean);
        dynamicBeans.add(dynamicBean2);
        dynamicBeans.add(dynamicBean3);
        dynamicBeans.add(dynamicBean4);
    }

    public List<DynamicBean> getDynamicBeans() {
        return dynamicBeans;
    }

    public void initHotRanking() {
        HotRankingBean hotRankingBean = new HotRankingBean();
        hotRankingBean.setVideo_cover("https://i2.hdslb.com/bfs/archive/b1a07a8baefa0694760cd6d99f212bee45d1333d.jpg@143w_88h.webp");
        hotRankingBean.setVideo_title("敢 杀 我 的 马？！");
        hotRankingBean.setVideo_up("哦呼w");
        hotRankingBean.setVideo_play_num("152.6万");
        hotRankingBean.setVideo_time("2:25");

        HotRankingBean hotRankingBean2 = new HotRankingBean();
        hotRankingBean2.setVideo_cover("https://i0.hdslb.com/bfs/archive/c1e48e6aaf5e2eb430de9e9c635cb626103c0bef.jpg@412w_232h_1c_100q.jpg");
        hotRankingBean2.setVideo_title("有⚡茅⚡台");
        hotRankingBean2.setVideo_up("晏策去月光林地了");
        hotRankingBean2.setVideo_play_num("152.6万");
        hotRankingBean2.setVideo_time("2:25");

        HotRankingBean hotRankingBean3 = new HotRankingBean();
        hotRankingBean3.setVideo_cover("https://i2.hdslb.com/bfs/archive/8a801382150edd0ecd5d74f90dcaa4c9845360af.jpg@257w_145h_1c_100q.webp");
        hotRankingBean3.setVideo_title("希 望 新 来 的 体 育 老 师 没 事......");
        hotRankingBean3.setVideo_up("全能大鹏");
        hotRankingBean3.setVideo_play_num("46.4万");
        hotRankingBean3.setVideo_time("2:25");

        hotRankingBeans.add(hotRankingBean);
        hotRankingBeans.add(hotRankingBean2);
        hotRankingBeans.add(hotRankingBean3);
    }

    public List<HotRankingBean> getHotRanking() {
        return hotRankingBeans;
    }

    public void initVideo() {
        SwitchVideoBean switchVideoBean = new SwitchVideoBean("480p", "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4");
        SwitchVideoBean switchVideoBean2 = new SwitchVideoBean("720p", "http://vjs.zencdn.net/v/oceans.mp4");
        SwitchVideoBean switchVideoBean3 = new SwitchVideoBean("1080p", "http://9890.vod.myqcloud.com/9890_4e292f9a3dd011e6b4078980237cc3d3.f20.mp4");
        urls.add(switchVideoBean);
        urls.add(switchVideoBean2);
        urls.add(switchVideoBean3);
    }

    public List<SwitchVideoBean> getVideoData() {
        return urls;
    }

    public void initBanner(){
        try {
            URL url = new URL("https://i0.hdslb.com/bfs/archive/20a25dc84739a3852c125d55b9223d6bd70c34bb.png@880w_388h_1c_95q");
            URL url2 = new URL("https://i0.hdslb.com/bfs/sycp/creative_img/202007/82e1e1a0fd91537c6d1c30c80fe60e6c.jpg@880w_388h_1c_95q");
            bannerImageList.add(url);
            bannerImageList.add(url2);
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public List<URL> getBeannerUrl(){
        return bannerImageList;
    }

    public void initMyData(){
        mMyDataBean = new MyDataBean();
        mMyDataBean.setUsername("Fracture6");
        mMyDataBean.setUserImg("https://i1.hdslb.com/bfs/face/acc7a0e97bf9f6c4d047777e40270a39bc7f4f7d.jpg");
        mMyDataBean.setDynamic(36);
        mMyDataBean.setFollow(33);
        mMyDataBean.setFans(0);
        mMyDataBean.setMember(true);
    }

    public MyDataBean getMyDataBeans(){
        return mMyDataBean;
    }

    public String[] getSearchTag(){
        String[] text = {"兰博基尼自私","柯南","空军一号","华为GT2","iphoneXr","iphone11"};
        return text;
    }

    public void initHotSearch(){
        HotSearchBean bean = new HotSearchBean();
        bean.setHotSearchTitle("雾山五行");
        bean.setDegree(1);

        HotSearchBean bean1 = new HotSearchBean();
        bean1.setHotSearchTitle("小米10至尊版评测");
        bean1.setDegree(2);

        HotSearchBean bean2 = new HotSearchBean();
        bean2.setHotSearchTitle("小米透明电视");
        bean2.setDegree(2);

        HotSearchBean bean3 = new HotSearchBean();
        bean3.setHotSearchTitle("雷军直播回应赌约");
        bean3.setDegree(0);

        HotSearchBean bean4 = new HotSearchBean();
        bean4.setHotSearchTitle("芝加哥大规模抢劫");
        bean4.setDegree(0);

        HotSearchBean bean5 = new HotSearchBean();
        bean5.setHotSearchTitle("糖豆人");
        bean5.setDegree(2);

        HotSearchBean bean6 = new HotSearchBean();
        bean6.setHotSearchTitle("棘刺");
        bean6.setDegree(0);

        HotSearchBean bean7 = new HotSearchBean();
        bean7.setHotSearchTitle("元龙");
        bean7.setDegree(0);

        HotSearchBean bean8 = new HotSearchBean();
        bean8.setHotSearchTitle("以家人之名");
        bean8.setDegree(0);

        HotSearchBean bean9 = new HotSearchBean();
        bean9.setHotSearchTitle("光遇红狐狸");
        bean9.setDegree(0);

        hotSearchBeans.add(bean);
        hotSearchBeans.add(bean1);
        hotSearchBeans.add(bean2);
        hotSearchBeans.add(bean3);
        hotSearchBeans.add(bean4);
        hotSearchBeans.add(bean5);
        hotSearchBeans.add(bean6);
        hotSearchBeans.add(bean7);
        hotSearchBeans.add(bean8);
        hotSearchBeans.add(bean9);
    }

    public List<HotSearchBean> getHotSearchBeans(){
        return hotSearchBeans;
    }


    public void initBeInterestedData(){
        BeInterestedBean beInterestedBean = new BeInterestedBean();
        beInterestedBean.setBeInterestedImage("https://i0.hdslb.com/bfs/tag/a92c19dbc4335fd553e50e187d759b2fafee9a64.jpg@115w_115h_1c_100q.webp");
        beInterestedBean.setBeInterestedTitle("COSPLAY");

        BeInterestedBean beInterestedBean1 = new BeInterestedBean();
        beInterestedBean1.setBeInterestedImage("https://i0.hdslb.com/bfs/tag/c47710d730162f1e1c49d23e68aa0bf42b83b0e9.jpg@115w_115h_1c_100q.webp");
        beInterestedBean1.setBeInterestedTitle("游戏集锦");

        BeInterestedBean beInterestedBean2 = new BeInterestedBean();
        beInterestedBean2.setBeInterestedImage("https://i0.hdslb.com/bfs/archive/4afb90b88597f226d22fdaed28a5c4769b372fdc.png@115w_115h_1c_100q.webp");
        beInterestedBean2.setBeInterestedTitle("搞笑");

        BeInterestedBean beInterestedBean3 = new BeInterestedBean();
        beInterestedBean3.setBeInterestedImage("https://i0.hdslb.com/bfs/tag/db30d74add4aafeaf4faa1d2ddca120d1d89c52a.jpg@115w_115h_1c_100q.webp");
        beInterestedBean3.setBeInterestedTitle("风暴英雄");

        BeInterestedBean beInterestedBean4 = new BeInterestedBean();
        beInterestedBean4.setBeInterestedImage("https://i0.hdslb.com/bfs/tag/0f7b6c8c3d38382e677c1d137986a11fed8075ac.jpg@115w_115h_1c_100q.webp");
        beInterestedBean4.setBeInterestedTitle("星际争霸2");

        beInterestedBeans.add(beInterestedBean);
        beInterestedBeans.add(beInterestedBean1);
        beInterestedBeans.add(beInterestedBean2);
        beInterestedBeans.add(beInterestedBean3);
        beInterestedBeans.add(beInterestedBean4);
    }

    public List<BeInterestedBean> getBeInterestedBeans(){
        return beInterestedBeans;
    }

    public void initHaveViewedData(){
        HaveViewedBean haveViewedBean = new HaveViewedBean();
        haveViewedBean.setMiddle_Image("https://i0.hdslb.com/bfs/tag/c044d70d3c5f8e5920e19b8f5ef64d1bbcee625d.jpg@60w_60h_1c_100q.webp");
        haveViewedBean.setTitle("是在下输了");
        haveViewedBean.setTitle_time("07-31浏览");

        HaveViewedBean haveViewedBean1 = new HaveViewedBean();
        haveViewedBean1.setMiddle_Image("https://i0.hdslb.com/bfs/tag/a938e55152c022f381223490ca3547c1b29de438.jpg@60w_60h_1c_100q.webp");
        haveViewedBean1.setTitle("雷军");
        haveViewedBean1.setTitle_time("07-31浏览");

        HaveViewedBean haveViewedBean2 = new HaveViewedBean();
        haveViewedBean2.setMiddle_Image("https://i0.hdslb.com/bfs/tag/ea51d78fa24f69bfff2d21a2e99f9fc4680a3871.png@60w_60h_1c_100q.webp");
        haveViewedBean2.setTitle("vlog");
        haveViewedBean2.setTitle_time("07-08浏览");

        HaveViewedBean haveViewedBean3 = new HaveViewedBean();
        haveViewedBean3.setMiddle_Image("https://i0.hdslb.com/bfs/tag/caee81ee21fa1d830398442166be53d388ecb2ea.jpg@60w_60h_1c_100q.webp");
        haveViewedBean3.setTitle("乐高");
        haveViewedBean3.setTitle_time("07-07浏览");

        HaveViewedBean haveViewedBean4 = new HaveViewedBean();
        haveViewedBean4.setMiddle_Image("https://i0.hdslb.com/bfs/archive/f29372839c6265f38617c46c21da44feb36255b3.png@60w_60h_1c_100q.webp");
        haveViewedBean4.setTitle("明日方舟");
        haveViewedBean4.setTitle_time("06-30浏览");

        haveViewedBeans.add(haveViewedBean);
        haveViewedBeans.add(haveViewedBean1);
        haveViewedBeans.add(haveViewedBean2);
        haveViewedBeans.add(haveViewedBean3);
        haveViewedBeans.add(haveViewedBean4);
    }

    public List<HaveViewedBean> getHaveViewedBeans(){
        return haveViewedBeans;
    }
}
