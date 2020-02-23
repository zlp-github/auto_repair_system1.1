package com.zlp.auto_repair_system.pojo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "t_car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "car_number")
    private String carNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "color")
    private String color;

    @Column(name = "type")
    private String type;

    /**
     * 排量
     */
    @Column(name = "displacement")
    private String displacement;

    /**
     * 客户编号
     */
    @Column(name = "client_name")
    private String clientName;
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
     * @return client_name- 客户编号
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * 设置客户编号
     *
     * @param clientName 客户编号
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}