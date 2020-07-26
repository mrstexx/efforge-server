package com.efforge.studio.service;

import com.efforge.studio.model.Account;
import com.efforge.studio.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    private final IAccountRepository repository;

    @Autowired
    public AccountService(IAccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Account> findAll() {
        return (List<Account>) repository.findAll();
    }
}
