package com.zlp.auto_repair_system.service;


import com.zlp.auto_repair_system.pojo.Parts;

import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:30
 * Description:张立朋，写点注释吧!!
 */
public interface PartsService {

    Integer addParts(Parts parts);

    Integer addPartsList(List<Parts> partsList);

    Parts findPartsById(Integer id);

    List<Parts> findPartsByName(String name);

    List<Parts> getAllParts(Integer pageNumber,Integer pageSize);

    Integer updateParts(Parts parts);

    Integer updatePartsList(List<Parts> partsList);

    Integer deleteParts(Integer id);

    Integer deletePartsList(List<Integer> ids);
}
