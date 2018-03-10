package com.mr.entity;

import com.mr.common.base.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class MyWarn extends BaseModel{
    private Byte warnType;

    private Integer myCarId;

    private Integer myTripId;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Date currentTime;

    public Byte getWarnType() {
        return warnType;
    }

    public void setWarnType(Byte warnType) {
        this.warnType = warnType;
    }

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