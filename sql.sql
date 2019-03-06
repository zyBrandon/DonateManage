-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.26 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win32
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 donate 的数据库结构
CREATE DATABASE IF NOT EXISTS `donate` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `donate`;

-- 导出  表 donate.admin_tbl 结构
CREATE TABLE IF NOT EXISTS `admin_tbl` (
  `username` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pass` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.admin_tbl 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `admin_tbl` DISABLE KEYS */;
INSERT INTO `admin_tbl` (`username`, `pass`) VALUES
	('admin', 'admin');
/*!40000 ALTER TABLE `admin_tbl` ENABLE KEYS */;

-- 导出  表 donate.comment_tbl 结构
CREATE TABLE IF NOT EXISTS `comment_tbl` (
  `username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment_username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment_content` varchar(200) COLLATE utf8_bin NOT NULL DEFAULT '',
  `comment_time` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`,`comment_username`,`comment_content`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.comment_tbl 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `comment_tbl` DISABLE KEYS */;
INSERT INTO `comment_tbl` (`username`, `comment_username`, `comment_content`, `comment_time`) VALUES
	('123', 'test', '你真好', '2019-02-26'),
	('123', 'user', '你的手机可以捐赠给我嘛', '2019-02-26'),
	('user', 'test', '1234', '2019-02-26');
/*!40000 ALTER TABLE `comment_tbl` ENABLE KEYS */;

-- 导出  表 donate.donation_tbl 结构
CREATE TABLE IF NOT EXISTS `donation_tbl` (
  `username` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '',
  `name` varchar(60) COLLATE utf8_bin NOT NULL DEFAULT '',
  `title` varchar(80) COLLATE utf8_bin NOT NULL DEFAULT '',
  `content` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `img_url` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `get` varchar(8) COLLATE utf8_bin DEFAULT 'n',
  `post` varchar(8) COLLATE utf8_bin DEFAULT 'n',
  PRIMARY KEY (`username`,`name`,`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.donation_tbl 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `donation_tbl` DISABLE KEYS */;
INSERT INTO `donation_tbl` (`username`, `name`, `title`, `content`, `img_url`, `get`, `post`) VALUES
	('123', '手机', '自用', '暂时不用，捐赠啦', './images/iphone6s.jpg', 'n', 'y'),
	('user', '手机', '捐赠手机', '捐赠自用手机', './images/iphone6s.jpg', 'n', 'y');
/*!40000 ALTER TABLE `donation_tbl` ENABLE KEYS */;

-- 导出  表 donate.hot_tbl 结构
CREATE TABLE IF NOT EXISTS `hot_tbl` (
  `location` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '',
  `donation` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '',
  `reason` varchar(80) COLLATE utf8_bin DEFAULT NULL,
  `hot_time` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`location`,`donation`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.hot_tbl 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `hot_tbl` DISABLE KEYS */;
INSERT INTO `hot_tbl` (`location`, `donation`, `reason`, `hot_time`) VALUES
	('江西', '手机', '没钱', '2019-02-26');
/*!40000 ALTER TABLE `hot_tbl` ENABLE KEYS */;

-- 导出  表 donate.praise_tbl 结构
CREATE TABLE IF NOT EXISTS `praise_tbl` (
  `username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `praise_username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `praise_time` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`,`praise_username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.praise_tbl 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `praise_tbl` DISABLE KEYS */;
INSERT INTO `praise_tbl` (`username`, `praise_username`, `praise_time`) VALUES
	('123', 'test', '2019-02-26'),
	('123', 'user', '2019-02-26'),
	('user', 'test', '2019-02-26');
/*!40000 ALTER TABLE `praise_tbl` ENABLE KEYS */;

-- 导出  表 donate.receiver_tbl 结构
CREATE TABLE IF NOT EXISTS `receiver_tbl` (
  `username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `donate_username` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '',
  `donate_name` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '',
  `donate_title` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`,`donate_username`,`donate_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.receiver_tbl 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `receiver_tbl` DISABLE KEYS */;
INSERT INTO `receiver_tbl` (`username`, `donate_username`, `donate_name`, `donate_title`) VALUES
	('user', '123', '手机', '自用');
/*!40000 ALTER TABLE `receiver_tbl` ENABLE KEYS */;

-- 导出  表 donate.user_tbl 结构
CREATE TABLE IF NOT EXISTS `user_tbl` (
  `username` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '',
  `pass` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `sex` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `phone_num` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `address` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(30) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  donate.user_tbl 的数据：~3 rows (大约)
/*!40000 ALTER TABLE `user_tbl` DISABLE KEYS */;
INSERT INTO `user_tbl` (`username`, `pass`, `name`, `sex`, `phone_num`, `address`, `email`) VALUES
	('123', '123', 'zy', '男', '123', '南昌', '123@qq.com'),
	('test', 'test', 'test', '男', '123', 'test', '123@qq.com'),
	('user', 'user', '周越', '男', '18779106195', 'test', '18779101695@163.com');
/*!40000 ALTER TABLE `user_tbl` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
