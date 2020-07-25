package com.efforge.studio.rest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public List<Account> findAll() {
        List<Account> accounts = (List<Account>) repository.findAll();
        return accounts;
    }
}
