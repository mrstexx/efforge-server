package com.efforge.studio.rest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping(method = RequestMethod.GET, value = "/accounts")
    public List<Account> findAllAccounts() {
        return accountService.findAll();
    }

}
