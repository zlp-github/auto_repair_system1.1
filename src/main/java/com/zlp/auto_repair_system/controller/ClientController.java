package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Client;
import com.zlp.auto_repair_system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * Author: zlp
 * Date: 2020-02-05 0:08
 * Description:客户API
 */
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("add/client")
    public SzpJsonResult<Integer> addClient(@RequestBody Client client){
        client.setCreateTime(new Date());
        client.setUpdateTime(new Date());
        client.setRoleId(1);
        return SzpJsonResult.ok(clientService.addClient(client));
    }

    @GetMapping("find/clientById")
    public SzpJsonResult<Client> findClientById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(clientService.findClientById(id));
    }

    @GetMapping("find/clientByName")
    public SzpJsonResult<Client> findClientByName(@RequestParam(value = "name") String name){
        return SzpJsonResult.ok(clientService.findClientByName(name));
    }

    @GetMapping("get/allClient")
    public SzpJsonResult<Client> getAllEmployee(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                                @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(clientService.getAllClient(pageNumber,pageSize));
    }

    @PostMapping("update/client")
    public SzpJsonResult<Integer> updateClient(@RequestBody Client client){
        client.setUpdateTime(new Date());
        return SzpJsonResult.ok(clientService.updateClient(client));
    }

    @PostMapping("delete/clientById")
    public SzpJsonResult<Integer> deleteClientById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(clientService.deleteClientById(id));
    }

//    @GetMapping("login/client")
//    public SzpJsonResult<Client> clientLogin(@RequestParam(value = "nickName") String nickName,
//                                             @RequestParam(value = "password") String passWord){
//        return SzpJsonResult.ok(clientService.clientLogin(nickName,passWord));
//    }
}
