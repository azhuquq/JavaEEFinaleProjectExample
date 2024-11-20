package com.azhuquq.mapper;

import org.apache.ibatis.annotations.Delete;

import java.util.List;

public interface ScoreMapper {
    @Delete("delete from school.score where sid = #{sid}")
    public int deleteScoreBySid(String sid);

    // 先从学生编号找到这个学生选修了哪些课程，返回课程编号
    public List<String> queryScoreCidBySid(String sid);
    // 再依据课程编号找一下有多少学生选修了这门课，如果只有一个人选修，这门课就是要删除的课程
    public int queryScoreNumByCid(String cid);
}
