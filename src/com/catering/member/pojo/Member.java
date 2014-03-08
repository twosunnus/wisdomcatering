package com.catering.member.pojo;

import com.catering.common.pojo.CommonPojo;

import java.sql.Timestamp;

/**
 * AbstractTMember entity provides the base persistence definition of the TMember entity. @author MyEclipse Persistence Tools
 */
public class Member extends CommonPojo {

    // Fields
    private Integer memberid;

    private Integer subscribe;

    private String wechatAccount;

    private String restaurantWechat;

    private String nickname;

    private String openid;

    private String sex;

    private String phone;

    private String headimgurl;

    private Timestamp subscribetime;

    private String city;

    private String country;

    private String province;

    private Integer memberlevel;

    // Constructors

    /**
     * default constructor
     */
    public Member() {
    }

    /**
     * minimal constructor
     */
    public Member(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * full constructor
     */
    public Member(Integer memberid, Integer subscribe, String wechatAccount, String restaurantWechat, String nickname, String openid, String sex,
                  String phone, String headimgurl, Timestamp subscribetime, String city, String country, String province, Integer memberlevel, Timestamp createdate,
                  Integer validflag, Integer delflag, Timestamp lastmodifydate) {
        this.memberid = memberid;
        this.subscribe = subscribe;
        this.wechatAccount = wechatAccount;
        this.restaurantWechat = restaurantWechat;
        this.nickname = nickname;
        this.openid = openid;
        this.sex = sex;
        this.phone = phone;
        this.headimgurl = headimgurl;
        this.subscribetime = subscribetime;
        this.city = city;
        this.country = country;
        this.province = province;
        this.memberlevel = memberlevel;
        this.createDate = createdate;
        this.validFlag = validflag;
        this.delFlag = delflag;
        this.lastModifyDate = lastmodifydate;
    }

    // Property accessors
    public Integer getMemberid() {
        return this.memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public Integer getSubscribe() {
        return this.subscribe;
    }

    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }

    public String getWechatAccount() {
        return this.wechatAccount;
    }

    public void setWechatAccount(String wechatAccount) {
        this.wechatAccount = wechatAccount;
    }

    public String getRestaurantWechat() {
        return this.restaurantWechat;
    }

    public void setRestaurantWechat(String restaurantWechat) {
        this.restaurantWechat = restaurantWechat;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getOpenid() {
        return this.openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHeadimgurl() {
        return this.headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public Timestamp getSubscribetime() {
        return this.subscribetime;
    }

    public void setSubscribetime(Timestamp subscribetime) {
        this.subscribetime = subscribetime;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getMemberlevel() {
        return this.memberlevel;
    }

    public void setMemberlevel(Integer memberlevel) {
        this.memberlevel = memberlevel;
    }

}
