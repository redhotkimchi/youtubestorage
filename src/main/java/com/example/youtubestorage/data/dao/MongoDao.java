package com.example.youtubestorage.data.dao;

import com.example.youtubestorage.data.dto.UploadWaitDTO;

import java.util.List;
import java.util.Optional;

public interface MongoDao {
    void saveInData(UploadWaitDTO.ForSave forSave);
    List<UploadWaitDTO.ForGet> GetFromData();
    void deleteInData(long id);
    Optional<UploadWaitDTO.ForSingleGet> getSingleData(long id);
}
