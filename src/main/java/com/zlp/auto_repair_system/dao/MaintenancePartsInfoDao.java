package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.MaintenancePartsInfoMapper;
import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:21
 * Description:维修配件信息记录
 */
@Repository
public class MaintenancePartsInfoDao {

    @Autowired
    private MaintenancePartsInfoMapper maintenancePartsInfoMapper;

    //添加维修配件信息表
    public Integer addMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo){
        return maintenancePartsInfoMapper.insert(maintenancePartsInfo);
    }

    //通过id查找配件信息表
    public MaintenancePartsInfo findMaintenancePartsInfoById(Integer id){
        return maintenancePartsInfoMapper.selectByPrimaryKey(id);
    }

    //通过车牌号查询配件信息表
    public List<MaintenancePartsInfo> findMaintenancePartsInfoBycarNum(String carNum){
        Example example = new Example(MaintenancePartsInfo.class);
        example.createCriteria().andEqualTo("carNumber",carNum);
        return maintenancePartsInfoMapper.selectByExample(example);
    }

    //获取全部配件信息记录
    public List<MaintenancePartsInfo> getAllMaintenancePartsInfo(){
        return maintenancePartsInfoMapper.selectAll();
    }

    //更新配件信息记录
    public Integer updateMaintenancePartsInfo(MaintenancePartsInfo maintenancePartsInfo){
        return maintenancePartsInfoMapper.updateByPrimaryKeySelective(maintenancePartsInfo);
    }

    //删除配件信息记录
    public Integer deleteMaintenancePartsInfoById(Integer id){
        return maintenancePartsInfoMapper.deleteByPrimaryKey(id);
    }
}
