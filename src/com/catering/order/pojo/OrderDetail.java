package com.catering.order.pojo;

import com.catering.base.pojo.BasePojo;

/**
 * AbstractTOrderDetail entity provides the base persistence definition of the TOrderDetail entity. @author MyEclipse Persistence Tools
 */
public class OrderDetail extends BasePojo {

    // Fields
    private Integer orderdetailid;

    private Integer orderid;

    private Integer menuid;

    private Integer menucount;

    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public OrderDetail() {
    }

    /**
     * minimal constructor
     */
    public OrderDetail(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    /**
     * full constructor
     */
    public OrderDetail(Integer orderdetailid, Integer orderid, Integer menuid, Integer menucount, String remark) {
        this.orderdetailid = orderdetailid;
        this.orderid = orderid;
        this.menuid = menuid;
        this.menucount = menucount;
        this.remark = remark;
    }

    // Property accessors
    public Integer getOrderdetailid() {
        return this.orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Integer getOrderid() {
        return this.orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getMenuid() {
        return this.menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getMenucount() {
        return this.menucount;
    }

    public void setMenucount(Integer menucount) {
        this.menucount = menucount;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
