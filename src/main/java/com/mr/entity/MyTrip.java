package com.mr.entity;

import com.mr.common.base.BaseModel;

import java.math.BigDecimal;

public class MyTrip extends BaseModel{
    private Integer myCarId;

    private BigDecimal startLongitude;

    private BigDecimal startLatitude;

    private BigDecimal endLongitude;

    private BigDecimal endLatitude;

    private BigDecimal startOil;

    private BigDecimal endOil;

    private BigDecimal mileage;

    public Integer getMyCarId() {
        return myCarId;
    }

    public void setMyCarId(Integer myCarId) {
        this.myCarId = myCarId;
    }

    public BigDecimal getStartLongitude() {
        return startLongitude;
    }

    public void setStartLongitude(BigDecimal startLongitude) {
        this.startLongitude = startLongitude;
    }

    public BigDecimal getStartLatitude() {
        return startLatitude;
    }

    public void setStartLatitude(BigDecimal startLatitude) {
        this.startLatitude = startLatitude;
    }

    public BigDecimal getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(BigDecimal endLongitude) {
        this.endLongitude = endLongitude;
    }

    public BigDecimal getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(BigDecimal endLatitude) {
        this.endLatitude = endLatitude;
    }

    public BigDecimal getStartOil() {
        return startOil;
    }

    public void setStartOil(BigDecimal startOil) {
        this.startOil = startOil;
    }

    public BigDecimal getEndOil() {
        return endOil;
    }

    public void setEndOil(BigDecimal endOil) {
        this.endOil = endOil;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }
}