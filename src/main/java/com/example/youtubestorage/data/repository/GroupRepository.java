package com.example.youtubestorage.data.repository;

import com.example.youtubestorage.data.entity.GroupShowEntity;
import com.example.youtubestorage.data.entity.KpopGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupRepository extends JpaRepository<KpopGroupEntity, Long> {
    @Query(value = "Select performance.* from kpopgroup K Join performance P on K.team_id = P.team_id", nativeQuery = true)
    List<GroupShowEntity> getAllShows(@Param("team_id") long team_id);

}
