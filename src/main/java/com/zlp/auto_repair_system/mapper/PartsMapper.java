package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.Parts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PartsMapper extends CommonMapper<Parts> {
    Integer updatePartsList(List<Parts> partsList);
}