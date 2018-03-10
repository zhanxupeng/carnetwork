package com.mr.controller.business.mycar.view;

import com.mr.entity.MyCar;

import java.util.Date;

public class CarInformationVM {
    private String licensePlate;

    private String business;

    private String level;

    private String carBody;

    private String output;

    private Date buyTime;

    private String photo;

    public CarInformationVM(MyCar myCar){
        this.licensePlate=myCar.getLicensePlate();
        this.business=myCar.getBusiness();
        this.level=myCar.getLevel();
        this.carBody=myCar.getCarBody();
        this.output=myCar.getOutput();
        this.buyTime=myCar.getBuyTime();
        this.photo=myCar.getPhoto();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
