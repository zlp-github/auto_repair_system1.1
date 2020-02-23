package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Employee;
import com.zlp.auto_repair_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 17:22
 * Description:员工信息API
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("get/allEmployee")
    public SzpJsonResult<Employee> getAllEmployee(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(employeeService.getAllEmployee(pageNumber,pageSize));
    }

    @GetMapping("find/employee/byId")
    public SzpJsonResult<Employee> findEmployeeById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(employeeService.findEmployeeById(id));
    }

    @GetMapping("find/employee/byName")
    public SzpJsonResult<Employee> findEmployeeByName(@RequestParam(value = "name") String name){
        return SzpJsonResult.ok(employeeService.findEmployeeByName(name));
    }

    @PostMapping("add/employee")
    public SzpJsonResult<Integer> addEmployee(@RequestBody Employee employee){
        employee.setBirthday(new Date());
        employee.setRoleId(1);
        return SzpJsonResult.ok(employeeService.addEmployee(employee));
    }

//    //批量添加,JSON格式
//    @PostMapping("add/employeeList")
//    public Integer addEmployeeList(@RequestBody List<Employee> employees){
//        return employeeService.addEmployeeList(employees);
//    }

    @PostMapping("update/employee")
    public SzpJsonResult<Integer> updateEmployee(@RequestBody Employee employee){
        employee.setUpdateTime(new Date());
        return SzpJsonResult.ok(employeeService.updateEmployee(employee));
    }

//    @PostMapping("update/employeeList")
//    public Integer updateEmployeeList(List<Employee> employee){
//        return employeeService.updateEmployeeList(employee);
//    }

    @PostMapping("delete/employee/byId")
    public SzpJsonResult<Integer> deleteEmployeeById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(employeeService.deleteEmployeeById(id));
    }

    @PostMapping("delete/employeeList")
    public SzpJsonResult<Integer> deleteEmployeeList(@RequestBody List<Integer> ids){
        return SzpJsonResult.ok(employeeService.deleteEmployeeList(ids));
    }

    @GetMapping("login/employee")
    public SzpJsonResult<Employee> employeeLogin(@RequestParam(value = "nickName") String nickName,
                                                 @RequestParam(value = "password") String password){
        return SzpJsonResult.ok(employeeService.employeeLogin(nickName,password));
    }
}
