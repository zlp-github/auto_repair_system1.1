package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:29
 * Description:张立朋，写点注释吧!!
 */
public interface MaintenancePartsInfoService {

    Integer addMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo);

    MaintenancePartsInfo findMaintenancePartsInfoById(Integer id);

    List<MaintenancePartsInfo> getAllMaintenancePartsInfo(Integer pageNumber,Integer pageSize);

    Integer updateMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo);

    Integer deleteMaintenancePartsInfoById(Integer id);
}
