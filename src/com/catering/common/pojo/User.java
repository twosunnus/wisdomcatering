package com.catering.common.pojo;

import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * AbstractTUser entity provides the base persistence definition of the TUser entity. @author MyEclipse Persistence Tools
 */
@Entity
public class User extends CommonPojo {

    // Fields
    private Integer userid;

    private String name;

    private String loginname;

    private String password;

    private String companycode;

    private String companyname;

    private String restaurantcode;

    private String restaurantname;

    private String phone;

    private String mobilephone;

    private String address;

    private String email;

    private String restaurantpep;

    private Double amount;

    private Timestamp createdate;

    private Integer validflag;

    private Integer delflag;

    private Timestamp lastmodifydate;

    // Constructors

    /**
     * default constructor
     */
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * minimal constructor
     */
    public User(String loginname) {
        this.loginname = loginname;
    }

    /**
     * full constructor
     */
    public User(String loginname, String companycode, String companyname, String restaurantcode, String restaurantname, String phone,
                String mobilephone, String address, String email, String restaurantpep, Double amount, Timestamp createdate, Integer validflag, Integer delflag,
                Timestamp lastmodifydate) {
        this.loginname = loginname;
        this.companycode = companycode;
        this.companyname = companyname;
        this.restaurantcode = restaurantcode;
        this.restaurantname = restaurantname;
        this.phone = phone;
        this.mobilephone = mobilephone;
        this.address = address;
        this.email = email;
        this.restaurantpep = restaurantpep;
        this.amount = amount;
        this.createdate = createdate;
        this.validflag = validflag;
        this.delflag = delflag;
        this.lastmodifydate = lastmodifydate;
    }

    // Property accessors
    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return this.loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getCompanycode() {
        return this.companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public String getCompanyname() {
        return this.companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getRestaurantcode() {
        return this.restaurantcode;
    }

    public void setRestaurantcode(String restaurantcode) {
        this.restaurantcode = restaurantcode;
    }

    public String getRestaurantname() {
        return this.restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilephone() {
        return this.mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRestaurantpep() {
        return this.restaurantpep;
    }

    public void setRestaurantpep(String restaurantpep) {
        this.restaurantpep = restaurantpep;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getCreatedate() {
        return this.createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public Integer getValidflag() {
        return this.validflag;
    }

    public void setValidflag(Integer validflag) {
        this.validflag = validflag;
    }

    public Integer getDelflag() {
        return this.delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public Timestamp getLastmodifydate() {
        return this.lastmodifydate;
    }

    public void setLastmodifydate(Timestamp lastmodifydate) {
        this.lastmodifydate = lastmodifydate;
    }
}
