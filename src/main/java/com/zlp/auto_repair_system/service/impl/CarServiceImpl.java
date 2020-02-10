package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.CarDao;
import com.zlp.auto_repair_system.pojo.Car;
import com.zlp.auto_repair_system.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:33
 * Description:car
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public Integer addCar(Car car) {
        return carDao.addCar(car);
    }

    @Override
    public Integer addCarList(List<Car> carList) {
        return carDao.addCarList(carList) ;
    }

    @Override
    public Car findCarById(Integer id) {
        return carDao.findCarById(id);
    }

    @Override
    public List<Car> getAllCars(Integer pageNumber, Integer pageSize) {
        PageHelper.offsetPage(pageNumber,pageSize);
        List<Car> all = carDao.getAllCars();
        PageInfo<Car> carPageInfo = new PageInfo<>(all);
        return carPageInfo.getList();
    }

    @Override
    public Integer updateCar(Car car) {
        return carDao.updateCar(car);
    }

    @Override
    public Integer updateCarList(List<Car> cars) {
        return carDao.updateList(cars);
    }

    @Override
    public Integer deleteCarById(Integer id) {
        return carDao.deleteCarById(id);
    }

    @Override
    public Integer deleteCarList(List<Integer> ids) {
        return carDao.deleteCarList(ids);
    }
}
