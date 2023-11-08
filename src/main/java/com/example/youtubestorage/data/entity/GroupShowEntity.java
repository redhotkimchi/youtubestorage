package com.example.youtubestorage.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "performance")
public class GroupShowEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "show_id")
    private Long id; //  id
    @NonNull
    private String youtubeLink;
    @NonNull
    private String youtubeType;
    @NonNull
    private Long views;
    @NonNull
    private String youtubeDate;
    @ManyToOne
    @JoinColumn(name = "team_id")
    private KpopGroupEntity teamId;

}
