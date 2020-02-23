package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;
import com.zlp.auto_repair_system.service.MaintenancePartsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Author: zlp
 * Date: 2020-02-05 15:35
 * Description:维修配件API
 */
@RestController
public class MaintenancePartsInfoController {

    @Autowired
    private MaintenancePartsInfoService maintenancePartsInfoService;

    @PostMapping("add/maintenancePartInfo")
    public SzpJsonResult<Integer> addMaintenancePartsInfo(@RequestBody MaintenancePartsInfo maintenancePartsInfo){
        maintenancePartsInfo.setCreateTime(new Date());
        return SzpJsonResult.ok(maintenancePartsInfoService.addMaintenancePartsInfo(maintenancePartsInfo));
    }

    @PostMapping("update/maintenancePartsInfo")
    public SzpJsonResult<Integer> updateMaintenancePartsInfo(@RequestBody MaintenancePartsInfo maintenancePartsInfo){
        return SzpJsonResult.ok(maintenancePartsInfoService.updateMaintenancePartsInfo(maintenancePartsInfo));
    }

    @PostMapping("delete/maintenancePartsInfoById")
    public SzpJsonResult<Integer> deleteMaintenancePartsInfo(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(maintenancePartsInfoService.deleteMaintenancePartsInfoById(id));
    }

    @GetMapping("get/allMaintenancePartsInfo")
    public SzpJsonResult<MaintenancePartsInfo> getAllMaintenancePartsInfo(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                                                          @RequestParam(value = "pageSize",defaultValue = "4") Integer pageSize){
        return SzpJsonResult.ok(maintenancePartsInfoService.getAllMaintenancePartsInfo(pageNumber,pageSize));
    }

    @GetMapping("find/maintenancePartsInfoByCarNum")
    public SzpJsonResult<MaintenancePartsInfo> findMaintenancePartsInfoByCarNum(@RequestParam(value = "carNum") String carNum){
        return SzpJsonResult.ok(maintenancePartsInfoService.findMaintenancePartsInfoBycarNum(carNum));
    }

}
