package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.MaintenanceRecordDao;
import com.zlp.auto_repair_system.pojo.MaintenanceRecord;
import com.zlp.auto_repair_system.response.GetAllMaintenanceRecord;
import com.zlp.auto_repair_system.service.MaintenanceRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:38
 * Description:张立朋，写点注释吧!!
 */
@Service
public class MaintenanceRecordServiceImpl implements MaintenanceRecordService {

    @Autowired
    private MaintenanceRecordDao maintenanceRecordDao;

    @Override
    public Integer addMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        return maintenanceRecordDao.addMaintenanceRecord(maintenanceRecord);
    }

    @Override
    public MaintenanceRecord findMaintenanceRecordInfoById(Integer id) {
        return maintenanceRecordDao.findMaintenanceRecordById(id);
    }

    @Override
    public List<MaintenanceRecord> findMaintenanceRecordInfoBycarNum(String carNum) {
        return maintenanceRecordDao.findMaintenanceRecordBycarNum(carNum);
    }

    @Override
    public GetAllMaintenanceRecord getAllMaintenanceRecord(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<MaintenanceRecord> allMaintenanceRecord = maintenanceRecordDao.getAllMaintenanceRecord();
        PageInfo<MaintenanceRecord> maintenanceRecordPageInfo = new PageInfo<>(allMaintenanceRecord);
        GetAllMaintenanceRecord getAllMaintenanceRecord = new GetAllMaintenanceRecord();
        List<MaintenanceRecord> list = maintenanceRecordPageInfo.getList();
        long total = maintenanceRecordPageInfo.getTotal();
        getAllMaintenanceRecord.setMaintenanceRecordList(list);
        getAllMaintenanceRecord.setTotal(total);
        return getAllMaintenanceRecord;
    }

    @Override
    public Integer updateMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        return maintenanceRecordDao.updateMaintenanceRecord(maintenanceRecord);
    }

    @Override
    public Integer deleteMaintenanceRecordById(Integer id) {
        return maintenanceRecordDao.deleteMaintenanceRecord(id);
    }
}
