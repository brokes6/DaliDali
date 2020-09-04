package com.example.dildil.video.model;

import com.example.dildil.api.ApiEngine;
import com.example.dildil.video.bean.CoinBean;
import com.example.dildil.video.bean.CollectionBean;
import com.example.dildil.video.bean.CommentDetailBean;
import com.example.dildil.video.bean.ThumbsUpBean;
import com.example.dildil.video.bean.VideoDetailsBean;
import com.example.dildil.video.bean.dto;
import com.example.dildil.video.contract.VideoDetailsContract;

import io.reactivex.Observable;

public class VideoDetailsModel implements VideoDetailsContract.Model {
    @Override
    public Observable<VideoDetailsBean> getVideoDetails(int id, int uid) {
        return ApiEngine.getInstance().getApiService().getVideoDetails(id, uid);
    }

    @Override
    public Observable<CoinBean> getCoinOperated(dto bean, int uid) {
        return ApiEngine.getInstance().getApiService().coin_Operated(bean,uid);
    }

    @Override
    public Observable<ThumbsUpBean> getThumbsUp(String url, dto dto) {
        return ApiEngine.getInstance().getApiService().thumbsUp(url,dto);
    }

    @Override
    public Observable<CollectionBean> CollectionVideo(dto dto) {
        return ApiEngine.getInstance().getApiService().CollectionVideo(dto);
    }

    @Override
    public Observable<CommentDetailBean> getVideoComment(int id, int num, int size, int uid) {
        return ApiEngine.getInstance().getApiService().getVideoComment(id,num,size,uid);
    }
}
