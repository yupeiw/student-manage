package com.person.student.manage.db.dao.custom;

import com.person.student.manage.db.entity.custom.CustomStudent;
import org.apache.ibatis.annotations.Param;

/**
 * CustomStudentMapper
 *
 * @author: yupei
 * @date: 2021-10-15 17:45:14
 **/
public interface CustomStudentMapper {
    /**
     * 通过主键id查询学生信息
     *
     * @param studentId
     * @return
     */
    CustomStudent selectByStudentId(@Param("studentId") Long studentId);

    /**
     * 通过学号查询学生信息
     *
     * @param studentNo
     * @return
     */
    CustomStudent selectByStudentNo(@Param("studentNo") String studentNo);
}
