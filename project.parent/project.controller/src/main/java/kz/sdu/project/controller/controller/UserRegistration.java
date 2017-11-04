package kz.sdu.project.controller.controller;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.Par;
import kz.greetgo.mvc.annotations.ParPath;
import kz.greetgo.mvc.annotations.ToJson;
import kz.sdu.project.controller.register.UserRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/registration")
public class UserRegistration implements Controller {
    public BeanGetter<UserRegister> userRegisterBeanGetter;

    @ToJson
    @Mapping("/userRegister")
    public String registerUser(@Par("username") String username,
                               @Par("firstName") String firstName,
                               @Par("lastName") String lastName,
                               @Par("password") String password){
        System.out.println("SENDED");
        System.out.println(username+" "+firstName+" "+lastName+" "+password);
        String result = userRegisterBeanGetter.get().registerUserByEmail(username, firstName, lastName, password, "user");
        System.out.println(result);
        return result;
    }

//    @Mapping("/{generatedNumber}")
//    public void checkUser(@ParPath("generatedNumber") String num){
//        System.out.println(num);
//        String username = userRegisterBeanGetter.get().checkAndAcceptUser(num);
//        System.out.println(username);
//    }
}
//?username=140103058@stu.sdu.edu.kz&firstName=zhambyl&lastName=samat&password=123456