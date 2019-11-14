/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.40 : Database - edocmanagementdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`edocmanagementdb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `edocmanagementdb`;

/*Table structure for table `edoc_category` */

DROP TABLE IF EXISTS `edoc_category`;

CREATE TABLE `edoc_category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `edoc_category` */

insert  into `edoc_category`(`id`,`name`) values (1,'IT计算机'),(2,'Excle表'),(3,'World文档'),(4,'English');

/*Table structure for table `edoc_entry` */

DROP TABLE IF EXISTS `edoc_entry`;

CREATE TABLE `edoc_entry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `categoryId` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `summary` varchar(50) NOT NULL,
  `uploaduser` varchar(50) NOT NULL,
  `createDate` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `edoc_entry` */

insert  into `edoc_entry`(`id`,`categoryId`,`title`,`summary`,`uploaduser`,`createDate`) values (1,1,'Oracle1学习','Oracle学习精品','李雪梅','2019-12-12'),(2,2,'Excle1学习','Excle1学习精品','安安','2018-12-12'),(3,3,'World学习','World学习精品','订单','2013-12-12'),(4,1,'Oracle3学习','Oracle学习精品','王五','2011-12-12'),(5,1,'Oracle4学习','Oracle学习精品','万达','2010-12-12'),(6,2,'书','123123123','刘朝','2012-12-30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
