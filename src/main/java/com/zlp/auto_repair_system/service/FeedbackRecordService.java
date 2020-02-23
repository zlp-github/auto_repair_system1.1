package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.pojo.FeedbackRecord;
import com.zlp.auto_repair_system.response.GetAllFeedbackRecordResponse;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:28
 * Description:张立朋，写点注释吧!!
 */
public interface FeedbackRecordService {

    Integer addFeedbackRecord(FeedbackRecord feedbackRecord);

    Integer updateFeedbackRecord(FeedbackRecord feedbackRecord);

    FeedbackRecord findFeedbackRecordById(Integer id);

    List<FeedbackRecord> findFeedbackRecordByName(String name);

    GetAllFeedbackRecordResponse getAllFeedbackRecord(Integer pageNumber, Integer pageSize);

    Integer deleteFeedbackRecord(Integer id);
}
