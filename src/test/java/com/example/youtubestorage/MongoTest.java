package com.example.youtubestorage;

import com.example.youtubestorage.data.dao.MongoDao;
import com.example.youtubestorage.data.dto.UploadWaitDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {

    private final MongoDao mongoDao;

    @Autowired
    public MongoTest(MongoDao mongoDao) {
        this.mongoDao = mongoDao;
    }

    @Test
    public void saveData(){
        UploadWaitDTO.ForSave forSave = UploadWaitDTO.ForSave.builder()
                .teamId(2)
                .views(123123)
                .youtubeType("dance")
                .youtubeLink("www.youtube.con")
                .build();
        mongoDao.saveInData(forSave);

    }
}
