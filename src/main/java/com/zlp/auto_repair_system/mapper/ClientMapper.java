package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper extends CommonMapper<Client> {
    Integer updateClientList(List<Client> clientList);
}