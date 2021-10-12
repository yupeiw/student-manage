package com.person.student.manage.controller;

import com.person.student.manage.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TestController
 *
 * @author: yupei
 * @date: 2021-10-12 10:23:10
 **/
@Slf4j
@Controller
public class TestController {

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/student/query")
    @ResponseBody
    public Object queryStudent(Long id) {
        return studentService.queryStudent(id);
    }
}
