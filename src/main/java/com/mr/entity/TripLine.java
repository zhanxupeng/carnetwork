package com.mr.entity;

import com.mr.common.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class TripLine extends BaseModel{

    private Integer myTripId;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Date currentTime;

    public Integer getMyTripId() {
        return myTripId;
    }

    public void setMyTripId(Integer myTripId) {
        this.myTripId = myTripId;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }
}