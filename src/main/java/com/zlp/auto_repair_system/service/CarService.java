package com.zlp.auto_repair_system.service;


import com.zlp.auto_repair_system.pojo.Car;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:23
 * Description:张立朋，写点注释吧!!
 */

public interface CarService {

    Integer addCar(Car car);
    Integer addCarList(List<Car> carList);
    Car findCarById(Integer id);
    List<Car> getAllCars(Integer pageNumber,Integer pageSize);
    Integer updateCar(Car car);
    Integer updateCarList(List<Car> cars);
    Integer deleteCarById(Integer id);
    Integer deleteCarList(List<Integer> ids);

}
