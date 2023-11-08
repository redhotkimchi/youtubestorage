package com.example.youtubestorage.service.impl;

import com.example.youtubestorage.data.dao.MongoDao;
import com.example.youtubestorage.data.dto.UploadWaitDTO;
import com.example.youtubestorage.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MongoServiceImpl implements MongoService {

    MongoDao mongoDao;
    @Autowired
    public MongoServiceImpl(MongoDao mongoDao){this.mongoDao = mongoDao;}
    @Override
    public void saveToMongo(UploadWaitDTO.ForSave forSave) {
        mongoDao.saveInData(forSave);
    }
    @Override
    public List<UploadWaitDTO.ForGet> getFromMongo() {
        return mongoDao.GetFromData();
    }
}
