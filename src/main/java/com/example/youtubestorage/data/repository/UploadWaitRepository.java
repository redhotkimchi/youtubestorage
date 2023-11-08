package com.example.youtubestorage.data.repository;

import com.example.youtubestorage.data.entity.UploadWaitEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UploadWaitRepository extends MongoRepository<UploadWaitEntity, Long> {

}
