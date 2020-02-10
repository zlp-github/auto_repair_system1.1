package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_feedback_record")
public class FeedbackRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 反馈内容
     */
    @Column(name = "feedback_content")
    private String feedbackContent;

    /**
     * 回复状态
     */
    @Column(name = "recoil_status")
    private String recoilStatus;

    /**
     * 客户姓名
     */
    @Column(name = "client_name")
    private String clientName;

    /**
     * 反馈时间
     */
    @Column(name = "message_time")
    private Date messageTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取反馈内容
     *
     * @return feedback_content - 反馈内容
     */
    public String getFeedbackContent() {
        return feedbackContent;
    }

    /**
     * 设置反馈内容
     *
     * @param feedbackContent 反馈内容
     */
    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }

    /**
     * 获取回复状态
     *
     * @return recoil_status - 回复状态
     */
    public String getRecoilStatus() {
        return recoilStatus;
    }

    /**
     * 设置回复状态
     *
     * @param recoilStatus 回复状态
     */
    public void setRecoilStatus(String recoilStatus) {
        this.recoilStatus = recoilStatus == null ? null : recoilStatus.trim();
    }

    /**
     * 获取客户姓名
     *
     * @return client_name - 客户姓名
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 设置客户姓名
     *
     * @param clientName 客户姓名
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * 获取反馈时间
     *
     * @return message_time - 反馈时间
     */
    public Date getMessageTime() {
        return messageTime;
    }

    /**
     * 设置反馈时间
     *
     * @param messageTime 反馈时间
     */
    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }
}