package com.example.management.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.management.dao.TableDao;
import com.example.management.service.TableService;
import com.example.management.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wyb on 2018/5/14.
 */
@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableDao tableDao;

    @Override
    public JSONObject propertyList(Long objectId) {
        List<JSONObject> list = tableDao.propertyList(objectId);
        return CommonUtil.successPage(list);
    }

    @Override
    public JSONObject dataList(JSONObject requestJson) {
        String tableName = tableDao.getObject(requestJson.getLong("objectId"));
        requestJson.put("name", tableName);
        List<JSONObject> list = tableDao.dataList(requestJson);
        return CommonUtil.successPage(list);
    }

    @Override
    public JSONObject updateDetail(JSONObject requestJson) {
        tableDao.updateDetail(requestJson);
        return CommonUtil.successJson();
    }
}
