package com.zlp.auto_repair_system.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_maintenance_record")
public class MaintenanceRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Integer id;

    /**
     * 车牌号
     */
    @Column(name = "car_number")
    private String carNumber;

    /**
     * 保养日期
     */
    @Column(name = "maintenance_time")
    private Date maintenanceTime;

    /**
     * 保养/维修原因
     */
    @Column(name = "maintenance_reason")
    private String maintenanceReason;

    /**
     * 保养/维修项目
     */
    @Column(name = "maintenance_project")
    private String maintenanceProject;

    /**
     * 维修当时公里数
     */
    @Column(name = "maintenance_rpk")
    private String maintenanceRpk;

    /**
     * 维修配件单编号
     */
    @Column(name = "maintenance_part_info_num")
    private String maintenancePartInfoNum;

    /**
     * 维修费用
     */
    @Column(name = "maintenance_costs")
    private Long maintenanceCosts;

    /**
     * 经手人
     */
    @Column(name = "handler")
    private String handler;

    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;

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
     * 获取车牌号
     *
     * @return car_number - 车牌号
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 设置车牌号
     *
     * @param carNumber 车牌号
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    /**
     * 获取保养日期
     *
     * @return maintenance_time - 保养日期
     */
    public Date getMaintenanceTime() {
        return maintenanceTime;
    }

    /**
     * 设置保养日期
     *
     * @param maintenanceTime 保养日期
     */
    public void setMaintenanceTime(Date maintenanceTime) {
        this.maintenanceTime = maintenanceTime;
    }

    /**
     * 获取保养/维修原因
     *
     * @return maintenance_reason - 保养/维修原因
     */
    public String getMaintenanceReason() {
        return maintenanceReason;
    }

    /**
     * 设置保养/维修原因
     *
     * @param maintenanceReason 保养/维修原因
     */
    public void setMaintenanceReason(String maintenanceReason) {
        this.maintenanceReason = maintenanceReason == null ? null : maintenanceReason.trim();
    }

    /**
     * 获取保养/维修项目
     *
     * @return maintenance_project - 保养/维修项目
     */
    public String getMaintenanceProject() {
        return maintenanceProject;
    }

    /**
     * 设置保养/维修项目
     *
     * @param maintenanceProject 保养/维修项目
     */
    public void setMaintenanceProject(String maintenanceProject) {
        this.maintenanceProject = maintenanceProject == null ? null : maintenanceProject.trim();
    }

    /**
     * 获取维修当时公里数
     *
     * @return maintenance_rpk - 维修当时公里数
     */
    public String getMaintenanceRpk() {
        return maintenanceRpk;
    }

    /**
     * 设置维修当时公里数
     *
     * @param maintenanceRpk 维修当时公里数
     */
    public void setMaintenanceRpk(String maintenanceRpk) {
        this.maintenanceRpk = maintenanceRpk == null ? null : maintenanceRpk.trim();
    }

    /**
     * 获取维修配件单编号
     *
     * @return maintenance_part_info_id - 维修配件单编号
     */
    public String getMaintenancePartInfoNum() {
        return maintenancePartInfoNum;
    }

    /**
     * 设置维修配件单编号
     *
     * @param maintenancePartInfoNum 维修配件单编号
     */
    public void setMaintenancePartInfoNum(String maintenancePartInfoNum) {
        this.maintenancePartInfoNum = maintenancePartInfoNum;
    }

    /**
     * 获取维修费用
     *
     * @return maintenance_costs - 维修费用
     */
    public Long getMaintenanceCosts() {
        return maintenanceCosts;
    }

    /**
     * 设置维修费用
     *
     * @param maintenanceCosts 维修费用
     */
    public void setMaintenanceCosts(Long maintenanceCosts) {
        this.maintenanceCosts = maintenanceCosts;
    }

    /**
     * 获取经手人
     *
     * @return handler - 经手人
     */
    public String getHandler() {
        return handler;
    }

    /**
     * 设置经手人
     *
     * @param handler 经手人
     */
    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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