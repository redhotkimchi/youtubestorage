package com.example.youtubestorage.data.dao.impl;

import com.example.youtubestorage.data.dao.GroupShowDao;
import com.example.youtubestorage.data.dto.GroupShowDTO;
import com.example.youtubestorage.data.entity.GroupShowEntity;
import com.example.youtubestorage.data.repository.GroupShowRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class GroupShowDaoImpl implements GroupShowDao {
    GroupShowRepository groupShowRepository;
    public GroupShowDaoImpl(GroupShowRepository groupShowRepository){this.groupShowRepository = groupShowRepository; }
    @Override
    public void forSave(GroupShowDTO.@NotNull ForSave forSave) {
        GroupShowEntity groupShowEntity = GroupShowEntity.builder()
                .views(forSave.getViews())
                .youtubeLink(forSave.getYoutubeLink())
                .youtubeType(forSave.getYoutubeType())
                .youtubeDate(forSave.getYoutubeDate())
                .teamId(forSave.getTeamId())
                .build();

        groupShowRepository.save(groupShowEntity);
    }

    @Override
    public GroupShowDTO.ForGet forGet(long id) {
        GroupShowEntity groupShowEntity = groupShowRepository.getReferenceById(id);
        GroupShowDTO.ForGet forGet = GroupShowDTO.ForGet.builder()
                .views(groupShowEntity.getViews())
                .youtubeType(groupShowEntity.getYoutubeType())
                .youtubeLink(groupShowEntity.getYoutubeLink())
                .youtubeDate(groupShowEntity.getYoutubeDate())
                .teamId(groupShowEntity.getTeamId())
                .build();

        return forGet;
    }
}
