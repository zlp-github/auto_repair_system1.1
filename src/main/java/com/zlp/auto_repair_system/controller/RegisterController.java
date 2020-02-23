package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Client;
import com.zlp.auto_repair_system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: zlp
 * Date: 2020-02-15 11:19
 * Description:注册API
 */
@RestController
public class RegisterController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/register")
    public SzpJsonResult<Client> clientRegister(@RequestBody Client client){
        return SzpJsonResult.ok(clientService.clientRegister(client));
    }
}
