package com.example.Banner.Entity;

public class BizBannerInfo {
    private String actionType;
    private String bizId;
    private String offeringCategory;
    private String url;

    public BizBannerInfo() {
    }

    public BizBannerInfo(String actionType, String bizId, String offeringCategory, String url) {
        this.actionType = actionType;
        this.bizId = bizId;
        this.offeringCategory = offeringCategory;
        this.url = url;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getOfferingCategory() {
        return offeringCategory;
    }

    public void setOfferingCategory(String offeringCategory) {
        this.offeringCategory = offeringCategory;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "BizBannerInfo{" +
                "actionType='" + actionType + '\'' +
                ", bizId='" + bizId + '\'' +
                ", offeringCategory='" + offeringCategory + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}




