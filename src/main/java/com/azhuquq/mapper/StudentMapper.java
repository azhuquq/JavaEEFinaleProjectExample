package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    public Student queryStudentBySnameAndSpassword
            (@Param("sname") String sname, @Param("spassword") String spassword);

    @Select("select * from school.student")
    public List<Student> queryStudentAll();

    @Delete("delete from school.student where sid = #{sid}")
    public int deleteStudentBySid(String sid);
}
