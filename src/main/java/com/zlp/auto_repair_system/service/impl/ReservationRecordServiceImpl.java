package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.ReservationRecordDao;
import com.zlp.auto_repair_system.pojo.ReservationRecord;
import com.zlp.auto_repair_system.response.GetAllReservationRecordResponse;
import com.zlp.auto_repair_system.service.ReservationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:40
 * Description:张立朋，写点注释吧!!
 */
@Service
public class ReservationRecordServiceImpl implements ReservationRecordService {

    @Autowired
    private ReservationRecordDao reservationRecordDao;

    @Override
    public Integer addReservationRecord(ReservationRecord reservationRecord) {
        return reservationRecordDao.addReservationRecord(reservationRecord);
    }

    @Override
    public ReservationRecord findReservationRecordById(Integer id) {
        return reservationRecordDao.findReservationRecordById(id);
    }

    @Override
    public List<ReservationRecord> findReservationRecordByName(String name) {
        return reservationRecordDao.findReservationRecordByName(name);
    }

    @Override
    public GetAllReservationRecordResponse getAllReservationRecord(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<ReservationRecord> all = reservationRecordDao.getAllReservationRecord();
        PageInfo<ReservationRecord> reservationRecordPageInfo = new PageInfo<>(all);
        GetAllReservationRecordResponse getAllReservationRecordResponse = new GetAllReservationRecordResponse();
        List<ReservationRecord> list = reservationRecordPageInfo.getList();
        long total = reservationRecordPageInfo.getTotal();
        getAllReservationRecordResponse.setReservationRecordList(list);
        getAllReservationRecordResponse.setTotal(total);
        return getAllReservationRecordResponse;
    }

    @Override
    public Integer updateReservationRecord(ReservationRecord reservationRecord) {
        return reservationRecordDao.updateReservationRecord(reservationRecord);
    }

    @Override
    public Integer deleteReservationRecord(Integer id) {
        return reservationRecordDao.deleteReservationRecord(id);
    }
}
