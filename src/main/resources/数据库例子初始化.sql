SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for score
-- ----------------------------
DROP TABLE IF EXISTS `score`;
CREATE TABLE `score` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `student_id` bigint(20) DEFAULT NULL COMMENT '学生id',
  `subject_id` bigint(20) DEFAULT NULL COMMENT '学科id',
  `score` double(255,0) DEFAULT NULL COMMENT '分数',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of score
-- ----------------------------
INSERT INTO `score` VALUES ('1', '1', '1', '90', '2021-10-15 19:24:50', null);
INSERT INTO `score` VALUES ('2', '1', '2', '92', '2021-10-15 19:24:59', null);
INSERT INTO `score` VALUES ('3', '1', '3', '94', '2021-10-15 19:25:08', null);

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `student_no` varchar(50) DEFAULT NULL COMMENT '学号',
  `name` varchar(100) DEFAULT '' COMMENT '姓名',
  `card_no` varchar(50) DEFAULT NULL COMMENT '证件信息',
  `gender` int(11) DEFAULT NULL COMMENT '性格：0:男 1:女',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '2020030417', '张三', '421122200209011123', '1', '19', '2021-10-12 12:51:51', '2021-10-20 10:21:48');

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `subject_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `subject_name` varchar(20) DEFAULT NULL COMMENT '学科名',
  `teacher_name` varchar(50) DEFAULT NULL COMMENT '任课老师',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------
INSERT INTO `subject` VALUES ('1', '语文', '张老师', '2021-10-15 19:23:58', null);
INSERT INTO `subject` VALUES ('2', '数学', '陈老师', '2021-10-15 19:24:09', null);
INSERT INTO `subject` VALUES ('3', '英语', '赵老师', '2021-10-15 19:24:23', null);
