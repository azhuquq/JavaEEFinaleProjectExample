package com.azhuquq.mapper;

import com.azhuquq.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    public Student queryStudentBySnameAndSpassword
            (@Param("sname") String sname, @Param("spassword") String spassword);
}
