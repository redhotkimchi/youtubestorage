package com.example.youtubestorage.data.dao.impl;

import com.example.youtubestorage.data.dao.MongoDao;
import com.example.youtubestorage.data.dto.UploadWaitDTO;
import com.example.youtubestorage.data.entity.UploadWaitEntity;
import com.example.youtubestorage.data.repository.UploadWaitRepository;
import com.example.youtubestorage.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MongoDaoImpl implements MongoDao {
    UploadWaitRepository uploadWaitRepository;
    SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    public MongoDaoImpl(UploadWaitRepository uploadWaitRepository, SequenceGeneratorService sequenceGeneratorService) {
        this.uploadWaitRepository = uploadWaitRepository;
        this.sequenceGeneratorService = sequenceGeneratorService;
    }
    @Override
    public void saveInData(UploadWaitDTO.ForSave forSave) {
        UploadWaitEntity uploadWaitEntity = UploadWaitEntity.builder()
                .teamId(forSave.getTeamId())
                .views(forSave.getViews())
                .youtubeType(forSave.getYoutubeType())
                .youtubeLink(forSave.getYoutubeLink())
                .youtubeDate(forSave.getYoutubeDate())
                .id(sequenceGeneratorService.generateSequence(UploadWaitEntity.SEQUENCE_NAME))
                .build();

        uploadWaitRepository.save(uploadWaitEntity);
    }
    @Override
    public List<UploadWaitDTO.ForGet> GetFromData() {
        List<UploadWaitEntity> uploadWaitEntityList = uploadWaitRepository.findAll();

        List<UploadWaitDTO.ForGet> ForGetList = new ArrayList<>();
        for (UploadWaitEntity E : uploadWaitEntityList) {
            UploadWaitDTO.ForGet forGet = UploadWaitDTO.ForGet.builder()
                    .teamId(E.getTeamId())
                    .youtubeType(E.getYoutubeType())
                    .views(E.getViews())
                    .youtubeLink(E.getYoutubeLink())
                    .youtubeDate(E.getYoutubeDate())
                    .documentsId(E.getId())
                    .build();

            ForGetList.add(forGet);
        }
        return ForGetList;
    }
    @Override
    public void deleteInData(long id) {
        uploadWaitRepository.deleteById(id);
    }
    @Override
    public Optional<UploadWaitDTO.ForSingleGet> getSingleData(long id) {
        Optional<UploadWaitEntity> uploadWaitEntity = uploadWaitRepository.findById(id);

        if (uploadWaitEntity.isPresent()) {
            UploadWaitDTO.ForSingleGet forSingleGet = UploadWaitDTO.ForSingleGet.builder()
                    .teamId(uploadWaitEntity.get().getTeamId())
                    .documentsId(uploadWaitEntity.get().getId())
                    .views(uploadWaitEntity.get().getViews())
                    .youtubeDate(uploadWaitEntity.get().getYoutubeDate())
                    .youtubeLink(uploadWaitEntity.get().getYoutubeLink())
                    .youtubeType(uploadWaitEntity.get().getYoutubeType())
                    .build();

            return Optional.of(forSingleGet);
        } else {
            return Optional.empty();
        }
    }
}
