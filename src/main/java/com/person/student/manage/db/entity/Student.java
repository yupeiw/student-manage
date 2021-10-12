package com.person.student.manage.db.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`student`")
public class Student implements Serializable {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 性格：0:男 1:女
     */
    @Column(name = "`gender`")
    private Integer gender;

    /**
     * 学号
     */
    @Column(name = "`student_no`")
    private String studentNo;

    /**
     * 年龄
     */
    @Column(name = "`age`")
    private Integer age;

    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取性格：0:男 1:女
     *
     * @return gender - 性格：0:男 1:女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性格：0:男 1:女
     *
     * @param gender 性格：0:男 1:女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取学号
     *
     * @return student_no - 学号
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * 设置学号
     *
     * @param studentNo 学号
     */
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo == null ? null : studentNo.trim();
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}