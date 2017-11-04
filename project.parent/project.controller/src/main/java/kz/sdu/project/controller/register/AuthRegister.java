package kz.sdu.project.controller.register;

import kz.sdu.project.controller.model.UserInfo;

public interface AuthRegister {
    UserInfo checkUserListDetails(String username, String password);
}
