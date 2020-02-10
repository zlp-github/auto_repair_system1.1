package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.PermissionMapper;
import com.zlp.auto_repair_system.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-03 14:59
 * Description:权限
 */
@Repository
public class PermissionDao {

    @Autowired
    private PermissionMapper permissionMapper;

    //添加权限
    public Integer addPermission(Permission permission){
        return permissionMapper.insert(permission);
    }

    //获取权限列表
    public List<Permission> getAllPermission(){
        return permissionMapper.selectAll();
    }

    //更新权限
    public Integer updatePermission(Permission permission){
        return permissionMapper.updateByPrimaryKeySelective(permission);
    }

    //删除权限
    public Integer deletePermission(Integer id){
        return permissionMapper.deleteByPrimaryKey(id);
    }

}
