package kz.sdu.project.stand.util;

import kz.greetgo.depinject.core.Bean;

import java.util.Map;

@Bean
public class StandCommonConstant {
    private String username;
    private String password;
    private Boolean isSend;
    public StandCommonConstant(String username, String password, Boolean isSend) {
        this.username = username;
        this.password = password;
        this.isSend = isSend;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getSend() {
        return isSend;
    }

    public void setSend(Boolean send) {
        isSend = send;
    }
    //    public String username = "crm.zhambyl@gmail.com";
//    public String password = "crm.zhambyl_password";
}
