package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.RoleMapper;
import com.zlp.auto_repair_system.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-03 14:55
 * Description:角色
 */
@Repository
public class RoleDao {

    @Autowired
    private RoleMapper roleMapper;

    //添加角色
    public Integer addRole(Role role){
        return roleMapper.insert(role);
    }

    //获取角色列表
    public List<Role> getAllRole(){
        return roleMapper.selectAll();
    }

    //更新角色
    public Integer updateRole(Role role){
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    //删除角色
    public Integer deleteRole(Integer id){
        return roleMapper.deleteByPrimaryKey(id);
    }
}
