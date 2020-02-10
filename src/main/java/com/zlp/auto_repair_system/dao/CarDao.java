package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.mapper.CarMapper;
import com.zlp.auto_repair_system.pojo.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:17
 * Description:张立朋，写点注释吧!!
 */
@Repository
public class CarDao {

    @Autowired
    private CarMapper carMapper;

    //添加车辆信息
    public Integer addCar(Car car){
        return carMapper.insert(car);
    }

    //批量添加车辆信息
    public Integer addCarList(List<Car> cars){
        return carMapper.insertList(cars);
    }

    //查找指定Id的车辆信息
    public Car findCarById(Integer id){
        return carMapper.selectByPrimaryKey(id);
    }

    //查找所有的车辆信息
    public List<Car> getAllCars(){
        return carMapper.selectAll();
    }

    //更新车辆信息
    public Integer updateCar(Car car){
        return carMapper.updateByPrimaryKeySelective(car);
    }

    //批量更新车辆信息
    public Integer updateList(List<Car> carList){
        return carMapper.updateCarList(carList);
    }

    //删除指定id的车辆信息
    public Integer deleteCarById(Integer id){
        return carMapper.deleteByPrimaryKey(id);
    }

    //批量删除车辆信息
    public Integer deleteCarList(List<Integer> ids){
        Example example = new Example(Car.class);
        example.createCriteria().andIn("id",ids);
        return carMapper.deleteByExample(example);
    }
}
