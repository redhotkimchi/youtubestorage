package com.example.youtubestorage.data.dto;

import lombok.Builder;

import java.util.Date;

public class UploadWaitDTO {
    @Builder
    public static class ForSave{
        private String youtubeLink;
        private String youtubeType;
        private long views;
        private String youtubeDate;
        private int teamId;

        public String getYoutubeLink(){
            return youtubeLink;
        }
        public String getYoutubeType(){
            return youtubeType;
        }

        public Long getViews() {
            return views;
        }
        public String getYoutubeDate(){
            return youtubeDate;
        }
        public int getTeamId(){
            return teamId;
        }
    }
    @Builder
    public static class ForGet{
        private Long documentsId;
        private String youtubeLink;
        private String youtubeType;
        private long views;
        private String youtubeDate;
        private int teamId;

        public String getYoutubeLink(){
            return youtubeLink;
        }
        public String getYoutubeType(){
            return youtubeType;
        }

        public Long getDocumentsId(){return documentsId;}
        public Long getViews() {
            return views;
        }
        public String getYoutubeDate(){
            return youtubeDate;
        }
        public int getTeamId(){
            return teamId;
        }
    }
    @Builder
    public static class ForSingleGet{
        private Long documentsId;
        private String youtubeLink;
        private String youtubeType;
        private long views;
        private String youtubeDate;
        private int teamId;

        public String getYoutubeLink(){
            return youtubeLink;
        }
        public String getYoutubeType(){
            return youtubeType;
        }

        public Long getDocumentsId(){return documentsId;}
        public Long getViews() {
            return views;
        }
        public String getYoutubeDate(){
            return youtubeDate;
        }
        public int getTeamId(){
            return teamId;
        }
    }
}
