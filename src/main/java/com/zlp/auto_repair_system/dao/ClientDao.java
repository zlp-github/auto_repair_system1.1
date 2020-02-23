package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.mapper.ClientMapper;
import com.zlp.auto_repair_system.pojo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:18
 * Description:客户dao
 */
@Repository
public class ClientDao {

    @Autowired
    private ClientMapper clientMapper;

    //添加客户信息
    public Integer addClient(Client client){
        return clientMapper.insert(client);
    }

    //批量添加客户
    public Integer addClientList(List<Client> clientList){
        return clientMapper.insertList(clientList);
    }

    //更新客户信息
    public Integer updateClient(Client client){
        return clientMapper.updateByPrimaryKeySelective(client);
    }

    //批量更新客户信息
    public Integer updateClientList(List<Client> clientList){
        return clientMapper.updateClientList(clientList);
    }

    //通过id进行查询
    public Client findClientById(Integer id){
        return clientMapper.selectByPrimaryKey(id);
    }

    //通过姓名进行查询
    public List<Client> findClientByName(String name){
        Example example = new Example(Client.class);
        example.createCriteria()
                .andLike("name","%"+name+"%");
        return clientMapper.selectByExample(example);
    }

    //查找所有客户信息
    public List<Client> getAllClient(){
        return clientMapper.selectAll();
    }

    //删除客户信息
    public Integer deleteClient(Integer id){
        return clientMapper.deleteByPrimaryKey(id);
    }

    //批量删除客户
    public Integer deleteClientList(List<Integer> ids){
        Example example = new Example(Client.class);
        example.createCriteria().andIn("id",ids);
        return clientMapper.deleteByExample(example);
    }

    //客户登录验证
    public List<Client> clientLogin(String nickName,String password){
        Example example = new Example(Client.class);
        example.createCriteria().andEqualTo("nickName",nickName).andEqualTo("password",password);
        return clientMapper.selectByExample(example);
    }

    //注册验证
    public SzpJsonResult<Integer> clientRegister(Client client){
        Example example = new Example(Client.class);
        example.createCriteria().andEqualTo("nickName",client.getNickName());
        List<Client> clients = clientMapper.selectByExample(example);
        System.out.println(clients.size());
        if(clients.size() !=0 ){
            return SzpJsonResult.ok(0);
        }
        else{
            client.setCreateTime(new Date());
            client.setUpdateTime(new Date());
            client.setRoleId(1);
            int num = clientMapper.insert(client);
            return SzpJsonResult.ok(num);
        }
    }
}
