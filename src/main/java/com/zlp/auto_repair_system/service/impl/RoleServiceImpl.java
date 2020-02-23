package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.RoleDao;
import com.zlp.auto_repair_system.pojo.Role;
import com.zlp.auto_repair_system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-04 15:50
 * Description:张立朋，写点注释吧!!
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Integer addRole(Role role) {
        return roleDao.addRole(role);
    }

    @Override
    public List<Role> getAllRole(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<Role> allRole = roleDao.getAllRole();
        PageInfo<Role> rolePageInfo = new PageInfo<>(allRole);
        return rolePageInfo.getList();
    }

    @Override
    public Integer updateRole(Role role) {
        return roleDao.updateRole(role);
    }

    @Override
    public Integer deleteRole(Integer id) {
        return roleDao.deleteRole(id);
    }
}
