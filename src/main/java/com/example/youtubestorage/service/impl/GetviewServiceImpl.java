package com.example.youtubestorage.service.impl;

import com.example.youtubestorage.data.dao.KpopGroupDao;
import com.example.youtubestorage.data.dto.GroupShowDTO;
import com.example.youtubestorage.service.GetViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetviewServiceImpl implements GetViewService {
    KpopGroupDao kpopGroupDao;
    @Autowired
    public GetviewServiceImpl(KpopGroupDao kpopGroupDao){this.kpopGroupDao = kpopGroupDao;}
    @Override
    public Optional<List<GroupShowDTO.ForGet>> getAllShows(long team_id) {
        return kpopGroupDao.getAllShows(team_id);
    }
}
