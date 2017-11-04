package kz.sdu.project.controller.controller;


import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.mvc.annotations.Mapping;
import kz.greetgo.mvc.annotations.ParPath;
import kz.sdu.project.controller.register.SendEmailRegisterExample;
import kz.sdu.project.controller.register.UserRegister;
import kz.sdu.project.controller.utils.Controller;

@Bean
@Mapping("/email")
public class EmailSendController implements Controller {
//    SendEmailRegisterExampleImplTest sendEmailRegisterExampleImplTest = new SendEmailRegisterExample();
//    public BeanGetter<SendEmailRegisterExample> sendEmailRegisterExample;
//    public BeanGetter<ClientRegister> clientRegister;
//    @Mapping("/{genNumber}")
//    public void sendedEmail(@ParPath("genNumber") String genNumber){
//        sendEmailRegisterExample.get().toSend();
//    }
//    @Mapping("/send")
//    public void sendEmail(){
//        sendEmailRegisterExample.get().toSend();
//    }
    public BeanGetter<UserRegister> userRegisterBeanGetter;

    @Mapping("/generateNumber")
    public void sendEmail(@ParPath("generateNumber") String number){
        
    }
}
