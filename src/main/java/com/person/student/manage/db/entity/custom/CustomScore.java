package com.person.student.manage.db.entity.custom;

import com.person.student.manage.db.entity.Score;
import com.person.student.manage.db.entity.Subject;

/**
 * CustomScore
 *
 * @author yupei
 * @date 2021/10/15 17:32
 */
public class CustomScore extends Score {

    private CustomStudent student;

    private Subject subject;

    public CustomStudent getStudent() {
        return student;
    }

    public void setStudent(CustomStudent student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
