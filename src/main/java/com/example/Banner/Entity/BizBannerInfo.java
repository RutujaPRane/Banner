package com.example.Banner.Entity;

public class BizBannerInfo {
    private String actionType;
    private String bixId;
    private String offeringCategory;
    private String url;

    public BizBannerInfo() {
    }

    public BizBannerInfo(String actionType, String bixId, String offeringCategory, String url) {
        this.actionType = actionType;
        this.bixId = bixId;
        this.offeringCategory = offeringCategory;
        this.url = url;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getBixId() {
        return bixId;
    }

    public void setBixId(String bixId) {
        this.bixId = bixId;
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
                ", bixId='" + bixId + '\'' +
                ", offeringCategory='" + offeringCategory + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}




