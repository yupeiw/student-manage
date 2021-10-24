package com.person.student.manage.db.dao;

import com.person.student.manage.db.entity.Score;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface ScoreMapper extends Mapper<Score>, MySqlMapper<Score> {
}