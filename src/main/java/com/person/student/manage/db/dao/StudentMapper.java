package com.person.student.manage.db.dao;

import com.person.student.manage.db.entity.Student;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface StudentMapper extends Mapper<Student>, MySqlMapper<Student> {

}