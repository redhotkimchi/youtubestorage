package com.example.youtubestorage.service;

import com.example.youtubestorage.data.dto.UploadWaitDTO;

import java.util.List;

public interface MongoService {
    void saveToMongo(UploadWaitDTO.ForSave forSave);
    List<UploadWaitDTO.ForGet> getFromMongo();
}
