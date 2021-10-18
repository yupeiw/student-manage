package com.person.student.manage.controller;

import com.person.student.manage.entity.param.QueryScoreParam;
import com.person.student.manage.exception.StudentManageException;
import com.person.student.manage.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * ScoreController
 *
 * @author: yupei
 * @date: 2021-10-15 19:25:31
 **/
@Slf4j
@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping(value = "/score/query")
    public Object queryScore(@RequestBody QueryScoreParam param) throws StudentManageException {
        return scoreService.queryScoreByStudentNo(param);
    }
}
