package com.person.student.manage.service;

import com.person.student.manage.db.entity.custom.CusStudent;
import com.person.student.manage.db.manager.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentService
 *
 * @author yupei
 * @date 2021/10/12 10:22
 */
@Service
public class StudentService {

    @Autowired
    private StudentManager studentManager;

    public CusStudent queryStudent(Long id) {
        return studentManager.queryStudent(id);
    }
}
