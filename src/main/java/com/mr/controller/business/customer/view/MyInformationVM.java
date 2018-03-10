package com.mr.controller.business.customer.view;

import com.mr.entity.Customer;

import java.util.Date;

public class MyInformationVM {
    private String userName;

    private String nickName;

    private String headPicture;

    private Byte sex;

    private String city;

    private String autograph;

    private Integer activeValue;

    private Date latestActiveDate;

    private Date latestLoginDate;

    private Integer continueActiveCount;
    public MyInformationVM(Customer customer){
        this.userName=customer.getUserName();
        this.nickName=customer.getNickName();
        this.headPicture=customer.getHeadPicture();
        this.sex=customer.getSex();
        this.city=customer.getCity();
        this.autograph=customer.getAutograph();
        this.activeValue=customer.getActiveValue();
        this.latestActiveDate=customer.getLatestActiveDate();
        this.latestLoginDate=customer.getLatestLoginDate();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadPicture() {
        return headPicture;
    }

    public void setHeadPicture(String headPicture) {
        this.headPicture = headPicture;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public Integer getActiveValue() {
        return activeValue;
    }

    public void setActiveValue(Integer activeValue) {
        this.activeValue = activeValue;
    }

    public Date getLatestActiveDate() {
        return latestActiveDate;
    }

    public void setLatestActiveDate(Date latestActiveDate) {
        this.latestActiveDate = latestActiveDate;
    }

    public Date getLatestLoginDate() {
        return latestLoginDate;
    }

    public void setLatestLoginDate(Date latestLoginDate) {
        this.latestLoginDate = latestLoginDate;
    }

    public Integer getContinueActiveCount() {
        return continueActiveCount;
    }

    public void setContinueActiveCount(Integer continueActiveCount) {
        this.continueActiveCount = continueActiveCount;
    }
}
