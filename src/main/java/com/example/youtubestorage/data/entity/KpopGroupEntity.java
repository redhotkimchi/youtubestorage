package com.example.youtubestorage.data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "kpopgroup")
public class KpopGroupEntity extends BaseTimeEntity{
    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id; //  id
    @NonNull
    private String GroupName;
    @NonNull
    private String GroupGender;
    @OneToMany(mappedBy = "teamId")
    private List<GroupShowEntity> groupShowEntities = new ArrayList<>();
}
