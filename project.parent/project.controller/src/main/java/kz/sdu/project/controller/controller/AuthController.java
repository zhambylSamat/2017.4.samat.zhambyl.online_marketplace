package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.model.UserInfo;
import kz.sdu.project.controller.register.AuthRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/auth")
public class AuthController implements Controller {
    public BeanGetter<AuthRegister> userRegister;

    @ToJson
    @Mapping("/check")
    public UserInfo checkUser(@Par("username") String username, @Par("password") String password){
        return userRegister.get().checkUserListDetails(username, password);
    }
}
