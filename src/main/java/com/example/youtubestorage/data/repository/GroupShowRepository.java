package com.example.youtubestorage.data.repository;

import com.example.youtubestorage.data.entity.GroupShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupShowRepository extends JpaRepository<GroupShowEntity, Long> {
}
