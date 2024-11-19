package com.azhuquq.service;

import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.pojo.Student;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public Student queryStudentBySnameAndSpassword(String sname, String spassword) {
        return sqlSessionTemplate.getMapper(StudentMapper.class).
                queryStudentBySnameAndSpassword(sname, spassword);
    }

    @Override
    public List<Student> queryStudentAll(){
        return sqlSessionTemplate.getMapper(StudentMapper.class).queryStudentAll();
    }
}
