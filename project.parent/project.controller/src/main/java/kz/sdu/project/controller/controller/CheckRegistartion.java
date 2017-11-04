package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ParPath;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.register.UserRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/check")
public class CheckRegistartion implements Controller {

    public BeanGetter<UserRegister> userRegisterBeanGetter;

    @ToJson
    @Mapping("/{generatedNumber}")
    public String checkUser(@ParPath("generatedNumber") String num){
        System.out.println(num);
        String res = userRegisterBeanGetter.get().checkAndAcceptUser(num);
        System.out.println(res);
        return res;
    }
}
