package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.FeedbackRecordMapper;
import com.zlp.auto_repair_system.pojo.FeedbackRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:18
 * Description:反馈记录
 */
@Repository
public class FeedbackRecordDao {

    @Autowired
    private FeedbackRecordMapper feedbackRecordMapper;

    //添加反馈记录
    public Integer addFeedbackRecord(FeedbackRecord feedbackRecord){
        return  feedbackRecordMapper.insert(feedbackRecord);
    }

    //批量添加反馈记录
    public Integer addFeedbackRecord(List<FeedbackRecord> feedbackRecordList){
        return feedbackRecordMapper.insertList(feedbackRecordList);
    }

    //通过id查找反馈记录
    public FeedbackRecord findFeedbackRecordById(Integer id){
        return feedbackRecordMapper.selectByPrimaryKey(id);
    }

    //获取所有反馈记录
    public List<FeedbackRecord> getAllFeedbackRecord(){
        return feedbackRecordMapper.selectAll();
    }

    //更新反馈记录
    public Integer updateFeedbackRecord(FeedbackRecord feedbackRecord){
        return feedbackRecordMapper.updateByPrimaryKeySelective(feedbackRecord);
    }

    //删除反馈记录
    public Integer deleteFeedbackRecord(Integer id){
        return feedbackRecordMapper.deleteByPrimaryKey(id);
    }

    //批量删除反馈记录
    public Integer deleteFeedbackRecord(List<Integer> ids){
        Example example = new Example(FeedbackRecord.class);
        example.createCriteria().andIn("id",ids);
        return feedbackRecordMapper.deleteByExample(example);
    }
}
