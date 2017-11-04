package kz.sdu.project.controller.register;

import kz.sdu.project.controller.model.SessionInfo;

public interface SessionRegister {
    SessionInfo getSession(String key);
    String setSession(String key, String value);
}
