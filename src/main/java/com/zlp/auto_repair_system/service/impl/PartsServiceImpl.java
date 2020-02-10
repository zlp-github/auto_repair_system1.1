package com.zlp.auto_repair_system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlp.auto_repair_system.dao.PartsDao;
import com.zlp.auto_repair_system.pojo.Parts;
import com.zlp.auto_repair_system.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Author: zlp
 * Date: 2020-01-29 19:38
 * Description:张立朋，写点注释吧!!
 */
@Service
public class PartsServiceImpl implements PartsService {

    @Autowired
    private PartsDao partsDao;

    @Override
    public Integer addParts(Parts parts) {
        return partsDao.addParts(parts);
    }

    @Override
    public Integer addPartsList(List<Parts> partsList) {
        return partsDao.addPartsList(partsList);
    }

    @Override
    public Parts findPartsById(Integer id) {
        return partsDao.findPartsById(id);
    }

    @Override
    public List<Parts> findPartsByName(String name) {
        return partsDao.findPartsByName(name);
    }

    @Override
    public List<Parts> getAllParts(Integer pageNumber, Integer pageSize) {
        PageHelper.offsetPage(pageNumber,pageSize);
        List<Parts> all = partsDao.getAllParts();
        PageInfo<Parts> partsPageInfo = new PageInfo<>(all);
        return partsPageInfo.getList();
    }

    @Override
    public Integer updateParts(Parts parts) {
        return partsDao.updateParts(parts);
    }

    @Override
    public Integer updatePartsList(List<Parts> partsList) {
        return partsDao.updatePartsList(partsList);
    }

    @Override
    public Integer deleteParts(Integer id) {
        return partsDao.deletePart(id);
    }

    @Override
    public Integer deletePartsList(List<Integer> ids) {
        return partsDao.deletePartsList(ids);
    }
}
