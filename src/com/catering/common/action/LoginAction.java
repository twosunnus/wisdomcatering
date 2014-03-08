package com.catering.common.action;

import com.catering.common.service.CommonServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: sunqichang
 * @Date: 14-3-8
 * @Time: 上午12:35
 */
@Controller
public class LoginAction {
    private String user;
    private CommonServiceImpl login;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setLogin(CommonServiceImpl login) {
        this.login = login;
    }

    public CommonServiceImpl getLogin() {
        return login;
    }
}
