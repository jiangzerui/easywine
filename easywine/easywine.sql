/*
Navicat MySQL Data Transfer

Source Server         : homelocal
Source Server Version : 50616
Source Host           : localhost:3306
Source Database       : easywine

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2014-02-25 01:26:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `colour`
-- ----------------------------
DROP TABLE IF EXISTS `colour`;
CREATE TABLE `colour` (
  `colour_id` int(11) NOT NULL AUTO_INCREMENT,
  `colour_type` int(11) DEFAULT NULL,
  `colour_code` int(11) DEFAULT NULL,
  `colour_name` varchar(255) DEFAULT NULL,
  `colour_e_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`colour_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of colour
-- ----------------------------
INSERT INTO `colour` VALUES ('1', '1', '100', '白', 'white');
INSERT INTO `colour` VALUES ('2', '1', '200', '红', 'red');
INSERT INTO `colour` VALUES ('3', '1', '300', '桃红', 'rose');
INSERT INTO `colour` VALUES ('4', '2', '10010', '柠檬黄', 'lemon');
INSERT INTO `colour` VALUES ('5', '2', '10020', '金黄', 'gold');
INSERT INTO `colour` VALUES ('6', '2', '10030', '琥珀', 'amber');
INSERT INTO `colour` VALUES ('7', '2', '20010', '紫色', 'purple');
INSERT INTO `colour` VALUES ('8', '2', '20020', '宝石红', 'ruby');
INSERT INTO `colour` VALUES ('9', '2', '20030', '石榴红', 'garnet');
INSERT INTO `colour` VALUES ('10', '2', '20040', '茶色', 'tawny');
INSERT INTO `colour` VALUES ('11', '2', '30010', '粉红色', 'pink');
INSERT INTO `colour` VALUES ('12', '2', '30020', '橙黄色', 'salmon');
INSERT INTO `colour` VALUES ('13', '2', '30030', '桔黄色', 'orange');
