package com.azhuquq.controller;

import com.azhuquq.pojo.Student;
import com.azhuquq.service.StudentService;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Resource
    StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping("/login")
    public String queryStudentBySnameAndSpassword
            (@RequestParam("sname") String sname,
             @RequestParam("spassword") String spassword,
             HttpServletRequest request) {
        Student student = studentService.queryStudentBySnameAndSpassword(sname, spassword);
        HttpSession session = request.getSession();
        session.setAttribute("username", student.getSname());
        session.setAttribute("sright", student.getSright());
        return "main";
    }

    @RequestMapping("/queryall")
    public String queryStudentAll(Model model) {
        List<Student> list = studentService.queryStudentAll();
        model.addAttribute("allStu", list);
        return "stu/stuAll";
    }
}
