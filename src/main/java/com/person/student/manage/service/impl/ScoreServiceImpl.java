package com.person.student.manage.service.impl;

import com.google.common.collect.Lists;
import com.person.student.manage.constant.PostCommonError;
import com.person.student.manage.db.dao.custom.CustomScoreMapper;
import com.person.student.manage.db.dao.custom.CustomStudentMapper;
import com.person.student.manage.db.entity.Student;
import com.person.student.manage.db.entity.Subject;
import com.person.student.manage.db.entity.custom.CustomScore;
import com.person.student.manage.db.entity.custom.CustomStudent;
import com.person.student.manage.entity.param.QueryScoreParam;
import com.person.student.manage.entity.result.ScoreResult;
import com.person.student.manage.exception.StudentManageException;
import com.person.student.manage.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ScoreServiceImpl
 *
 * @author yupei
 * @date 2021/10/15 18:39
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private CustomStudentMapper customStudentMapper;
    @Autowired
    private CustomScoreMapper customScoreMapper;

    @Override
    public List<ScoreResult> queryScoreByStudentNo(QueryScoreParam param) throws StudentManageException {
        Student customStudent = customStudentMapper.selectByStudentNo(param.getStudentNo());
        if (customStudent == null) {
            throw new StudentManageException(PostCommonError.STUDENT_NOT_EXIST_ERROR);
        }
        List<CustomScore> customScoreList = customScoreMapper.selectByStudentId(customStudent.getStudentId());
        List<ScoreResult> results = Lists.newArrayList();
        if (CollectionUtils.isEmpty(customScoreList)) {
            return results;
        }
        return customScoreList.stream().map(this::buildScoreResult).collect(Collectors.toList());
    }

    private ScoreResult buildScoreResult(CustomScore x) {
        ScoreResult scoreResult = new ScoreResult();
        CustomStudent student = x.getStudent();
        if (student != null) {
            scoreResult.setStudentNo(student.getStudentNo());
            scoreResult.setAge(student.getAge());
            scoreResult.setCardNo(student.getCardNo());
            scoreResult.setGender(student.getSex());
            scoreResult.setStudentName(student.getName());
        }
        Subject subject = x.getSubject();
        if (subject != null) {
            scoreResult.setSubjectName(subject.getSubjectName());
            scoreResult.setTeacherName(subject.getTeacherName());
        }
        scoreResult.setScore(x.getScore());
        return scoreResult;
    }
}
