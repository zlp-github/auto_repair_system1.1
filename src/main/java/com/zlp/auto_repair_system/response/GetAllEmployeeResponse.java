package com.zlp.auto_repair_system.response;

import com.zlp.auto_repair_system.pojo.Employee;
import lombok.Data;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-15 23:12
 * Description:张立朋，写点注释吧!!
 */
@Data
public class GetAllEmployeeResponse {
    List<Employee> employeeList;
    Long total;
}
