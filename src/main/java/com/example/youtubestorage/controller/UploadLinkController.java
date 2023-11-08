package com.example.youtubestorage.controller;


import com.example.youtubestorage.data.dto.UploadWaitDTO;
import com.example.youtubestorage.service.MongoService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uploadLink")
public class UploadLinkController {
    MongoService mongoService;
    public UploadLinkController(MongoService mongoService){this.mongoService = mongoService;}
    @PostMapping(value = "/saveToMongo")
    public String saveToMongo(@Valid @RequestBody UploadWaitDTO.ForSave forsave){
        mongoService.saveToMongo(forsave);
        return "job Done";
    }
    @GetMapping(value = "/getFromMongo")
    public List<UploadWaitDTO.ForGet> GetFromMongo(){
        return mongoService.getFromMongo();
    }

}
