package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.pojo.MaintenanceRecord;
import com.zlp.auto_repair_system.response.GetAllMaintenanceRecord;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:29
 * Description:张立朋，写点注释吧!!
 */
public interface MaintenanceRecordService {

    Integer addMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    MaintenanceRecord findMaintenanceRecordInfoById(Integer id);

    List<MaintenanceRecord> findMaintenanceRecordInfoBycarNum(String carNum);

    GetAllMaintenanceRecord getAllMaintenanceRecord(Integer pageNumber, Integer pageSize);

    Integer updateMaintenanceRecord(MaintenanceRecord maintenanceRecord);

    Integer deleteMaintenanceRecordById(Integer id);
}
