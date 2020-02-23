package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.ReservationRecordMapper;
import com.zlp.auto_repair_system.pojo.ReservationRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:20
 * Description:在线预约
 */
@Repository
public class ReservationRecordDao {

    @Autowired
    private ReservationRecordMapper reservationRecordMapper;


    //添加预约记录
    public Integer addReservationRecord(ReservationRecord reservationRecord){
        return reservationRecordMapper.insert(reservationRecord);
    }

    //获取所有预约记录
    public List<ReservationRecord> getAllReservationRecord(){
        return reservationRecordMapper.selectAll();
    }

    //根据id获取预约记录
    public ReservationRecord findReservationRecordById(Integer id){
        return reservationRecordMapper.selectByPrimaryKey(id);
    }

    //根据客户姓名查询预约记录
    public List<ReservationRecord> findReservationRecordByName(String name){
        Example example = new Example(ReservationRecord.class);
        example.createCriteria().andEqualTo("clientName",name);
        return reservationRecordMapper.selectByExample(example);
    }

    //更新预约记录
    public Integer updateReservationRecord(ReservationRecord reservationRecord){
        return reservationRecordMapper.updateByPrimaryKeySelective(reservationRecord);
    }

    //删除预约记录
    public Integer deleteReservationRecord(Integer id){
        return reservationRecordMapper.deleteByPrimaryKey(id);
    }
}
