package com.zlp.auto_repair_system.response;

import com.zlp.auto_repair_system.pojo.Parts;
import lombok.Data;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-15 23:18
 * Description:张立朋，写点注释吧!!
 */
@Data
public class GetAllPartResponse {

    List<Parts> partsList;
    Long total;

}
