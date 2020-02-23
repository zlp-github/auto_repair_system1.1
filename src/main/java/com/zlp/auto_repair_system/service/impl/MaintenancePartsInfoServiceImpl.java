package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.MaintenancePartsInfoDao;
import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;
import com.zlp.auto_repair_system.response.GetAllMaintenancePartsInfoResponse;
import com.zlp.auto_repair_system.service.MaintenancePartsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:38
 * Description:张立朋，写点注释吧!!
 */
@Service
public class MaintenancePartsInfoServiceImpl implements MaintenancePartsInfoService {

    @Autowired
    private MaintenancePartsInfoDao maintenancePartsInfoDao;

    @Override
    public Integer addMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo) {
        return maintenancePartsInfoDao.addMaintenancePartsInfo(maintenancePartsInfo);
    }

    @Override
    public MaintenancePartsInfo findMaintenancePartsInfoById(Integer id) {
        return maintenancePartsInfoDao.findMaintenancePartsInfoById(id);
    }

    @Override
    public List<MaintenancePartsInfo> findMaintenancePartsInfoBycarNum(String carNum) {
        return maintenancePartsInfoDao.findMaintenancePartsInfoBycarNum(carNum);
    }

    @Override
    public GetAllMaintenancePartsInfoResponse getAllMaintenancePartsInfo(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<MaintenancePartsInfo> allMaintenancePartsInfo = maintenancePartsInfoDao.getAllMaintenancePartsInfo();
        PageInfo<MaintenancePartsInfo> maintenancePartsInfoPageInfo = new PageInfo<>(allMaintenancePartsInfo);
        GetAllMaintenancePartsInfoResponse getAllMaintenancePartsInfoResponse = new GetAllMaintenancePartsInfoResponse();
        List<MaintenancePartsInfo> list = maintenancePartsInfoPageInfo.getList();
        long total = maintenancePartsInfoPageInfo.getTotal();
        getAllMaintenancePartsInfoResponse.setMaintenancePartsInfoList(list);
        getAllMaintenancePartsInfoResponse.setTotal(total);
        return getAllMaintenancePartsInfoResponse;
    }

    @Override
    public Integer updateMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo) {
        return maintenancePartsInfoDao.updateMaintenancePartsInfo(maintenancePartsInfo);
    }

    @Override
    public Integer deleteMaintenancePartsInfoById(Integer id) {
        return maintenancePartsInfoDao.deleteMaintenancePartsInfoById(id);
    }
}
