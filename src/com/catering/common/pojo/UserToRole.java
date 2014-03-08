package com.catering.common.pojo;

import com.catering.base.pojo.BasePojo;

/**
 * AbstractTUsertoroleId entity provides the base persistence definition of the TUsertoroleId entity. @author MyEclipse Persistence Tools
 */
public class UserToRole extends BasePojo {

    // Fields
    private Integer roleId;

    private Integer userid;

    // Constructors

    /**
     * default constructor
     */
    public UserToRole() {
    }

    /**
     * full constructor
     */
    public UserToRole(Integer roleid, Integer userid) {
        this.roleId = roleid;
        this.userid = userid;
    }

    // Property accessors
    public Integer getRoleid() {
        return this.roleId;
    }

    public void setRoleid(Integer roleid) {
        this.roleId = roleid;
    }

    public Integer getUserid() {
        return this.userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}
