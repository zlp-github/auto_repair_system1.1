package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Client;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:23
 * Description:张立朋，写点注释吧!!
 */
public interface ClientService {

    Integer addClient(Client client);
    Integer addClientList(List<Client> clientList);
    Client findClientById(Integer id);
    List<Client> findClientByName(String name);
    List<Client> getAllClient(Integer pageNumber,Integer pageSize);
    Integer updateClient(Client client);
    Integer updateClientList(List<Client> clientList);
    Integer deleteClientById(Integer id);
    Integer deleteClientList(List<Integer> ids);
    SzpJsonResult<Client> clientLogin(String nickName, String password);
}
