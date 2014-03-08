package com.catering.common.pojo;

import com.catering.base.pojo.BasePojo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: sunqichang
 * @Date: 14-3-7
 * @Time: 下午7:28
 */
public class CommonPojo extends BasePojo {

    protected int validFlag;// 有效标志

    protected int delFlag; // 删除标志

    protected Date createDate;// 创建时间

    protected String createUserId;// 创建人

    protected Date lastModifyDate;// 最后修改时间

    protected String lastModifyUserId;// 最后修改人员

    public int getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(int validFlag) {
        this.validFlag = validFlag;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public String getLastModifyUserId() {
        return lastModifyUserId;
    }

    public void setLastModifyUserId(String lastModifyUserId) {
        this.lastModifyUserId = lastModifyUserId;
    }
}
