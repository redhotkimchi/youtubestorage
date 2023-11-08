package com.example.youtubestorage.data.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document("uploadWait")
@Builder
@Getter
public class UploadWaitEntity {
    @Transient
    public static final String SEQUENCE_NAME = "uploadWait_sequence";
    @Id
    private Long id;
    @NonNull
    private String youtubeLink;
    @NonNull
    private String youtubeType;
    @NonNull
    private long views;
    private String youtubeDate;
    @NonNull
    private int teamId;
    public void SetId(long id){
        this.id = id;
    }

}
