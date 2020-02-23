package com.zlp.auto_repair_system.controller;

import com.zlp.auto_repair_system.common.SzpJsonResult;
import com.zlp.auto_repair_system.pojo.Parts;
import com.zlp.auto_repair_system.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Author: zlp
 * Date: 2020-02-05 15:55
 * Description:配件信息API
 */
@RestController
public class PartsController {

    @Autowired
    private PartsService partsService;

    @PostMapping("add/parts")
    public SzpJsonResult<Integer> addParts(@RequestBody Parts parts){
        return SzpJsonResult.ok(partsService.addParts(parts));
    }

    @PostMapping("update/parts")
    public SzpJsonResult<Integer>updateParts(@RequestBody Parts parts){
        return SzpJsonResult.ok(partsService.updateParts(parts));
    }

    @PostMapping("delete/partsById")
    public SzpJsonResult<Integer> deletePartsById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(partsService.deleteParts(id));
    }

    @GetMapping("find/partsById")
    public SzpJsonResult<Parts> findPartsById(@RequestParam(value = "id") Integer id){
        return SzpJsonResult.ok(partsService.findPartsById(id));
    }

    @GetMapping("find/partsName")
    public SzpJsonResult<Parts> findPartsByName(@RequestParam(value = "name") String name){
        return SzpJsonResult.ok(partsService.findPartsByName(name));
    }

    @GetMapping("get/allParts")
    public SzpJsonResult<Parts> getAllParts(@RequestParam(value = "pageNumber",defaultValue = "1") Integer pageNumber,
                                            @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize){
        return SzpJsonResult.ok(partsService.getAllParts(pageNumber,pageSize));
    }
}
