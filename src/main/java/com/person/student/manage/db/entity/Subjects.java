package com.person.student.manage.db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "subjects")
public class Subjects implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sid")
    private Integer sid;
    @Column(name = "subject")
    private String subject;
    @Column(name = "teacher")
    private String teacher;


    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Subjects(Integer sid, String subject, String teacher, Student student) {
        this.sid = sid;
        this.subject = subject;
        this.teacher = teacher;
    }

    public Subjects() {
    }
}
