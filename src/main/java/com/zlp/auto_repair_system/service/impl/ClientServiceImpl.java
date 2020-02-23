package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.dao.ClientDao;
import com.zlp.auto_repair_system.pojo.Client;
import com.zlp.auto_repair_system.response.GetAllClientResponse;
import com.zlp.auto_repair_system.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:33
 * Description:张立朋，写点注释吧!!
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public List<Client> findClientByName(String name) {
        return clientDao.findClientByName(name);
    }

    @Override
    public Integer addClient(Client client) {
        return clientDao.addClient(client);
    }

    @Override
    public Integer addClientList(List<Client> clientList) {
        return clientDao.addClientList(clientList);
    }

    @Override
    public Client findClientById(Integer id) {
        return clientDao.findClientById(id);
    }

    @Override
    public GetAllClientResponse getAllClient(Integer pageNumber , Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Client> all = clientDao.getAllClient();
        PageInfo<Client> clientPageInfo = new PageInfo<>(all);
        GetAllClientResponse getAllClientResponse = new GetAllClientResponse();
        List<Client> clientList = clientPageInfo.getList();
        long total = clientPageInfo.getTotal();
        getAllClientResponse.setClientList(clientList);
        getAllClientResponse.setTotal(total);
        return getAllClientResponse;
    }

    @Override
    public Integer updateClient(Client client) {
        return clientDao.updateClient(client);
    }

    @Override
    public Integer updateClientList(List<Client> clientList) {
        return clientDao.updateClientList(clientList);
    }

    @Override
    public Integer deleteClientById(Integer id) {
        return clientDao.deleteClient(id);
    }

    @Override
    public Integer deleteClientList(List<Integer> ids) {
        return clientDao.deleteClientList(ids);
    }

    @Override
    public List<Client> clientLogin(String nickName, String password) {
        return clientDao.clientLogin(nickName,password);
    }

    @Override
    public SzpJsonResult<Client> clientRegister(Client client) {
        return SzpJsonResult.ok(clientDao.clientRegister(client));
    }
}
