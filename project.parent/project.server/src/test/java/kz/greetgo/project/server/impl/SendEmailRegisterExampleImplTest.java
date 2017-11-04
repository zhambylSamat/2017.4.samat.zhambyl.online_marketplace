package kz.greetgo.project.server.impl;

import impl.SendEmailRegisterExampleImpl;
import kz.greetgo.depinject.core.BeanGetter;
import kz.greetgo.depinject.testng.AbstractDepinjectTestNg;
import kz.greetgo.depinject.testng.ContainerConfig;
import kz.greetgo.project.server.test.util.BeanConfigMainServerPostrgresTest;
import kz.sdu.project.controller.register.SendEmailRegisterExample;
import org.testng.annotations.Test;

@ContainerConfig(BeanConfigMainServerPostrgresTest.class)
public class SendEmailRegisterExampleImplTest extends AbstractDepinjectTestNg {
    public BeanGetter<SendEmailRegisterExample> sendEmailRegister;

//    @Test testToSend() and testPrepareSendMail()
    @Test
    public void testToSend() throws Exception {
        sendEmailRegister.get().toSend();
    }

    @Test
    public void testPrepareSendEmail() throws Exception {
        sendEmailRegister.get().prepareSendMail();
    }
}
