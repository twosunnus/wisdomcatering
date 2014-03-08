package com.catering.order.pojo;

import com.catering.base.pojo.BasePojo;

import java.sql.Timestamp;

/**
 * AbstractTBuy entity provides the base persistence definition of the TBuy entity. @author MyEclipse Persistence Tools
 */
public class Buy extends BasePojo {

    // Fields
    private String wechatOpenid;

    private Integer restaurantcode;

    private Integer menuid;

    private Integer buycount;

    private Timestamp createdate;

    // Constructors

    /**
     * default constructor
     */
    public Buy() {
    }

    /**
     * minimal constructor
     */
    public Buy(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    /**
     * full constructor
     */
    public Buy(String wechatOpenid, Integer restaurantcode, Integer menuid, Integer buycount, Timestamp createdate) {
        this.wechatOpenid = wechatOpenid;
        this.restaurantcode = restaurantcode;
        this.menuid = menuid;
        this.buycount = buycount;
        this.createdate = createdate;
    }

    // Property accessors
    public String getWechatOpenid() {
        return this.wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid;
    }

    public Integer getRestaurantcode() {
        return this.restaurantcode;
    }

    public void setRestaurantcode(Integer restaurantcode) {
        this.restaurantcode = restaurantcode;
    }

    public Integer getMenuid() {
        return this.menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public Integer getBuycount() {
        return this.buycount;
    }

    public void setBuycount(Integer buycount) {
        this.buycount = buycount;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }
}
