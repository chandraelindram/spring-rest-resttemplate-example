package com.ce.hackathon.controller;

import com.ce.hackathon.domain.Account;
import com.ce.hackathon.serviceinvoker.AccountServiceInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ce250044 on 8/28/17.
 */
@RestController
public class AccountController {

    @Autowired
    private Environment env;

    @Autowired
    private AccountServiceInvoker accountServiceInvoker;

    @RequestMapping(value = "/fi/{fi}/accounts")
    public Account getAccounts(@PathVariable String fi) {
        return accountServiceInvoker.getAccounts(fi);
    }
}
