package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.pojo.ReservationRecord;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:31
 * Description:张立朋，写点注释吧!!
 */
public interface ReservationRecordService {

    Integer addReservationRecord(ReservationRecord reservationRecord);

    ReservationRecord findReservationRecordById(Integer id);

    List<ReservationRecord> getAllReservationRecord(Integer pageNumber , Integer pageSize);

    Integer updateReservationRecord(ReservationRecord reservationRecord);

    Integer deleteReservationRecord(Integer id);
}
