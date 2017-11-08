package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.conf.hot.DefaultBoolValue;
import kz.greetgo.conf.hot.DefaultStrValue;
import kz.greetgo.conf.hot.Description;

public interface MyConfig {
    @DefaultStrValue("crm.zhambyl@gmail.com")
    @Description("Login of account")
    String loginAccount();

    @DefaultStrValue("crm.zhambyl_password")
    @Description("Password of account")
    String accountPassword();

    @DefaultBoolValue(true)
    @Description("Nuzhno li otpravliat' email?")
    boolean needToSendEmail();
}
