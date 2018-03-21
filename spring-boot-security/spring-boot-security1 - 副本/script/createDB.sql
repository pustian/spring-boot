create database tian_test;
use database tian_test;

CREATE TABLE user (
  id bigint(32) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  biz_id varchar(32)  NOT NULL COMMENT '用户编号',
  username varchar(32)  NOT NULL COMMENT '用户名',
  password varchar(64)  NOT NULL COMMENT '密码',
  gmt_modified datetime DEFAULT NULL COMMENT '更新时间 yyyymmdd hh24miss',
  gmt_create datetime DEFAULT NULL COMMENT '创建时间 yyyymmdd hh24miss',
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目健康检查表（DevOps需要，勿删）'

CREATE UNIQUE INDEX uk_username ON user(username);