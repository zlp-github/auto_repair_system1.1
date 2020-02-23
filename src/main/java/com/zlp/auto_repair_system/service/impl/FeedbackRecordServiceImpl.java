package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.FeedbackRecordDao;
import com.zlp.auto_repair_system.pojo.FeedbackRecord;
import com.zlp.auto_repair_system.response.GetAllEmployeeResponse;
import com.zlp.auto_repair_system.response.GetAllFeedbackRecordResponse;
import com.zlp.auto_repair_system.service.FeedbackRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:37
 * Description:张立朋，写点注释吧!!
 */
@Service
public class FeedbackRecordServiceImpl implements FeedbackRecordService {

    @Autowired
    private FeedbackRecordDao feedbackRecordDao;

    @Override
    public Integer addFeedbackRecord(FeedbackRecord feedbackRecord) {
        return feedbackRecordDao.addFeedbackRecord(feedbackRecord);
    }

    @Override
    public Integer updateFeedbackRecord(FeedbackRecord feedbackRecord) {
        return feedbackRecordDao.updateFeedbackRecord(feedbackRecord);
    }

    @Override
    public FeedbackRecord findFeedbackRecordById(Integer id) {
        return feedbackRecordDao.findFeedbackRecordById(id);
    }

    @Override
    public GetAllFeedbackRecordResponse getAllFeedbackRecord(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        List<FeedbackRecord> all = feedbackRecordDao.getAllFeedbackRecord();
        PageInfo<FeedbackRecord> feedbackRecordPageInfo = new PageInfo<>(all);
        GetAllFeedbackRecordResponse getAllFeedbackRecordResponse = new GetAllFeedbackRecordResponse();
        List<FeedbackRecord> feedbackRecordsList = feedbackRecordPageInfo.getList();
        long total = feedbackRecordPageInfo.getTotal();
        getAllFeedbackRecordResponse.setFeedbackRecordList(feedbackRecordsList);
        getAllFeedbackRecordResponse.setTotal(total);
        return getAllFeedbackRecordResponse;
    }

    @Override
    public Integer deleteFeedbackRecord(Integer id) {
        return feedbackRecordDao.deleteFeedbackRecord(id);
    }

    @Override
    public List<FeedbackRecord> findFeedbackRecordByName(String name) {
        return feedbackRecordDao.findFeedbackRecoedByName(name);
    }
}
