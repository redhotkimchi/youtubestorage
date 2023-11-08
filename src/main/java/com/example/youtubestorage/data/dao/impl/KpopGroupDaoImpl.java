package com.example.youtubestorage.data.dao.impl;

import com.example.youtubestorage.data.dao.KpopGroupDao;
import com.example.youtubestorage.data.dto.GroupShowDTO;
import com.example.youtubestorage.data.dto.KpopGroupDTO;
import com.example.youtubestorage.data.dto.UploadWaitDTO;
import com.example.youtubestorage.data.entity.GroupShowEntity;
import com.example.youtubestorage.data.entity.KpopGroupEntity;
import com.example.youtubestorage.data.entity.UploadWaitEntity;
import com.example.youtubestorage.data.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class KpopGroupDaoImpl implements KpopGroupDao {
    GroupRepository groupRepository;
    public KpopGroupDaoImpl(GroupRepository groupRepository){this.groupRepository = groupRepository;}
    @Override
    public void saveKpopGroup(KpopGroupDTO.ForSaveDto forSaveDto) {
        KpopGroupEntity kpopGroupEntity = KpopGroupEntity.builder()
                .GroupGender(forSaveDto.getGroupGender())
                .GroupName(forSaveDto.getGroupName())
                .build();
        groupRepository.save(kpopGroupEntity);
    }

    @Override
    public Optional<List<GroupShowDTO.ForGet>> getAllShows(long team_id) {
        List<GroupShowEntity> groupShowEntities = groupRepository.getAllShows(team_id);
        List<GroupShowDTO.ForGet> ForGetList = new ArrayList<>();
        for (GroupShowEntity E : groupShowEntities) {
            GroupShowDTO.ForGet forGet = GroupShowDTO.ForGet.builder()
                    .teamId(E.getTeamId())
                    .youtubeType(E.getYoutubeType())
                    .views(E.getViews())
                    .youtubeLink(E.getYoutubeLink())
                    .youtubeDate(E.getYoutubeDate())
                    .build();

            ForGetList.add(forGet);
        }
        return Optional.of(ForGetList);
    }


}
