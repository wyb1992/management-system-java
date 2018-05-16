package com.example.management.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.management.service.TableService;
import com.example.management.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

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
//    @RequiresPermissions("property:list")
    @GetMapping("/property")
    public JSONObject getProperty(Long objectId) {
        return tableService.propertyList(objectId);
    }

    /**
     * 获取对象属性列表
     *
     * @param request
     * @return
     */
    @GetMapping("/data")
    public JSONObject dataList(HttpServletRequest request) {
        return tableService.dataList(CommonUtil.request2Json(request));
    }

    /**
     * 获取对象属性列表
     *
     * @param requestJson
     * @return
     */
    @PostMapping("/updateDetail")
    public JSONObject updateDetail(@RequestBody JSONObject requestJson) {
        return tableService.updateDetail(requestJson);
    }
}
