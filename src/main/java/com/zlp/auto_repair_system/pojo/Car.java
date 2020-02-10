package com.zlp.auto_repair_system.pojo;

import javax.persistence.*;

@Table(name = "t_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "car_number")
    private String carNumber;

    private String name;

    private String color;

    private String type;

    /**
     * 排量
     */
    private String displacement;

    /**
     * 客户编号
     */
    @Column(name = "client_id")
    private Integer clientId;

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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取排量
     *
     * @return displacement - 排量
     */
    public String getDisplacement() {
        return displacement;
    }

    /**
     * 设置排量
     *
     * @param displacement 排量
     */
    public void setDisplacement(String displacement) {
        this.displacement = displacement == null ? null : displacement.trim();
    }

    /**
     * 获取客户编号
     *
     * @return client_id - 客户编号
     */
    public Integer getClientId() {
        return clientId;
    }

    /**
     * 设置客户编号
     *
     * @param clientId 客户编号
     */
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
}