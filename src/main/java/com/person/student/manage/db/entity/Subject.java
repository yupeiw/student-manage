package com.person.student.manage.db.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`subject`")
public class Subject implements Serializable {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 学科名
     */
    @Column(name = "`subject_name`")
    private String subjectName;

    /**
     * 任课老师
     */
    @Column(name = "`teacher_name`")
    private String teacherName;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取学科名
     *
     * @return subject_name - 学科名
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * 设置学科名
     *
     * @param subjectName 学科名
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * 获取任课老师
     *
     * @return teacher_name - 任课老师
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置任课老师
     *
     * @param teacherName 任课老师
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
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