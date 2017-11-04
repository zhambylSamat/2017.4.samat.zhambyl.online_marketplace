package impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;
import kz.sdu.project.controller.register.SendEmailRegisterExample;

@Bean
public class SendEmailRegisterExampleImpl implements SendEmailRegisterExample {

    public BeanGetter<EmailSender> emailSender;

    public BeanGetter<EmailSenderController> emailSenderController;

    @Override
    public void toSend() {
        emailSenderController.get().sendAllExistingEmails();
    }

    @Override
    public void prepareSendMail() {
        Email email = new Email();
        email.setFrom("zhambyl.9670@gmail.com");
        email.setTo("140103058@stu.sdu.edu.kz");
        email.setSubject("Test server Email");
        email.setBody("Message text");
        emailSender.get().send(email);
    }
}
