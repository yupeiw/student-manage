package com.person.student.manage.db.dao.custom;

import com.person.student.manage.db.entity.Subject;
import org.apache.ibatis.annotations.Param;

/**
 * CustomSubjectMapper
 *
 * @author: yupei
 * @date: 2021-10-15 17:52:58
 **/
public interface CustomSubjectMapper {

    /**
     * 通过主键id查询学科信息
     *
     * @param id
     * @return
     */
    Subject selectById(@Param("id") Long id);
}
