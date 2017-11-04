package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.conf.hot.DefaultBoolValue;
import kz.greetgo.conf.hot.DefaultStrValue;
import kz.greetgo.conf.hot.Description;

public interface MyConfig {
    @DefaultStrValue("login@gmail.com")
    @Description("Login of account")
    String loginAccount();

    @DefaultStrValue("12345")
    @Description("Password of account")
    String accountPassword();

    @DefaultBoolValue(false)
    @Description("Nuzhno li otpravliat' email?")
    boolean needToSendEmail();
}
