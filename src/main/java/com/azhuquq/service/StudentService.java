package com.azhuquq.service;

import com.azhuquq.pojo.Student;

public interface StudentService {

    public Student queryStudentBySnameAndSpassword(String sname, String spassword);
}
