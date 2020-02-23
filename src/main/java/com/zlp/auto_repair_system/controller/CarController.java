package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.mapper.CarMapper;
import com.zlp.auto_repair_system.pojo.Car;
import com.zlp.auto_repair_system.response.GetAllCarResponse;
import com.zlp.auto_repair_system.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Author: zlp
 * Date: 2020-02-04 23:52
 * Description:车辆API
 */
@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("add/car")
    public SzpJsonResult<Integer> addCar(@RequestBody Car car){
        return SzpJsonResult.ok(carService.addCar(car));
    }

//    @PostMapping("add/carList")
//    public SzpJsonResult<Integer> addCarList(List<Car> carList){
//        return SzpJsonResult.ok(carService.addCarList(carList));
//    }

    @GetMapping("get/allCar")
    public SzpJsonResult<Car> getAllCar(@RequestParam(value = "pageNumber" ,defaultValue = "1") Integer pageNumber,
                                        @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        GetAllCarResponse allCars = carService.getAllCars(pageNumber, pageSize);
        return  SzpJsonResult.ok(allCars);
    }

    @GetMapping("find/carById")
    public SzpJsonResult<Car> findCarById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(carService.findCarById(id));
    }

    @PostMapping("update/car")
    public SzpJsonResult<Integer> updateCar(@RequestBody Car car){
        return SzpJsonResult.ok(carService.updateCar(car));
    }

    @PostMapping("delete/carById")
    public SzpJsonResult<Integer> deleteCarById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(carService.deleteCarById(id));
    }
}
