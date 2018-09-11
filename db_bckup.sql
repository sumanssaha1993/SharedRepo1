/*
SQLyog - Free MySQL GUI v5.02
Host - 5.0.19-nt : Database - needs_db_test1
*********************************************************************
Server version : 5.0.19-nt
*/


create database if not exists `needs_db_test1`;

USE `needs_db_test1`;

/*Table structure for table `address_hdr` */

DROP TABLE IF EXISTS `address_hdr`;

CREATE TABLE `address_hdr` (
  `address_id` varchar(32) NOT NULL default '',
  `user_id` varchar(32) NOT NULL default '',
  `address` varchar(255) default NULL,
  `contact_no` bigint(20) default NULL,
  `landmark` varchar(32) default NULL,
  `city` varchar(32) default NULL,
  `state` varchar(32) default NULL,
  `pincode` varchar(32) default NULL,
  `is_default` tinyint(1) default NULL,
  PRIMARY KEY  (`address_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `address_hdr` */

/*Table structure for table `bp_office` */

DROP TABLE IF EXISTS `bp_office`;

CREATE TABLE `bp_office` (
  `office_id` varchar(32) NOT NULL,
  `bp_id` varchar(32) NOT NULL,
  `office_desc` varchar(32) default NULL,
  `address` varchar(32) default NULL,
  `city` varchar(32) default NULL,
  `state` varchar(32) default NULL,
  `pincode` varchar(32) default NULL,
  PRIMARY KEY  (`office_id`,`bp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bp_office` */

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `category_id` varchar(32) NOT NULL,
  `category_desc` varchar(32) NOT NULL,
  PRIMARY KEY  (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `category` */

/*Table structure for table `delv_hdr` */

DROP TABLE IF EXISTS `delv_hdr`;

CREATE TABLE `delv_hdr` (
  `p_del_id` varchar(32) NOT NULL,
  `f_so_id` varchar(32) NOT NULL,
  `status` varchar(32) default NULL,
  `material_id` varchar(15) default NULL,
  `shipment_id` double default NULL,
  `address_id` int(11) default NULL,
  `expected_del_date` datetime default NULL,
  `shipment_date` datetime default NULL,
  PRIMARY KEY  (`p_del_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `delv_hdr` */

/*Table structure for table `delv_item` */

DROP TABLE IF EXISTS `delv_item`;

CREATE TABLE `delv_item` (
  `p_del_id` varchar(32) NOT NULL,
  `p_del_item` varchar(32) NOT NULL,
  `material_id` varchar(15) default NULL,
  `status` varchar(32) default NULL,
  `r_qty` int(15) default NULL,
  PRIMARY KEY  (`p_del_id`,`p_del_item`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `delv_item` */

/*Table structure for table `material_category` */

DROP TABLE IF EXISTS `material_category`;

CREATE TABLE `material_category` (
  `mc_id` varchar(32) NOT NULL,
  `material_id` varchar(32) NOT NULL,
  `category_id` varchar(32) default NULL,
  `sub_cat_id` varchar(32) default NULL,
  PRIMARY KEY  (`mc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `material_category` */

/*Table structure for table `material_master` */

DROP TABLE IF EXISTS `material_master`;

CREATE TABLE `material_master` (
  `material_id` varchar(32) NOT NULL,
  `bp_id` varchar(32) NOT NULL,
  `material_desc` varchar(32) default NULL,
  `category_id` varchar(32) default NULL,
  `sub_category_id` varchar(32) default NULL,
  `r_mrp` double default NULL,
  PRIMARY KEY  (`material_id`,`bp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `material_master` */

/*Table structure for table `sales_order_hdr` */

DROP TABLE IF EXISTS `sales_order_hdr`;

CREATE TABLE `sales_order_hdr` (
  `p_so_id` varchar(32) NOT NULL,
  `customer_id` varchar(32) NOT NULL,
  `status` varchar(32) default NULL,
  `order_date` datetime default NULL,
  `r_gross_amt` double default NULL,
  `r_tax_amt` double default NULL,
  `r_net_amt` double default NULL,
  `frieght_amt` double default NULL,
  PRIMARY KEY  (`p_so_id`,`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_order_hdr` */

/*Table structure for table `sales_order_item` */

DROP TABLE IF EXISTS `sales_order_item`;

CREATE TABLE `sales_order_item` (
  `p_so_id` varchar(32) NOT NULL,
  `p_so_item` varchar(32) NOT NULL,
  `material_id` varchar(32) default NULL,
  `status` varchar(15) default NULL,
  `r_unit_price` double default NULL,
  `r_order_qty` int(11) default NULL,
  `r_total_price` double default NULL,
  `r_delivered_qty` int(11) default NULL,
  `r_pending_qty` int(11) default NULL,
  PRIMARY KEY  (`p_so_id`,`p_so_item`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sales_order_item` */

/*Table structure for table `stock_batch` */

DROP TABLE IF EXISTS `stock_batch`;

CREATE TABLE `stock_batch` (
  `material_id` varchar(32) NOT NULL,
  `batch_id` varchar(32) NOT NULL,
  `bp_id` varchar(32) NOT NULL default '',
  `r_available_qty` int(11) default NULL,
  `r_reserved_qty` int(11) default NULL,
  `r_total_qty` int(11) default NULL,
  `batch_type` varchar(32) default NULL,
  PRIMARY KEY  (`material_id`,`bp_id`,`batch_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock_batch` */

/*Table structure for table `stock_hdr` */

DROP TABLE IF EXISTS `stock_hdr`;

CREATE TABLE `stock_hdr` (
  `material_id` varchar(32) NOT NULL,
  `bp_id` varchar(32) NOT NULL,
  `office_id` varchar(32) default NULL,
  `r_available-qty` int(11) default NULL,
  `r_reserved_qty` int(11) default NULL,
  `r_total-qty` int(11) default NULL,
  PRIMARY KEY  (`material_id`,`bp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stock_hdr` */

/*Table structure for table `sub_category` */

DROP TABLE IF EXISTS `sub_category`;

CREATE TABLE `sub_category` (
  `sub_cat_id` varchar(32) NOT NULL,
  `category_id` varchar(32) NOT NULL,
  `sub_cat_desc` varchar(32) NOT NULL,
  PRIMARY KEY  (`sub_cat_id`,`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sub_category` */

/*Table structure for table `user_hdr` */

DROP TABLE IF EXISTS `user_hdr`;

CREATE TABLE `user_hdr` (
  `user_id` varchar(32) NOT NULL,
  `email_id` varchar(32) NOT NULL,
  `fname` varchar(255) default NULL,
  `lname` varchar(255) default NULL,
  `password` varchar(32) default NULL,
  `mobile` bigint(20) default NULL,
  `gender` varchar(32) default NULL,
  `is_active` tinyint(1) default NULL,
  `user_type` varchar(5) default NULL,
  PRIMARY KEY  (`user_id`,`email_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_hdr` */
