package com.azhuquq.mapper;

import org.apache.ibatis.annotations.Delete;

public interface TimetableMapper {
    @Delete("delete from school.timetable wheree cid = #{cid}")
    public int deleteTimetableByCid(String cid);
}
