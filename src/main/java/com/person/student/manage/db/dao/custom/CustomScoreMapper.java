package com.person.student.manage.db.dao.custom;

import com.person.student.manage.db.entity.custom.CustomScore;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * CustomScoreMapper
 *
 * @author yupei
 * @date 2021/10/15 17:29
 */
public interface CustomScoreMapper {

    /**
     * 通过studentId查询成绩
     *
     * @param studentId
     * @return
     */
    List<CustomScore> selectByStudentId(@Param("studentId") Long studentId);
}