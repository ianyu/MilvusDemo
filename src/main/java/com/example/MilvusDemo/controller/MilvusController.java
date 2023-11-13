package com.example.MilvusDemo.controller;

import io.milvus.client.MilvusServiceClient;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MilvusController {

    private final MilvusServiceClient milvusServiceClient;

    @Autowired
    public MilvusController(MilvusServiceClient milvusServiceClient) {
        this.milvusServiceClient = milvusServiceClient;
    }

    @GetMapping("/milvus-info")
    public String getMilvusInfo() {
        // 使用 milvusClient 进行 Milvus 操作
        // 例如：milvusClient.getServerStatus();
        //milvusServiceClient.listDatabases().getMessage();

        return "Milvus Info: " + DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:SS") + "</br>" + milvusServiceClient.listDatabases().toString() + "</br>" + milvusServiceClient.getVersion().toString();
    }
}
