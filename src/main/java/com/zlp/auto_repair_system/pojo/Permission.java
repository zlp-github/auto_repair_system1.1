package com.zlp.auto_repair_system.pojo;

import javax.persistence.*;

@Table(name = "t_permission")
public class Permission {
    /**
     * 菜单编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单分类
     */
    private String category;

    /**
     * 上级菜单id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 获取菜单编号
     *
     * @return id - 菜单编号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置菜单编号
     *
     * @param id 菜单编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取菜单分类
     *
     * @return category - 菜单分类
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置菜单分类
     *
     * @param category 菜单分类
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * 获取上级菜单id
     *
     * @return parent_id - 上级菜单id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置上级菜单id
     *
     * @param parentId 上级菜单id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取菜单名称
     *
     * @return name - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}