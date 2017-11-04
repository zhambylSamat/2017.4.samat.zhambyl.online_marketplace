package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.sdu.project.controller.register.AuthRegister;
import kz.sdu.project.stand.register_stand_impl.db.Db;
import kz.sdu.project.controller.model.UserInfo;

@Bean
public class AuthRegisterStandImpl implements AuthRegister {
    public BeanGetter<Db> db;
    private Long local_id;

    @Override
    public UserInfo checkUserListDetails(String username, String password) {

        UserInfo ret = new UserInfo();
        for(Long id : db.get().userStorage.keySet()) {
//            System.out.println(db.get().userStorage.get(id).username.equals(username)+" "+db.get().userStorage.get(id).username.equals(password));
            if (db.get().userStorage.get(id).username.equals(username) && db.get().userStorage.get(id).password.equals(password)) {
                System.out.println(db.get().userStorage.get(id).registered);
                if (db.get().userStorage.get(id).registered) {
                    ret.firstName = db.get().userStorage.get(id).firstName;
                    ret.lastName = db.get().userStorage.get(id).lastName;
                    ret.role = db.get().userStorage.get(id).role;
                    ret.username = username;
//                    return ret;
                    break;
                }
                else {
                    ret.msg = "Please check your email to accept account";
//                    return ret;
                    break;
                }
            }
        }
//        db.get().userStorage.values().forEach(val->{
//            if(val.username.equals(username) && val.password.equals(password)) {
//                ret.firstName = val.firstName;
//                ret.lastName = val.lastName;
//                ret.role = val.role;
//                ret.username = username;
//            }
//        });
//
        return ret;
    }
}
