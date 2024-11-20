package com.azhuquq.mapper;

import org.apache.ibatis.annotations.Delete;

public interface CourseMapper {
    @Delete("delete from course where cid = #{cid}")
    public int deleteCourseByCid(String cid);
}
