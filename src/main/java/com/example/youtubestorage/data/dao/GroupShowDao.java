package com.example.youtubestorage.data.dao;

import com.example.youtubestorage.data.dto.GroupShowDTO;

public interface GroupShowDao {

    void forSave(GroupShowDTO.ForSave forSave);
    GroupShowDTO.ForGet forGet(long id);

}
