package com.example.management.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by wyb on 2018/5/14.
 */
public interface TableService {

    /**
     * 获取对象属性
     *
     * @param objectId
     * @return
     */
    JSONObject propertyList(Long objectId);
}
