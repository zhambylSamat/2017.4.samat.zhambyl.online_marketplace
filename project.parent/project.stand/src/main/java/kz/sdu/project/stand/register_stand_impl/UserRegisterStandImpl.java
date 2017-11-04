package kz.sdu.project.stand.register_stand_impl;

import kz.greetgo.depinject.core.Bean;
import kz.greetgo.depinject.core.BeanGetter;
//import kz.greetgo.email.Email;
//import kz.greetgo.email.EmailSender;
//import kz.greetgo.email.EmailSenderController;
import kz.greetgo.email.Email;
import kz.greetgo.email.EmailSender;
import kz.greetgo.email.EmailSenderController;
import kz.sdu.project.controller.register.UserRegister;
import kz.sdu.project.stand.register_stand_impl.db.Db;
import kz.sdu.project.stand.register_stand_impl.model.LinkStorageDTO;
import kz.sdu.project.stand.register_stand_impl.model.UserDTO;

import java.util.Random;

@Bean
public class UserRegisterStandImpl implements UserRegister {
    public BeanGetter<Db> db;
    public BeanGetter<EmailSender> emailSenderBeanGetter;
    public BeanGetter<EmailSenderController> emailSenderControllerBeanGetter;
    public Long local_id;

    @Override
    public String registerUserByEmail(String username, String firstName, String lastName, String password, String role) {
        boolean reg = false;
        for(Long id : db.get().userStorage.keySet()){
            UserDTO tmpUser = db.get().userStorage.get(id);
//            System.out.println("Stand username: "+tmpUser.username);
//            System.out.println("GET username: "+username);
            if(tmpUser.username.equals(username)){
                reg = true;
                if(tmpUser.registered){
                    return "W^Accaunt with "+username+" has been already registered!";
                }
                else{
                    db.get().linkStorage.remove(id);
                    sendToEmail(username,getLink(username, local_id));
                    return "S^Check email to confirm your accaunt! (Email: )"+username;
                }
            }
        }
        if(!reg) {
            local_id = (Long) db.get().userSeq.getAndIncrement();
            UserDTO tmpUser = new UserDTO();
            tmpUser.userId = local_id;
            tmpUser.username = username;
            tmpUser.firstName = firstName;
            tmpUser.lastName = lastName;
            tmpUser.password = password;
            tmpUser.role = role;
            tmpUser.registered = false;
            db.get().userStorage.put(local_id, tmpUser);

            sendToEmail(username,getLink(username, local_id));
            return String.format("S^Please check your email for confirm your registration. (Email: %s)",username);
        }
        else return "E^Something is happen. Please try again!";
    }

    @Override
    public String checkAndAcceptUser(String genNumber) {
        Long local_id = null;
        for(Long id : db.get().linkStorage.keySet()){
            if(db.get().linkStorage.get(id).genNumber.equals(genNumber)){
                db.get().userStorage.get(id).registered = true;
                db.get().linkStorage.remove(id);
                local_id = id;
                break;
            }
        }
        return (local_id!=null) ? "Your account has been successfully registered to our system" : "Error. Wrong link!!!";
    }

    public void sendToEmail(String email, String link){
        Email emailSend = new Email();
        emailSend.setFrom("zhambyl.9670@gmail.com");
        emailSend.setTo(email);
        emailSend.setSubject("Accout confirmation");
        emailSend.setBody("Follow to this link("+link+") and confirm your registration.\nLink: ("+link+")");
        System.out.println(emailSend.getTo()+" 1");
        emailSenderBeanGetter.get().send(emailSend);
        System.out.println(emailSend.getTo()+" 2");
        emailSenderControllerBeanGetter.get().sendAllExistingEmails();
        System.out.println(emailSend.getTo()+" 3");
    }
    public String getLink(String username, Long id){
        Long minNumber = 123456712L;
        Long maxNumber = 234567892L;
        Random r = new Random();
        Long number  = minNumber+((r.nextLong()*(maxNumber-minNumber)));
        String strNumber = Long.toString(number);
        LinkStorageDTO ls = new LinkStorageDTO();
        ls.genNumber = strNumber;
        ls.username = username;
        db.get().linkStorage.put(id,ls);
        System.out.println(db.get().linkStorage.get(id).genNumber+" "+db.get().linkStorage.get(id).username);
        String link = "http://localhost:1316/education/api/check/"+strNumber;
        return link;
    }
}
