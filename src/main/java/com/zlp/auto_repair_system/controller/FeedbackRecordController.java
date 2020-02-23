package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.FeedbackRecord;
import com.zlp.auto_repair_system.service.FeedbackRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Author: zlp
 * Date: 2020-02-05 14:41
 * Description:反馈记录API
 */
@RestController
public class FeedbackRecordController {

    @Autowired
    private FeedbackRecordService feedbackRecordService;

    @PostMapping("add/feedbackRecord")
    public SzpJsonResult<Integer> addFeedbackRecord(@RequestBody FeedbackRecord feedbackRecord){
        feedbackRecord.setMessageTime(new Date());
        feedbackRecord.setRecoilStatus(0);
        return SzpJsonResult.ok(feedbackRecordService.addFeedbackRecord(feedbackRecord));
    }

    @PostMapping("update/feedbackRecord")
    public SzpJsonResult<Integer> updateFeedbackRecord(@RequestBody FeedbackRecord feedbackRecord){
        return SzpJsonResult.ok(feedbackRecordService.updateFeedbackRecord(feedbackRecord));
    }

    @PostMapping("delete/feedbackRecordById")
    public SzpJsonResult<Integer> deleteFeedbackRecordById(@RequestParam(value = "id")Integer id){
        return SzpJsonResult.ok(feedbackRecordService.deleteFeedbackRecord(id));
    }

    @GetMapping("get/allFeedbackRecord")
    public SzpJsonResult<FeedbackRecord> getAllFeedbackRecord(@RequestParam(value = "PageNumber",defaultValue = "1") Integer pageNumber,
                                                              @RequestParam(value = "PageSize",defaultValue = "10")Integer pageSize){
        return SzpJsonResult.ok(feedbackRecordService.getAllFeedbackRecord(pageNumber,pageSize));
    }

    @GetMapping("find/feedbackRecordById")
    public SzpJsonResult<FeedbackRecord> findFeedbackRecord(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(feedbackRecordService.findFeedbackRecordById(id));
    }

    @GetMapping("find/feedbackRecordByName")
    public SzpJsonResult<FeedbackRecord> findFeedbackRecord(@RequestParam(value = "clientName") String name){
        return SzpJsonResult.ok(feedbackRecordService.findFeedbackRecordByName(name));
    }
}
