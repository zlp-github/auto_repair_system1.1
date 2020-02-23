package com.zlp.auto_repair_system.response;

import lombok.Data;

/**
 * Author: zlp
 * Date: 2020-02-17 22:58
 * Description:张立朋，写点注释吧!!
 */
@Data
public class LoginResponse {

    Integer id;
    String  name;
    String carNum;
    Integer roleId;

}
