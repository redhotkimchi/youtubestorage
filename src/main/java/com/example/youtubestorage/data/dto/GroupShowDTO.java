package com.example.youtubestorage.data.dto;

import com.example.youtubestorage.data.entity.KpopGroupEntity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

public class GroupShowDTO {
    @Builder
    @Getter
    public static class ForSave{
        private String youtubeLink;
        private String youtubeType;
        private Long views;
        private String youtubeDate;
        private KpopGroupEntity teamId;
    }

    @Builder
    @Getter
    public static class ForGet{
        private String youtubeLink;
        private String youtubeType;
        private Long views;
        private String youtubeDate;
        private KpopGroupEntity teamId;
    }
}
