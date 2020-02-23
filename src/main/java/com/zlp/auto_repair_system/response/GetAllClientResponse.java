package com.zlp.auto_repair_system.response;

import com.zlp.auto_repair_system.pojo.Client;
import lombok.Data;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-15 23:13
 * Description:张立朋，写点注释吧!!
 */
@Data
public class GetAllClientResponse {

    List<Client> clientList;
    Long total;
}
