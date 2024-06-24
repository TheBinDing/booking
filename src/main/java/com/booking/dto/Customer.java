package com.booking.dto;

public class Customer {
    private String cusCode;
    private String cusName;
    private String cusLname;
    private int age;
    private String birthday;
    private String customer;
    
    public String getCusCode() {
        return cusCode;
    }
    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }
    public String getCusName() {
        return cusName;
    }
    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
    public String getCusLname() {
        return cusLname;
    }
    public void setCusLname(String cusLname) {
        this.cusLname = cusLname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
