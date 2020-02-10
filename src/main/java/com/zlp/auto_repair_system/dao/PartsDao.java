package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.PartsMapper;
import com.zlp.auto_repair_system.pojo.Parts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * Author: zlp
 * Date: 2020-01-29 19:19
 * Description:配件信息
 */
@Repository
public class PartsDao {

    @Autowired
    private PartsMapper partsMapper;

    //添加配件信息
    public Integer addParts(Parts part){
        return partsMapper.insert(part);
    }

    //批量添加配件
    public Integer addPartsList(List<Parts> partsList){
        return partsMapper.insertList(partsList);
    }

    //通过id查找配件
    public Parts findPartsById(Integer id){
        return partsMapper.selectByPrimaryKey(id);
    }

    //通过配件名称查找配件
    public List<Parts> findPartsByName(String name){
        Example example = new Example(Parts.class);
        example.createCriteria().andLike("name","%"+name+"%");
        return partsMapper.selectByExample(example);
    }

    //获取所有配件信息
    public List<Parts> getAllParts(){
        return partsMapper.selectAll();
    }

    //更新配件信息
    public Integer updateParts(Parts parts){
        return partsMapper.updateByPrimaryKeySelective(parts);
    }

    //批量更新配件信息
    public Integer updatePartsList(List<Parts> partsList){
        return partsMapper.updatePartsList(partsList);
    }

    //删除配件
    public Integer deletePart(Integer id){
        return partsMapper.deleteByPrimaryKey(id);
    }

    //批量删除配件
    public Integer deletePartsList(List<Integer> ids){
        Example example = new Example(Parts.class);
        example.createCriteria().andIn("id",ids);
        return partsMapper.deleteByExample(example);
    }
}
