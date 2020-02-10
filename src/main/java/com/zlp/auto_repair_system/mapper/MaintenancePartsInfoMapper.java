package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MaintenancePartsInfoMapper extends CommonMapper<MaintenancePartsInfo> {
    Integer updateMaintenancePartsInfoList(List<MaintenancePartsInfo> maintenancePartsInfoList);
}