package com.example.MilvusDemo.service;

import io.milvus.client.MilvusServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MilvusService {

    @Autowired
    MilvusServiceClient milvusServiceClient;

    public String testMilvusConnection() {
        return null;
    }

    public String createUser() {
        return null;
    }
}
