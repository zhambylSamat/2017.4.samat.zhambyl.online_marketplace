package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.project.controller.model.SessionInfo;
import kz.sdu.project.controller.register.SessionRegister;
import kz.sdu.project.stand.register_stand_impl.db.Db;

@Bean
public class SessionRegisterStandImpl implements SessionRegister {

    public BeanGetter<Db> db;

    @Override
    public SessionInfo getSession(String key) {
        return db.get().sessionStorage.get(key);
    }

    @Override
    public String setSession(String key, String value) {
        SessionInfo tmpVal = new SessionInfo();
        tmpVal.sessionKey = key;
        tmpVal.sessionValue = value;
        db.get().sessionStorage.put(key,tmpVal);
        return "success";
    }
}
