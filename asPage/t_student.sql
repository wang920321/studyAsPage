/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : study

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-01-15 17:04:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_student`
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `sId` int(32) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(32) DEFAULT NULL,
  `age` int(32) DEFAULT NULL,
  PRIMARY KEY (`sId`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', 'zhang', '23');
INSERT INTO `t_student` VALUES ('2', 'wang', '22');
INSERT INTO `t_student` VALUES ('3', 'liu', '32');
INSERT INTO `t_student` VALUES ('4', 'yang', '22');
INSERT INTO `t_student` VALUES ('5', 'li', '22');
INSERT INTO `t_student` VALUES ('6', 'asdf', '22');
INSERT INTO `t_student` VALUES ('7', 'sdfdf', '22');
INSERT INTO `t_student` VALUES ('8', 'asdfsdf', '22');
INSERT INTO `t_student` VALUES ('9', 'dasf', '32');
INSERT INTO `t_student` VALUES ('10', 'asdfas', '32');
INSERT INTO `t_student` VALUES ('11', 'dsfas', '22');
INSERT INTO `t_student` VALUES ('12', 'ssdfsa', '32');
INSERT INTO `t_student` VALUES ('13', 'sadas', '21');
INSERT INTO `t_student` VALUES ('14', 'qwer', '23');
INSERT INTO `t_student` VALUES ('15', 'asdf', '23');
INSERT INTO `t_student` VALUES ('16', 'ewrq', '23');
INSERT INTO `t_student` VALUES ('17', 'qwewqr', '23');
INSERT INTO `t_student` VALUES ('18', 'qwer', '24');
INSERT INTO `t_student` VALUES ('19', 'asdf', '22');
