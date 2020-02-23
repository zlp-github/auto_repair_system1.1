package com.zlp.auto_repair_system.service;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Employee;
import com.zlp.auto_repair_system.response.GetAllEmployeeResponse;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 15:15
 * Description:张立朋，写点注释吧!!
 */

public interface EmployeeService {

    Integer addEmployee(Employee employee);
    Integer addEmployeeList(List<Employee> employeeList);
    Employee findEmployeeById(Integer id);
    List<Employee> findEmployeeByName(String name);
    GetAllEmployeeResponse getAllEmployee(Integer pageNumber, Integer pageSize);
    Integer updateEmployee(Employee employee);
    Integer updateEmployeeList(List<Employee> employee);
    Integer deleteEmployeeById(Integer id);
    Integer deleteEmployeeList(List<Integer> ids);
    List<Employee> employeeLogin(String nick_name, String password);
}
