package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.pojo.Role;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-04 15:17
 * Description:张立朋，写点注释吧!!
 */

public interface RoleService {

    Integer addRole(Role role);

    List<Role> getAllRole(Integer pageNumber,Integer pageSize);

    Integer updateRole(Role role);

    Integer deleteRole(Integer id);
}
