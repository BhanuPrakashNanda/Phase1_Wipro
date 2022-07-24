DROP DATABASE IF EXISTS jpa;
CREATE DATABASE jpa;
USE jpa;

create table login(username varchar(50) NOT NULL,password varchar(50) NOT NULL,role varchar(50) NOT NULL,PRIMARY KEY (username));

create table product(productid int AUTO_INCREMENT,code varchar(50),name varchar(50),category varchar(50),quantity int,active boolean,suppliername varchar(50),img varchar(50), packaging varchar(50),price int,description varchar(1000),PRIMARY KEY (productid))ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

create table cart(cartid int auto_increment,userid varchar(50),img varchar(50),productname varchar(50),price int,quantity int,productid int,total int,subtotal int,PRIMARY KEY(cartid));

create table orders(orderid int NOT NULL AUTO_INCREMENT,username varchar(50),productid varchar(500),productname varchar(500),PRIMARY KEY(orderid));

