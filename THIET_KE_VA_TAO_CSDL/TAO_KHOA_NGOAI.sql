CREATE DATABASE SHOPPING;
USE SHOPPING;

CREATE TABLE Customer(
    CUSTOMER_ID     INT AUTO_INCREMENT,
    NAME            VARCHAR(50),
    ADDRESS         VARCHAR(255),
    EMAIL           VARCHAR(255),
    CONSTRAINT PK_Customer PRIMARY KEY (CUSTOMER_ID)
);

CREATE TABLE Orders(
    ORDER_ID        INT AUTO_INCREMENT,
    STAFF           VARCHAR(50),
    CUSTOMER_ID     INT,
    CONSTRAINT PK_Orders PRIMARY KEY (ORDER_ID),
    CONSTRAINT FK_Customer_Orders FOREIGN KEY (CUSTOMER_ID) REFERENCES  Customer(CUSTOMER_ID)
);
