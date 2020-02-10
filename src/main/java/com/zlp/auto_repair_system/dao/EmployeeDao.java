package com.zlp.auto_repair_system.dao;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.mapper.EmployeeMapper;
import com.zlp.auto_repair_system.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 14:54
 * Description:张立朋，写点注释吧!!
 */
@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeMapper employeeMapper;

    //添加新员工信息
    public Integer addEmployee(Employee employee){
        return employeeMapper.insert(employee);
    }

    //批量添加员工信息
    public Integer addEmployeeList(List<Employee> employees){
        return employeeMapper.insertList(employees);
    }

    //更新员工信息
    public Integer updateEmployee(Employee employee){
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }

    //批量更新员工信息
    public Integer updateEmployeeList(List<Employee> employees){
        return employeeMapper.updateUserByList(employees);
    }

    //通过id查找指定员工信息
    public Employee findEmployeeById(Integer id){
        return employeeMapper.selectByPrimaryKey(id);
    }

    //通过模糊查询
    public List<Employee> findEmployeeByName(String name){
        Example example = new Example(Employee.class);
        example.createCriteria()
                .andLike("name","%"+name+"%");
        return employeeMapper.selectByExample(example);
    }

    //查找所有员工信息
    public List<Employee> getAllEmployeeInfo(){
        return employeeMapper.selectAll();
    }

    //删除指定员工
    public Integer deleteEmployee(Integer id){
        return employeeMapper.deleteByPrimaryKey(id);
    }

    //批量删除员工
    public Integer deleteEmployeeList(List<Integer> ids){
        Example example = new Example(Employee.class);
        example.createCriteria().andIn("id",ids);
        return employeeMapper.deleteByExample(example);
    }

    //员工登录
    public SzpJsonResult<Employee> employeeLogin(String nickName, String password){
      Example example = new Example(Employee.class);
      example.createCriteria().andEqualTo("nickName",nickName).andEqualTo("password",password);
      return SzpJsonResult.ok(employeeMapper.selectByExample(example));
    }
}
