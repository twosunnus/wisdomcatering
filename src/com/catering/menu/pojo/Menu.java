package com.catering.menu.pojo;

import com.catering.common.pojo.CommonPojo;

import java.sql.Timestamp;

/**
 * AbstractTMenu entity provides the base persistence definition of the TMenu entity. @author MyEclipse Persistence Tools
 */
public class Menu extends CommonPojo {

    // Fields
    private Integer menuid;

    private String menuname;

    private Double price;

    private String menutype;

    private String cuisines;

    private String hotlevel;

    private Integer star;

    private String remark;

    // Constructors

    /**
     * default constructor
     */
    public Menu() {
    }

    /**
     * minimal constructor
     */
    public Menu(Integer menuid) {
        this.menuid = menuid;
    }

    /**
     * full constructor
     */
    public Menu(Integer menuid, String menuname, Double price, String menutype, String cuisines, String hotlevel, Integer star, String remark,
                Timestamp createdate, Integer validflag, Integer delflag, Timestamp lastmodifydate) {
        this.menuid = menuid;
        this.menuname = menuname;
        this.price = price;
        this.menutype = menutype;
        this.cuisines = cuisines;
        this.hotlevel = hotlevel;
        this.star = star;
        this.remark = remark;
        this.createDate = createdate;
        this.validFlag = validflag;
        this.delFlag = delflag;
        this.lastModifyDate = lastmodifydate;
    }

    // Property accessors
    public Integer getMenuid() {
        return this.menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return this.menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMenutype() {
        return this.menutype;
    }

    public void setMenutype(String menutype) {
        this.menutype = menutype;
    }

    public String getCuisines() {
        return this.cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getHotlevel() {
        return this.hotlevel;
    }

    public void setHotlevel(String hotlevel) {
        this.hotlevel = hotlevel;
    }

    public Integer getStar() {
        return this.star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
