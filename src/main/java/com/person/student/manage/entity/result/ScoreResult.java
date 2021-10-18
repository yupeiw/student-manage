package com.person.student.manage.entity.result;

import lombok.Getter;
import lombok.Setter;

/**
 * ScoreResult
 *
 * @author yupei
 * @date 2021/10/15 18:22
 */
@Setter
@Getter
public class ScoreResult {

    /**
     * 学号
     */
    private String studentNo;
    /**
     * 学生姓名
     */
    private String studentName;
    /**
     * 身份证号
     */
    private String cardNo;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 学科
     */
    private String subjectName;
    /**
     * 学科教师姓名
     */
    private String teacherName;
    /**
     * 分数
     */
    private Double score;

}
