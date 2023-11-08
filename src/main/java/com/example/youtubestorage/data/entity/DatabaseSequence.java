package com.example.youtubestorage.data.entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "database_sequences")
public class DatabaseSequence {
    @Id
    private String id;

    private long seq;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public long getSeq(){
        return seq;
    }
    //getters and setters omitted
}
