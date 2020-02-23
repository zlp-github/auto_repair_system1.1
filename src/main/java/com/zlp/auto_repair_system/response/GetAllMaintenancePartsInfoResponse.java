package com.zlp.auto_repair_system.response;

import com.zlp.auto_repair_system.pojo.MaintenancePartsInfo;
import lombok.Data;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-02-16 12:39
 * Description:张立朋，写点注释吧!!
 */
@Data
public class GetAllMaintenancePartsInfoResponse {

    List<MaintenancePartsInfo> maintenancePartsInfoList;
    Long total;
}
