package kz.sdu.project.controller.register;

public interface UserRegister {
    String checkAndAcceptUser(String getNumber);
    String registerUserByEmail(String username, String firstName, String lastName, String password, String role);
}
