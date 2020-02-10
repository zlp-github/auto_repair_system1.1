package com.zlp.auto_repair_system.mapper;

import com.zlp.auto_repair_system.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper extends CommonMapper<Employee> {
    Integer updateUserByList(List<Employee> employees);
}