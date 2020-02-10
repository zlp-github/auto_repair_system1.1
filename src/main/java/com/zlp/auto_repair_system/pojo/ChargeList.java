package com.zlp.auto_repair_system.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_charge_list")
public class ChargeList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 维修保养记录id
     */
    @Column(name = "maintenance_record_id")
    private Integer maintenanceRecordId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "car_number")
    private String carNumber;

    /**
     * 总费用
     */
    @Column(name = "total_charge")
    private String totalCharge;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取维修保养记录id
     *
     * @return maintenance_record_id - 维修保养记录id
     */
    public Integer getMaintenanceRecordId() {
        return maintenanceRecordId;
    }

    /**
     * 设置维修保养记录id
     *
     * @param maintenanceRecordId 维修保养记录id
     */
    public void setMaintenanceRecordId(Integer maintenanceRecordId) {
        this.maintenanceRecordId = maintenanceRecordId;
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
     * @return car_number
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * @param carNumber
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * 获取总费用
     *
     * @return total_charge - 总费用
     */
    public String getTotalCharge() {
        return totalCharge;
    }

    /**
     * 设置总费用
     *
     * @param totalCharge 总费用
     */
    public void setTotalCharge(String totalCharge) {
        this.totalCharge = totalCharge == null ? null : totalCharge.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}