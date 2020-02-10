package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.pojo.Employee;
import com.zlp.auto_repair_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-05 0:08
 * Description:张立朋，写点注释吧!!
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("add/employee")
    public Integer addEmployee(Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("find/employeeById")
    public Employee findEmployeeById(Integer id){
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("find/employeeByName")
    public List<Employee> findEmployeeByName(String name){
        return employeeService.findEmployeeByName(name);
    }

    @GetMapping("get/allEmployee")
    public List<Employee> getAllEmployee(Integer pageSize,Integer pageNumber){
        return employeeService.getAllEmployee(pageSize,pageNumber);
    }

    @PostMapping("update/employee")
    public Integer updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @PostMapping("delete/employeeById")
    public Integer deleteEmployeeById(Integer id){
        return employeeService.deleteEmployeeById(id);
    }

}
