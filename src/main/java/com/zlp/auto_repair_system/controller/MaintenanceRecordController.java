package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.MaintenanceRecord;
import com.zlp.auto_repair_system.service.MaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.applet.Main;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-05 15:12
 * Description:维修保养记录API
 */
@RestController
public class MaintenanceRecordController {

    @Autowired
    private MaintenanceRecordService maintenanceRecordService;

    @PostMapping("add/maintenanceRecord")
    public SzpJsonResult<Integer> addMaintenanceRecord(@RequestBody MaintenanceRecord maintenanceRecord){
        maintenanceRecord.setCreateTime(new Date());
        return SzpJsonResult.ok(maintenanceRecordService.addMaintenanceRecord(maintenanceRecord));
    }

    @PostMapping("update/maintenanceRecord")
    public SzpJsonResult<Integer> updateMaintenanceRecord(@RequestBody MaintenanceRecord maintenanceRecord){
        return SzpJsonResult.ok(maintenanceRecordService.updateMaintenanceRecord(maintenanceRecord));
    }

    @PostMapping("delete/maintenanceRecordById")
    public SzpJsonResult<Integer> deleteMaintenanceRecord(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(maintenanceRecordService.deleteMaintenanceRecordById(id));
    }

    @GetMapping("get/allMaintenanceRecord")
    public SzpJsonResult<MaintenanceRecord> getAllMaintenanceRecord(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                                                    @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){
        return SzpJsonResult.ok(maintenanceRecordService.getAllMaintenanceRecord(pageNumber,pageSize));
    }

    @GetMapping("find/maintenanceRecordByCarNum")
    public SzpJsonResult<MaintenanceRecord> findMaintenanceRecordByCarNum(@RequestParam(value = "carNum") String carNum){
        return SzpJsonResult.ok(maintenanceRecordService.findMaintenanceRecordInfoBycarNum(carNum));
    }
}
