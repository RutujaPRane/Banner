package com.example.Banner.Entity;

import java.util.List;

public class BizBannerLocation {
    private List<Banner> banners;
    private CustomDateTime createdDateTime;
    private String id;
    private LatLng latLng;
    private Long timerInMs;
    private CustomDateTime updatedDateTime;

    public BizBannerLocation() {
    }

    public BizBannerLocation(List<Banner> banners, CustomDateTime createdDateTime, String id, LatLng latLng, Long timerInMs, CustomDateTime updatedDateTime) {
        this.banners = banners;
        this.createdDateTime = createdDateTime;
        this.id = id;
        this.latLng = latLng;
        this.timerInMs = timerInMs;
        this.updatedDateTime = updatedDateTime;
    }



    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public CustomDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(CustomDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LatLng getLatLng() {
        return latLng;
    }

    public void setLatLng(LatLng latLng) {
        this.latLng = latLng;
    }

    public Long getTimerInMs() {
        return timerInMs;
    }

    public void setTimerInMs(Long timerInMs) {
        this.timerInMs = timerInMs;
    }

    public CustomDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(CustomDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    @Override
    public String toString() {
        return "BizBannerLocation{" +
                "banners=" + banners +
                ", createdDateTime=" + createdDateTime +
                ", id='" + id + '\'' +
                ", latLng=" + latLng +
                ", timerInMs=" + timerInMs +
                ", updatedDateTime=" + updatedDateTime +
                '}';
    }
}
