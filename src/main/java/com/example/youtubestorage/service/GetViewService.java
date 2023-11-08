package com.example.youtubestorage.service;

import com.example.youtubestorage.data.dto.GroupShowDTO;

import java.util.List;
import java.util.Optional;

public interface GetViewService {
    Optional<List<GroupShowDTO.ForGet>> getAllShows(long team_id);
}
