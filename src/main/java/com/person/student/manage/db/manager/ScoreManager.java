package com.person.student.manage.db.manager;

import com.person.student.manage.db.dao.custom.CustomScoreMapper;
import com.person.student.manage.db.entity.custom.CustomScore;
import com.person.student.manage.exception.StudentManageException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ScoreManage
 *
 * @author yupei
 * @date 2021/10/15 18:01
 */
@Repository
public class ScoreManager {

    @Autowired
    private CustomScoreMapper customScoreMapper;

    public List<CustomScore> queryScoreByStudentId(Long studentId) throws StudentManageException {
        return customScoreMapper.selectByStudentId(studentId);
    }
}
