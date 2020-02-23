package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Client;
import com.zlp.auto_repair_system.pojo.Employee;
import com.zlp.auto_repair_system.response.LoginResponse;
import com.zlp.auto_repair_system.service.ClientService;
import com.zlp.auto_repair_system.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-15 10:50
 * Description:登录API
 */
@RestController
public class LoginController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private EmployeeService employeeService;

    Integer id = 0;

    Integer roleId = 0;

    String name = null;

    String carNum = null;

    @PostMapping("/login")
    public SzpJsonResult<LoginResponse> userLogin(@RequestParam(value = "nickName") String nickName, @RequestParam(value = "password") String password, @RequestParam(value = "roleName") String roleName, HttpServletRequest request){
        HttpSession session = request.getSession();
        if(roleName.equals("员工")){
            List<Employee> employees = employeeService.employeeLogin(nickName, password);
            for (Employee employee : employees) {
                id = employee.getId();
                name = employee.getName();
                roleId = employee.getRoleId();
            }
            if(employees.size() != 0){
                session.setAttribute("nickName",nickName);
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setId(id);
                loginResponse.setRoleId(roleId);
                loginResponse.setName(name);
                return SzpJsonResult.ok(loginResponse);
            }

        }
        else if(roleName.equals("客户")){
            List<Client> clientResult = clientService.clientLogin(nickName, password);
            for (Client client : clientResult) {
                id = client.getId();
                name = client.getName();
                roleId = client.getRoleId();
                carNum = client.getCarNumber();
            }
            if(clientResult.size() !=0){
                session.setAttribute("nickName",nickName);
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setRoleId(roleId);
                loginResponse.setName(name);
                loginResponse.setId(id);
                loginResponse.setCarNum(carNum);
                return SzpJsonResult.ok(loginResponse);
            }

        }
        else if(roleName.equals("管理员")){
            List<Employee> employeeResult = employeeService.employeeLogin(nickName, password);
            for (Employee employee : employeeResult) {
                id = employee.getId();
                name = employee.getName();
                roleId = employee.getRoleId();
            }
            if (employeeResult.size() != 0){
                session.setAttribute("nickName",nickName);
                LoginResponse loginResponse = new LoginResponse();
                loginResponse.setRoleId(roleId);
                loginResponse.setId(id);
                loginResponse.setName(name);
                return SzpJsonResult.ok(loginResponse);
            }
        }
        else
            session.setAttribute("nickName","");
            return SzpJsonResult.ok("");
    }
}
