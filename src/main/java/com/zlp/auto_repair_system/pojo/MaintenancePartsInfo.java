package com.zlp.auto_repair_system.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_maintenance_parts_info")
public class MaintenancePartsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 维修配件单号
     */
    @Column(name = "maintenance_parts_info_num")
    private String maintenancePartsInfoNum;

    /**
     * 车牌号
     */
    @Column(name = "car_number")
    private String carNumber;

    @Column(name = "part_id")
    private String partId;

    @Column(name = "part_name")
    private String partName;

    @Column(name = "part_number")
    private Integer partNumber;

    /**
     * 总价
     */
    @Column(name = "total_price")
    private BigDecimal totalPrice;

    /**
     * 经手人
     */
    private String handler;

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
     * 获取维修配件单号
     *
     * @return maintenance_parts_info_num - 维修配件单号
     */
    public String getMaintenancePartsInfoNum() {
        return maintenancePartsInfoNum;
    }

    /**
     * 设置维修配件单号
     *
     * @param maintenancePartsInfoNum 维修配件单号
     */
    public void setMaintenancePartsInfoNum(String maintenancePartsInfoNum) {
        this.maintenancePartsInfoNum = maintenancePartsInfoNum == null ? null : maintenancePartsInfoNum.trim();
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
     * @return part_id
     */
    public String getPartId() {
        return partId;
    }

    /**
     * @param partId
     */
    public void setPartId(String partId) {
        this.partId = partId == null ? null : partId.trim();
    }

    /**
     * @return part_name
     */
    public String getPartName() {
        return partName;
    }

    /**
     * @param partName
     */
    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    /**
     * @return part_number
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    /**
     * @param partNumber
     */
    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * 获取总价
     *
     * @return total_price - 总价
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * 设置总价
     *
     * @param totalPrice 总价
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
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