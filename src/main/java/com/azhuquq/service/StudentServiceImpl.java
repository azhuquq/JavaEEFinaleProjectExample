package com.azhuquq.service;

import com.azhuquq.mapper.CourseMapper;
import com.azhuquq.mapper.ScoreMapper;
import com.azhuquq.mapper.StudentMapper;
import com.azhuquq.mapper.TimetableMapper;
import com.azhuquq.pojo.Student;
import jakarta.annotation.Resource;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Resource
    SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public Student queryStudentBySnameAndSpassword(String sname, String spassword) {
        return sqlSessionTemplate.getMapper(StudentMapper.class).queryStudentBySnameAndSpassword(sname, spassword);
    }

    @Override
    public List<Student> queryStudentAll() {
        return sqlSessionTemplate.getMapper(StudentMapper.class).queryStudentAll();
    }

    // 由于直接删除不能实现，这里的业务逻辑不再单单是对一个Mapper进行操作，而是对多个操作
    // 所以这里是一个涉及到复杂的业务逻辑，涉及到四个Mapper的操作
    @Override
    public int deleteStudentBySid(String sid) {
        int flag = 0;
        StudentMapper studentMapper = sqlSessionTemplate.getMapper(StudentMapper.class);
        ScoreMapper scoreMapper = sqlSessionTemplate.getMapper(ScoreMapper.class);
        CourseMapper courseMapper = sqlSessionTemplate.getMapper(CourseMapper.class);
        TimetableMapper timetableMapper = sqlSessionTemplate.getMapper(TimetableMapper.class);
        List<String> cids = scoreMapper.queryScoreCidBySid(sid);
        List<String> delcids = new ArrayList<>();
        for (String cid : cids) {
            int num = scoreMapper.queryScoreNumByCid(cid);
            if (num == 1)
                delcids.add(cid); // 这里存储的就是要删除的课程编号
        }
        flag = scoreMapper.deleteScoreBySid(sid);
        flag = studentMapper.deleteStudentBySid(sid);
        for (String delcid : delcids) {
            flag = timetableMapper.deleteTimetableByCid(delcid);
            flag = courseMapper.deleteCourseByCid(delcid);
        }
        return flag;
    }
}
