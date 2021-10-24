package com.person.student.manage.db.dao;

import com.person.student.manage.db.entity.Subject;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface SubjectMapper extends Mapper<Subject>, MySqlMapper<Subject> {
}