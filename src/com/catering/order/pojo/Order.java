package com.catering.order.pojo;

import com.catering.common.pojo.CommonPojo;

import java.sql.Timestamp;

/**
 * AbstractTOrder entity provides the base persistence definition of the TOrder entity. @author MyEclipse Persistence Tools
 */
public class Order extends CommonPojo {

    // Fields
    private Integer orderid;

    private String wechatOpenid;

    private Integer restaurantid;

    private Integer orderstatus;

    private Timestamp paytime;

    private Double payableAmount;

    private Double discount;

    private Double actualAmount;

    private Double huiAmount;

    // Constructors

    /**
     * default constructor
     */
    public Order() {
    }

    /**
     * minimal constructor
     */
    public Order(Integer orderid) {
        this.orderid = orderid;
    }

    /**
     * full constructor
     */
    public Order(Integer orderid, String wechatOpenid, Integer restaurantid, Integer orderstatus, Timestamp paytime, Double payableAmount,
                 Double discount, Double actualAmount, Double huiAmount, Timestamp createdate, Integer validflag, Integer deflag, Timestamp lastmodifydate) {
        this.orderid = orderid;
        this.wechatOpenid = wechatOpenid;
        this.restaurantid = restaurantid;
        this.orderstatus = orderstatus;
        this.paytime = paytime;
        this.payableAmount = payableAmount;
        this.discount = discount;
        this.actualAmount = actualAmount;
        this.huiAmount = huiAmount;
        this.createDate = createdate;
        this.validFlag = validflag;
        this.delFlag = deflag;
        this.lastModifyDate = lastmodifydate;
    }

    // Property accessors
    public Integer getOrderid() {
        return this.orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getWechatOpenid() {
        return this.wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    public Integer getRestaurantid() {
        return this.restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public Integer getOrderstatus() {
        return this.orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Timestamp getPaytime() {
        return this.paytime;
    }

    public void setPaytime(Timestamp paytime) {
        this.paytime = paytime;
    }

    public Double getPayableAmount() {
        return this.payableAmount;
    }

    public void setPayableAmount(Double payableAmount) {
        this.payableAmount = payableAmount;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getActualAmount() {
        return this.actualAmount;
    }

    public void setActualAmount(Double actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Double getHuiAmount() {
        return this.huiAmount;
    }

    public void setHuiAmount(Double huiAmount) {
        this.huiAmount = huiAmount;
    }

}
