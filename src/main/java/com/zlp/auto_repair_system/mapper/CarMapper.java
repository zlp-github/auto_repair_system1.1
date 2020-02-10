package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.Car;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CarMapper extends CommonMapper<Car> {
    Integer updateCarList(List<Car> carList);
}