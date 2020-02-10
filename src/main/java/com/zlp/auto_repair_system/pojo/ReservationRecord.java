package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_reservation_record")
public class ReservationRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 故障描述
     */
    @Column(name = "error_description")
    private String errorDescription;

    @Column(name = "appointment_time")
    private Date appointmentTime;

    @Column(name = "client_name")
    private String clientName;

    /**
     * 预约状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "crate_time")
    private Date crateTime;

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
     * 获取故障描述
     *
     * @return error_description - 故障描述
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 设置故障描述
     *
     * @param errorDescription 故障描述
     */
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription == null ? null : errorDescription.trim();
    }

    /**
     * @return appointment_time
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * @param appointmentTime
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * @return client_name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    /**
     * 获取预约状态
     *
     * @return status - 预约状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置预约状态
     *
     * @param status 预约状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return crate_time - 创建时间
     */
    public Date getCrateTime() {
        return crateTime;
    }

    /**
     * 设置创建时间
     *
     * @param crateTime 创建时间
     */
    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }
}