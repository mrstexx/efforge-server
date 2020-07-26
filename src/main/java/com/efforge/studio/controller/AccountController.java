package com.efforge.studio.controller;

import com.efforge.studio.model.Account;
import com.efforge.studio.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    final private IAccountService accountService;

    @Autowired
    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    public List<Account> findAllAccounts() {
        return accountService.findAll();
    }

}
