package com.person.student.manage.db.manager;

import com.person.student.manage.db.dao.StudentMapper;
import com.person.student.manage.db.entity.Student;
import com.person.student.manage.db.entity.custom.CusStudent;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * StudentManager
 *
 * @author yupei
 * @date 2021/10/12 10:11
 */
@Repository
public class StudentManager {

    @Autowired
    private StudentMapper studentMapper;

    public CusStudent queryStudent(Long id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        if (student == null) {
            return null;
        }
        CusStudent cusStudent = new CusStudent();
        BeanUtils.copyProperties(student, cusStudent);
        return cusStudent;
    }
}
