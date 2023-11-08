package com.example.youtubestorage.data.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

public class KpopGroupDTO {
    @Builder
    @Getter
    public static class ForSaveDto{
        private String GroupName;
        private String GroupGender;
    }

}
