package com.example.management.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.management.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wyb on 2018/5/14.
 */
@RestController
@RequestMapping("/table")
public class TableController {

    @Autowired
    private TableService tableService;

    /**
     * 获取对象属性列表
     *
     * @param objectId
     * @return
     */
    @GetMapping("/property")
    public JSONObject getProperty(Long objectId) {
        return tableService.propertyList(objectId);
    }
}
