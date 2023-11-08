package com.example.youtubestorage.data.dao;

import com.example.youtubestorage.data.dto.GroupShowDTO;
import com.example.youtubestorage.data.dto.KpopGroupDTO;

import java.util.List;
import java.util.Optional;

public interface KpopGroupDao {
    void saveKpopGroup(KpopGroupDTO.ForSaveDto forSaveDto);
    Optional<List<GroupShowDTO.ForGet>> getAllShows(long team_id);
}
