package com.ce.hackathon.serviceinvoker;

import com.ce.hackathon.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ce250044 on 8/28/17.
 */
@Repository
public class AccountServiceInvoker {

    @Autowired
    private Environment environment;

    @Autowired
    private RestTemplate restTemplate;

    public Account getAccounts(String fi) {
        String propertyName = "fi."+fi;
        String restUri = environment.getProperty(propertyName);

        ResponseEntity responseEntity = restTemplate.getForEntity(restUri, Account.class, fi);

        if(responseEntity != null && responseEntity.getBody() instanceof Account)
            return (Account)responseEntity.getBody();
        return null;
    }
}
