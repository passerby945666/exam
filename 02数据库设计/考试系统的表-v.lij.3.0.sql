/*
 Navicat Premium Data Transfer

 Source Server         : lij
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : lij

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 15/11/2019 16:29:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam`  (
  `e_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号，主键',
  `e_no` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '考试编号，唯一',
  `e_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '这场考试的名字',
  `k_id` int(11) NULL DEFAULT NULL COMMENT '科目的id',
  `time_begin` datetime(0) NULL DEFAULT NULL COMMENT '开考时间',
  `time_test` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '考试时间，比如120分钟',
  `time_baomin` datetime(0) NULL DEFAULT NULL COMMENT '报名时间',
  `time_end` datetime(0) NULL DEFAULT NULL COMMENT '报名结束时间',
  PRIMARY KEY (`e_id`) USING BTREE,
  UNIQUE INDEX `e_no`(`e_no`) USING BTREE,
  INDEX `k_id`(`k_id`) USING BTREE,
  CONSTRAINT `exam_ibfk_1` FOREIGN KEY (`k_id`) REFERENCES `km` (`k_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for grades
-- ----------------------------
DROP TABLE IF EXISTS `grades`;
CREATE TABLE `grades`  (
  `s_id` int(11) NULL DEFAULT NULL COMMENT '考生的id',
  `e_id` int(11) NULL DEFAULT NULL COMMENT '考试的id',
  `grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '该考生在该场考试的成绩',
  UNIQUE INDEX `s_id`(`s_id`, `e_id`) USING BTREE,
  INDEX `e_id`(`e_id`) USING BTREE,
  CONSTRAINT `grades_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `stu` (`s_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `grades_ibfk_2` FOREIGN KEY (`e_id`) REFERENCES `exam` (`e_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for hq
-- ----------------------------
DROP TABLE IF EXISTS `hq`;
CREATE TABLE `hq`  (
  `h_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号，主键',
  `h_no` char(5) NOT NULL COMMENT '历史题目的编号，唯一',
  `s_id` int(11) NULL DEFAULT NULL COMMENT '考生的id',
  `e_id` int(11) NULL DEFAULT NULL COMMENT '这场考试的id',
  `t_id` int(11) NULL DEFAULT NULL COMMENT '题目的id',
	`status` enum('1','2') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '题目状态',
	`grade` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '学生在该题的历史分数',
	`h_answer` varchar(500) NULL DEFAULT NULL COMMENT '学生的历史答案',
  PRIMARY KEY (`h_id`) USING BTREE,
  UNIQUE INDEX `h_no`(`h_no`) USING BTREE,
  UNIQUE INDEX `s_id`(`s_id`, `e_id`) USING BTREE,
  INDEX `e_id`(`e_id`) USING BTREE,
  INDEX `t_id`(`t_id`) USING BTREE,
  CONSTRAINT `hq_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `stu` (`s_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `hq_ibfk_2` FOREIGN KEY (`e_id`) REFERENCES `exam` (`e_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `hq_ibfk_3` FOREIGN KEY (`t_id`) REFERENCES `tk` (`t_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for km
-- ----------------------------
DROP TABLE IF EXISTS `km`;
CREATE TABLE `km`  (
  `k_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增编号' COMMENT '科目的id',
  `k_no` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '科目编号',
  `k_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '科目名字',
  PRIMARY KEY (`k_id`) USING BTREE,
  UNIQUE INDEX `k_no`(`k_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for manager
-- ----------------------------
DROP TABLE IF EXISTS `manager`;
CREATE TABLE `manager`  (
  `m_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号，主键',
  `m_no` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '管理员编号，唯一',
  `m_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '管理员密码',
  `m_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '管理员名字',
  `m_idcard` char(18) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '管理员身份证号码',
  `m_sex` enum('1','2') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '1男，2女' COMMENT '管理员性别',
  `m_birthday` date NULL DEFAULT NULL COMMENT '管理员出生年月',
  PRIMARY KEY (`m_id`) USING BTREE,
  UNIQUE INDEX `m_no`(`m_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for qt
-- ----------------------------
DROP TABLE IF EXISTS `qt`;
CREATE TABLE `qt`  (
  `q_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '题目类型的id，自增编号，主键',
	`q_type` enum('1','2','3','4') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '1单选，2多选，3填空，4问答' COMMENT '题目类型',
  `q_value` varchar(3) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '这种题目的分值',
  PRIMARY KEY (`q_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `s_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号，主键',
  `s_no` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '考生编号，唯一',
  `s_password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '考生的密码',
  `s_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '考生的名字',
  `s_idcard` char(18) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '考生的身份证号码',
  `s_sex` enum('1','2') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '1男，2女' COMMENT '考生的性别',
  `s_birthday` date NULL DEFAULT NULL COMMENT '考生的身份证号码',
  PRIMARY KEY (`s_id`) USING BTREE,
  UNIQUE INDEX `s_no`(`s_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for tk
-- ----------------------------
DROP TABLE IF EXISTS `tk`;
CREATE TABLE `tk`  (
  `t_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增编号，主键',
  `t_no` char(5) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '题目编号，唯一',
  `content` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '题目内容',
  `q_type` enum('1','2','3','4') CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '1单选，2多选，3填空，4问答' COMMENT '题目的类型',
  `answer` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '这题目的答案',
  `ac` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '解答内容',
  `t_time` date NULL DEFAULT NULL COMMENT '录入时间',
  `k_id` int(11) NULL DEFAULT NULL COMMENT '科目id',
  PRIMARY KEY (`t_id`) USING BTREE,
  UNIQUE INDEX `t_no`(`t_no`) USING BTREE,
  INDEX `q_type`(`q_type`) USING BTREE,
  INDEX `k_id`(`k_id`) USING BTREE,
  CONSTRAINT `tk_ibfk_1` FOREIGN KEY (`q_type`) REFERENCES `qt` (`q_type`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tk_ibfk_2` FOREIGN KEY (`k_id`) REFERENCES `km` (`k_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

DROP TABLE IF EXISTS `Examiners`;
create table examiners(
ex_id int(11) PRIMARY key AUTO_INCREMENT comment'考试成员的id',
s_id int(11),
e_id int(11),
zkzh char(15),
CONSTRAINT `examiners_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `stu` (`s_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `examiners_ibfk_2` FOREIGN KEY (`e_id`) REFERENCES `exam` (`e_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
);

SET FOREIGN_KEY_CHECKS = 1;
