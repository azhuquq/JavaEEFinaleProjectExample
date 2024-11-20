package com.azhuquq.service;

import com.azhuquq.pojo.Student;

import java.util.List;

public interface StudentService {

    public Student queryStudentBySnameAndSpassword(String sname, String spassword);

    public List<Student> queryStudentAll();

    public int deleteStudentBySid(String sid);
}
