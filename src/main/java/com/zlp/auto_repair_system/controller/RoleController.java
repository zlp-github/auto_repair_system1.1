package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Role;
import com.zlp.auto_repair_system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Author: zlp
 * Date: 2020-02-05 23:58
 * Description:角色API
 */
@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("add/role")
    public SzpJsonResult<Integer> addRole(@RequestBody Role role){
        role.setCreateTime(new Date());
        return  SzpJsonResult.ok(roleService.addRole(role));
    }

    @PostMapping("update/role")
    public SzpJsonResult<Integer> updateRole(@RequestBody Role role){
        return  SzpJsonResult.ok(roleService.updateRole(role));
    }

    @PostMapping("delete/roleById")
    public SzpJsonResult<Integer> deleteRole(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(roleService.deleteRole(id));
    }

    @GetMapping("get/allRole")
    public SzpJsonResult<Role> getAllRole(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(roleService.getAllRole(pageNumber,pageSize));
    }
}
