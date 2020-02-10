package com.zlp.auto_repair_system.pojo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "t_parts")
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String type;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 配件剩余量
     */
    private String surplus;

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
     * 获取单价
     *
     * @return price - 单价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置单价
     *
     * @param price 单价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取配件剩余量
     *
     * @return surplus - 配件剩余量
     */
    public String getSurplus() {
        return surplus;
    }

    /**
     * 设置配件剩余量
     *
     * @param surplus 配件剩余量
     */
    public void setSurplus(String surplus) {
        this.surplus = surplus == null ? null : surplus.trim();
    }
}