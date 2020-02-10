package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.RolePermission;
import com.zlp.auto_repair_system.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author: zlp
 * Date: 2020-02-06 13:23
 * Description:角色权限API
 */
@RestController
public class RolePermissionController {

    @Autowired
    private RolePermissionService rolePermissionService;

    @PostMapping("add/rolePermission")
    public SzpJsonResult<Integer> addRolePermission(@RequestBody RolePermission rolePermission){
        return SzpJsonResult.ok(rolePermissionService.addRolePermission(rolePermission));
    }

    @PostMapping("update/rolePermission")
    public  SzpJsonResult<Integer> updatePermission(@RequestBody RolePermission rolePermission){
        return SzpJsonResult.ok(rolePermissionService.updateRolePermission(rolePermission));
    }


    @GetMapping("find/rolePermissionById")
    public SzpJsonResult<RolePermission> findRolePermissionById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(rolePermissionService.findRolePermissionById(id));
    }

    @GetMapping("get/allRolePermission")
    public SzpJsonResult<RolePermission> getAllPermission(@RequestParam(value = "pageNumber",defaultValue = "0") Integer pageNumber,
                                                          @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(rolePermissionService.getAllRolePermission(pageNumber,pageSize));
    }
}
