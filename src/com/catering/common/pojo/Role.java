package com.catering.common.pojo;

import java.sql.Timestamp;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: sunqichang
 * @Date: 14-3-7
 * @Time: 下午8:03
 */
public class Role extends CommonPojo {
    private Integer roleId;
    private String roleName;

    public Role(Integer roleid, String rolename, Timestamp createdate, Timestamp lastmodifydate, Integer delflag, Integer validflag) {
        this.roleId = roleid;
        this.roleName = rolename;
        this.createDate = createdate;
        this.lastModifyDate = lastmodifydate;
        this.delFlag = delflag;
        this.validFlag = validflag;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
