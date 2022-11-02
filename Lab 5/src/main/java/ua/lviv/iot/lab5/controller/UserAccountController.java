package ua.lviv.iot.lab5.controller;

import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.lab5.domain.UserAccount;

import java.util.List;

@RestController
public class UserAccountController {
    public UserAccount getUser(String nickname) {
        return null;
    }

    public List<UserAccount> getAllUsers() {
        return null;
    }
}
