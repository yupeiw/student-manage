package com.person.student.manage.service;

import com.person.student.manage.entity.param.QueryScoreParam;
import com.person.student.manage.entity.result.ScoreResult;
import com.person.student.manage.exception.StudentManageException;

import java.util.List;

/**
 * ScoreManager
 *
 * @author yupei
 * @date 2021/10/15 18:38
 */
public interface ScoreService {

    /**
     * 通过证件号查询成绩
     *
     * @param param
     * @return
     * @throws StudentManageException
     */
    List<ScoreResult> queryScoreByStudentNo(QueryScoreParam param) throws StudentManageException;
}
