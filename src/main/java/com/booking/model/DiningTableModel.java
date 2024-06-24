package com.booking.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "dining_table")
public class DiningTableModel {
    public DiningTableModel() {
        create_date = new Date();
        update_date = new Date();
    }

    @Id
    @Column(name = "din_code")
    private String dinCode;

    @Column(name = "din_position")
    private int dinPosition;

    @Column(name = "qty")
    private int qty;
    
    @Column(name = "total")
    private int total;
    
    @Column(name = "status")
    private String status;    

    @Column(name = "create_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date create_date;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date update_date;

    @Column(name = "update_by")
    private String updateBy;

    public String getDinCode() {
        return dinCode;
    }

    public void setDinCode(String dinCode) {
        this.dinCode = dinCode;
    }

    public int getDinPosition() {
        return dinPosition;
    }

    public void setDinPosition(int dinPosition) {
        this.dinPosition = dinPosition;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
