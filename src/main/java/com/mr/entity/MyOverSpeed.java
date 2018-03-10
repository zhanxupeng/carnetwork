package com.mr.entity;

import com.mr.common.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class MyOverSpeed extends BaseModel{
    private Integer myCarId;

    private Integer myTripId;

    private BigDecimal speed;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Date currentTime;

    public Integer getMyCarId() {
        return myCarId;
    }

    public void setMyCarId(Integer myCarId) {
        this.myCarId = myCarId;
    }

    public Integer getMyTripId() {
        return myTripId;
    }

    public void setMyTripId(Integer myTripId) {
        this.myTripId = myTripId;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
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