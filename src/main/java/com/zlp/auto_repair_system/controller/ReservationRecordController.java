package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.ReservationRecord;
import com.zlp.auto_repair_system.service.ReservationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Author: zlp
 * Date: 2020-02-05 22:52
 * Description:预约记录API
 */
@RestController
public class ReservationRecordController {

    @Autowired
    private ReservationRecordService reservationRecordService;

    @PostMapping("add/reservationRecord")
    public SzpJsonResult<Integer> addReservationRecord(@RequestBody ReservationRecord reservationRecord){
        reservationRecord.setCrateTime(new Date());
        reservationRecord.setStatus(0);
        return SzpJsonResult.ok(reservationRecordService.addReservationRecord(reservationRecord));
    }

    @PostMapping("update/reservationRecord")
    public SzpJsonResult<Integer> updateReservationRecord(@RequestBody ReservationRecord reservationRecord){
        return SzpJsonResult.ok(reservationRecordService.updateReservationRecord(reservationRecord));
    }

    @PostMapping("delete/reservationRecordById")
    public SzpJsonResult<Integer> deleteReservationRecord(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(reservationRecordService.deleteReservationRecord(id));
    }

    @GetMapping("find/reservationById")
    public SzpJsonResult<ReservationRecord> findReservationRecordById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(reservationRecordService.findReservationRecordById(id));
    }

    @GetMapping("find/reservationByName")
    public SzpJsonResult<ReservationRecord> findReservationRecordByName(@RequestParam(value = "name") String name){
        return  SzpJsonResult.ok(reservationRecordService.findReservationRecordByName(name));
    }

    @GetMapping("get/allReservationRecord")
    public SzpJsonResult<ReservationRecord> getAllReservationRecord(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                                                    @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(reservationRecordService.getAllReservationRecord(pageNumber,pageSize));
    }
}

