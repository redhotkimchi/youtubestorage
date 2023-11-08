package com.example.youtubestorage.controller;

import com.example.youtubestorage.data.dto.GroupShowDTO;
import com.example.youtubestorage.service.GetViewService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shows")
public class Shows {
    GetViewService getViewService;
    @Autowired
    public Shows (GetViewService getViewService){this.getViewService = getViewService;}
    @GetMapping(value = "/getAll/{teamId}")
    public Optional<List<GroupShowDTO.ForGet>> ShowAll(@PathVariable Long teamId){
        return getViewService.getAllShows(teamId);
    }
    

}
