create database tian_test;
use database tian_test;

CREATE TABLE `test` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `gmt_modified` datetime DEFAULT NULL COMMENT '更新时间 yyyymmdd hh24miss',
  `gmt_create` datetime DEFAULT NULL COMMENT '创建时间 yyyymmdd hh24miss',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目健康检查表（DevOps需要，勿删）'