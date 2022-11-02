package ua.lviv.iot.lab5.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import ua.lviv.iot.lab5.domain.UserAccount;
import ua.lviv.iot.lab5.repository.UserAccountRepository;
import ua.lviv.iot.lab5.service.UserAccountService;

import java.util.List;

public class UserAccountServiceImpl implements UserAccountService {
    private final UserAccountRepository userAccountRepository;

    @Autowired
    public UserAccountServiceImpl(UserAccountRepository userAccountRepository) {
        this.userAccountRepository = userAccountRepository;
    }

    @Override
    public List<UserAccount> findAll() {
        return null;
    }

    @Override
    public UserAccount findById(String s) {
        return null;
    }

    @Override
    public UserAccount create(UserAccount entity) {
        return null;
    }

    @Override
    public void update(String s, UserAccount entity) {

    }

    @Override
    public void delete(String s) {

    }
}
