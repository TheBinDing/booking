package com.booking.dto;

public class DiningTable {
    private String dinCode;
    private int total;
    private int qty;
    private String status;
    private String user;

    public String getDinCode() {
        return dinCode;
    }
    public void setDinCode(String dinCode) {
        this.dinCode = dinCode;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
}
