package com.example.Banner.Entity;

public class Banner {
    private String aspectRatio;
    private BizBannerInfo bizBannerInfo;
    private String imgPath;

    public Banner() {
    }

    public Banner(String aspectRatio, BizBannerInfo bizBannerInfo, String imgPath) {
        this.aspectRatio = aspectRatio;
        this.bizBannerInfo = bizBannerInfo;
        this.imgPath = imgPath;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public BizBannerInfo getBizBannerInfo() {
        return bizBannerInfo;
    }

    public void setBizBannerInfo(BizBannerInfo bizBannerInfo) {
        this.bizBannerInfo = bizBannerInfo;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Banner{" +
                "aspectRatio='" + aspectRatio + '\'' +
                ", bizBannerInfo=" + bizBannerInfo +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }
}
