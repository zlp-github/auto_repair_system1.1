package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.mapper.MaintenanceRecordMapper;
import com.zlp.auto_repair_system.pojo.MaintenanceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:21
 * Description:维修保养记录
 */
@Repository
public class MaintenanceRecordDao {

    @Autowired
    private MaintenanceRecordMapper maintenanceRecordMapper;

    //添加保养记录
    public Integer addMaintenanceRecord(MaintenanceRecord maintenanceRecord){
        return maintenanceRecordMapper.insert(maintenanceRecord);
    }

    //查找所有保养记录
    public List<MaintenanceRecord> getAllMaintenanceRecord(){
        return maintenanceRecordMapper.selectAll();
    }

    //通过id查找保养记录
    public MaintenanceRecord findMaintenanceRecordById(Integer id){
        return maintenanceRecordMapper.selectByPrimaryKey(id);
    }

    //通过车牌号查询保养记录
    public List<MaintenanceRecord> findMaintenanceRecordBycarNum(String carNum){
        Example example = new Example(MaintenanceRecord.class);
        example.createCriteria().andEqualTo("carNumber",carNum);
        return maintenanceRecordMapper.selectByExample(example);
    }

    //更新保养记录
    public Integer updateMaintenanceRecord(MaintenanceRecord maintenanceRecord){
        return maintenanceRecordMapper.updateByPrimaryKeySelective(maintenanceRecord);
    }

    //删除保养记录
    public Integer deleteMaintenanceRecord(Integer id){
        return  maintenanceRecordMapper.deleteByPrimaryKey(id);
    }
}
