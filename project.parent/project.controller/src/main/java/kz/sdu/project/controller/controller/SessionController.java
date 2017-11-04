package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.model.SessionInfo;
import kz.sdu.project.controller.register.SessionRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/session")
public class SessionController implements Controller {

    public BeanGetter<SessionRegister> sessionRegister;

    @ToJson
    @Mapping("/get")
    public SessionInfo getSession(@Par("key") String key) {
        return sessionRegister.get().getSession(key);
    }

    @ToJson
    @Mapping("/set")
    public String setSession(@Par("key") String key, @Par("value") String value){
        return sessionRegister.get().setSession(key, value);
    }
}
