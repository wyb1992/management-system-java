package com.example.management.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by wyb on 2018/5/14.
 */
public interface TableDao {

    List<JSONObject> propertyList(Long objectId);

    String getObject(Long objectId);

    List<JSONObject> dataList(JSONObject jsonObject);

    void updateDetail(JSONObject requestJson);
}
