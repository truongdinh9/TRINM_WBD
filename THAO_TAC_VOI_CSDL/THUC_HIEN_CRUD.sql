CREATE DATABASE STORE;
USE STORE;

CREATE TABLE ProductLines(
                             PRODUCT_LINE_ID         CHAR(50)  NOT NULL ,
                             CONSTRAINT PK_Productlines PRIMARY KEY (PRODUCT_LINE_ID),
                             TEXT_DESCRIPTION        TEXT NOT NULL ,
                             IMAGE                   TEXT NOT NULL
);

CREATE TABLE Products(
                         PRODUCT_ID              CHAR(15) NOT NULL ,
                         CONSTRAINT PK_Products PRIMARY KEY (PRODUCT_ID),
                         PRODUCT_NAME            VARCHAR(70) NOT NULL ,
                         PRODUCT_SCALE           VARCHAR(10) NOT NULL ,
                         PRODUCT_VENDOR          VARCHAR(50) NOT NULL ,
                         PRODUCT_DESCRIPTON      TEXT NOT NULL ,
                         QUANTITY_IN_STOCK       INT NOT NULL ,
                         BUY_PRICE               DOUBLE  NOT NULL ,
                         MSRP                    DOUBLE  NOT NULL,
                         PRODUCT_LINE_ID         CHAR(50) NOT NULL ,
                         CONSTRAINT FK_ProductLines_Products FOREIGN KEY (PRODUCT_LINE_ID) REFERENCES ProductLines(PRODUCT_LINE_ID)
);

CREATE TABLE Offices(
                        OFFICE_CODE_ID          CHAR(10),
                        CONSTRAINT PK_Offices PRIMARY KEY (OFFICE_CODE_ID),
                        CITY                    VARCHAR(50)NOT NULL ,
                        PHONE                   VARCHAR(50) NOT NULL ,
                        ADDRESSLINE1            VARCHAR(50) NOT NULL ,
                        ADDRESSLINE2            VARCHAR(50) NOT NULL ,
                        STATE                   VARCHAR(50) NOT NULL ,
                        COUNTRY                 VARCHAR(50) NOT NULL ,
                        POSTAL_CODE             VARCHAR(15) NOT NULL
);


CREATE TABLE Employees(
                          EMPLOYEE_ID             INT AUTO_INCREMENT,
                          CONSTRAINT PK_Employees PRIMARY KEY (EMPLOYEE_ID),
                          LAST_NAME               VARCHAR(50) NOT NULL ,
                          FIRST_NAME              VARCHAR(50) NOT NULL ,
                          EMAIL                   VARCHAR(100)    NOT NULL ,
                          JOB_TITLE               VARCHAR(50) NOT NULL,
                          OFFICE_CODE_ID          CHAR(10) NOT NULL ,
                          REPOST_TO               INT NOT NULL ,
                          CONSTRAINT FK_Offices_Employees FOREIGN KEY (OFFICE_CODE_ID) REFERENCES Offices(OFFICE_CODE_ID),
                          CONSTRAINT FK_Manager_Employees FOREIGN KEY (REPOST_TO) REFERENCES Employees(EMPLOYEE_ID)
);

CREATE TABLE Customer(
                         CUSTOMER_ID             INT AUTO_INCREMENT,
                         CONSTRAINT PK_Customer PRIMARY KEY (Customer_ID),
                         CUSTOMER_NAME           VARCHAR(50) NOT NULL ,
                         CONTACT_LAST_NAME       VARCHAR(50) NOT NULL ,
                         CONTACT_FIRST_NAME      VARCHAR(50) NOT NULL ,
                         PHONE                   VARCHAR(50) NOT NULL ,
                         ADDRESSLINE1            VARCHAR(50) NOT NULL ,
                         ADDRESSLINE2            VARCHAR(50),
                         CITY                    VARCHAR(50) NOT NULL ,
                         STATE                   VARCHAR(50) NOT NULL ,
                         PASTAL_CODE             VARCHAR(50) NOT NULL ,
                         COUNTRY                 VARCHAR(50) NOT NULL ,
                         CREDIT_LIMIT            DOUBLE,
                         EMPLOYEE_ID   INT NOT NULL ,
                         CONSTRAINT FK_Employees_Customer FOREIGN KEY (EMPLOYEE_ID) REFERENCES Employees(EMPLOYEE_ID)
);

CREATE TABLE Orders(
                       ORDER_ID                INT AUTO_INCREMENT,
                       CONSTRAINT PK_Orders PRIMARY KEY (ORDER_ID),
                       ORDER_DATE              DATETIME NOT NULL ,
                       REQUIRED_DATE           DATETIME NOT NULL ,
                       SHIPPED_DATE            DATETIME NOT NULL ,
                       STATUS                  VARCHAR(15) NOT NULL ,
                       COMMENTS                TEXT,
                       QUANTITY_ORDERED        INT NOT NULL ,
                       PRICE_EACH              DOUBLE NOT NULL ,
                       CUSTOMER_ID             INT NOT NULL ,
                       CONSTRAINT FK_Customer_Orders FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID)
);


CREATE TABLE Payments(
                         CUSTOMER_ID             INT NOT NULL ,
                         CHECK_NUMBER            VARCHAR(50) NOT NULL ,
                         PAYMENT_DATE            DATETIME NOT NULL ,
                         AMOUNT                  DOUBLE NOT NULL,
                         CONSTRAINT FK_Customer_Payments FOREIGN KEY (CUSTOMER_ID) REFERENCES Customer(CUSTOMER_ID)
);

CREATE TABLE OrderDetails(
                             PRODUCT_ID              CHAR(15) NOT NULL ,
                             ORDER_ID                INT NOT NULL ,
                             CONSTRAINT FK_Products_OrderDetails FOREIGN KEY (PRODUCT_ID) REFERENCES Products(PRODUCT_ID),
                             CONSTRAINT FK_Orders_OrderDetails FOREIGN KEY (ORDER_ID) REFERENCES Orders(ORDER_ID)
);

-- INSERT DATA

SELECT * FROM STORE.Offices;
SELECT * FROM STORE.Products;
SELECT * FROM  STORE.ProductLines;
SELECT * FROM STORE.Employees;

-- ProductLines
INSERT INTO STORE.ProductLines (PRODUCT_LINE_ID,TEXT_DESCRIPTION,IMAGE) VALUES ('P001','GOOD','IMAGE');
INSERT INTO STORE.ProductLines (PRODUCT_LINE_ID,TEXT_DESCRIPTION,IMAGE) VALUES ('P002','GOOD','IMAGE');
INSERT INTO STORE.ProductLines (PRODUCT_LINE_ID,TEXT_DESCRIPTION,IMAGE) VALUES ('P003','GOOD','IMAGE');
INSERT INTO STORE.ProductLines (PRODUCT_LINE_ID,TEXT_DESCRIPTION,IMAGE) VALUES ('P004','GOOD','IMAGE');
INSERT INTO STORE.ProductLines (PRODUCT_LINE_ID,TEXT_DESCRIPTION,IMAGE) VALUES ('P005','GOOD','IMAGE');

-- Products
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL101','COMPUTER','NEW','Dell','IS0-9001',10,10000000,11000000,'P001');
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL102','KEY','NEW','Asus','IS0-9001',100,5000000,5500000,'P002');
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL103','MOUSE','NEW','Apple','IS0-9001',50,6000000,70000000,'P003');
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL104','KEYBOARD','NEW','Samsung','IS0-9001',200,1000000,1500000,'P004');
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL105','RAM','NEW','KINGDOM','IS0-9001',50,8000000,8500000,'P005');
INSERT INTO STORE.Products (PRODUCT_ID,PRODUCT_NAME,PRODUCT_SCALE,PRODUCT_VENDOR,PRODUCT_DESCRIPTON,QUANTITY_IN_STOCK,BUY_PRICE,MSRP,PRODUCT_LINE_ID)
VALUES ('PL106','CAP','NEW','Samsung','IS0-9001',40,7000000,7500000,'P005');

-- Offices
INSERT INTO STORE.Offices (OFFICE_CODE_ID,CITY,PHONE,ADDRESSLINE1,ADDRESSLINE2,STATE,COUNTRY,POSTAL_CODE)
VALUES ('OF001','HCM','012345678','HCM1','HCM2','Ohio','VietNam','038');
INSERT INTO STORE.Offices (OFFICE_CODE_ID,CITY,PHONE,ADDRESSLINE1,ADDRESSLINE2,STATE,COUNTRY,POSTAL_CODE)
VALUES ('OF002','Velag','012345678','Vl1','Vl2','Velag','Anh','039');
INSERT INTO STORE.Offices (OFFICE_CODE_ID,CITY,PHONE,ADDRESSLINE1,ADDRESSLINE2,STATE,COUNTRY,POSTAL_CODE)
VALUES ('OF003','VinhLong','012345678','V1','V2','VinhLong','Mi','037');
INSERT INTO STORE.Offices (OFFICE_CODE_ID,CITY,PHONE,ADDRESSLINE1,ADDRESSLINE2,STATE,COUNTRY,POSTAL_CODE)
VALUES ('OF004','HaNoi','012345678','HN1','HN2','HaNoi','Phap','040');
INSERT INTO STORE.Offices (OFFICE_CODE_ID,CITY,PHONE,ADDRESSLINE1,ADDRESSLINE2,STATE,COUNTRY,POSTAL_CODE)
VALUES ('OF005','ThaiBinh','012345678','TB1','TB2','ThaiBinh','Canada','041');

-- Employees
INSERT INTO STORE.Employees (LAST_NAME,FIRST_NAME,EMAIL,JOB_TITLE,OFFICE_CODE_ID,REPOST_TO)
VALUES ('Nguyen','Huy Hoang','hoangnh@gmail.com','QTKD','OF001',1);
INSERT INTO STORE.Employees (LAST_NAME,FIRST_NAME,EMAIL,JOB_TITLE,OFFICE_CODE_ID,REPOST_TO)
VALUES ('Nguyen','Thi Trang','TrangNT@gmail.com','KT','OF001',2);
INSERT INTO STORE.Employees (LAST_NAME,FIRST_NAME,EMAIL,JOB_TITLE,OFFICE_CODE_ID,REPOST_TO)
VALUES ('Tran','Trung Hung','HungTT@gmail.com','KD','OF003',1);
INSERT INTO STORE.Employees (LAST_NAME,FIRST_NAME,EMAIL,JOB_TITLE,OFFICE_CODE_ID,REPOST_TO)
VALUES ('Le','Thanh Tung','TungLT@gmail.com','AG','OF002',3);
INSERT INTO STORE.Employees (LAST_NAME,FIRST_NAME,EMAIL,JOB_TITLE,OFFICE_CODE_ID,REPOST_TO)
VALUES ('Tran','Thi Huyen','Huyen@gmail.com','KD','OF001',2);

-- AND

SELECT p.PRODUCT_LINE_ID,p.PRODUCT_NAME,p.BUY_PRICE,p.QUANTITY_IN_STOCK FROM STORE.Products p
WHERE p.BUY_PRICE > 5000000 AND p.QUANTITY_IN_STOCK >10;

-- AND vs JOIN
SELECT p.PRODUCT_ID,p.PRODUCT_NAME,p.BUY_PRICE,pl.TEXT_DESCRIPTION FROM STORE.Products p
                                                                            JOIN STORE.ProductLines pl ON p.PRODUCT_LINE_ID = pl.PRODUCT_LINE_ID WHERE p.BUY_PRICE > 5000000 AND p.BUY_PRICE < 10000000;

-- OR

SELECT p.PRODUCT_ID,p.PRODUCT_NAME,p.PRODUCT_VENDOR  FROM STORE.Products p
WHERE p.PRODUCT_NAME = 'KEYBOARD' OR p.PRODUCT_VENDOR='Samsung';

-- SELECT EMPLOYEE
SELECT * FROM STORE.Employees;

SELECT e.EMPLOYEE_ID,e.LAST_NAME,e.FIRST_NAME FROM STORE.Employees e;

--

SELECT e.EMPLOYEE_ID,e.LAST_NAME,e.FIRST_NAME,e.EMAIL FROM  STORE.Employees e
WHERE e.FIRST_NAME = 'Thi Trang' AND e.EMAIL='TrangNT@gmail.com';

-- LIKE = 'A'

SELECT * FROM Employees WHERE FIRST_NAME LIKE '%A%';

--  BETWWEN 2 AND 5;

SELECT * FROM Employees WHERE EMPLOYEE_ID BETWEEN 3 AND 5;

-- IN
SELECT * FROM Employees WHERE JOB_TITLE IN ('QTKD','KD');

-- OR
SELECT * FROM Employees WHERE JOB_TITLE='AG' OR JOB_TITLE='KT';

-- ORDER BY

SELECT * FROM Employees ORDER BY FIRST_NAME DESC ;

-- COUNT

SELECT JOB_TITLE ,COUNT(JOB_TITLE) AS TOTAL  FROM Employees WHERE JOB_TITLE='KD';

-- UPDATE

UPDATE Employees e SET  e.FIRST_NAME = 'Nhat Linh' WHERE e.EMPLOYEE_ID = 1;

SELECT * FROM Employees WHERE  EMPLOYEE_ID = 1;

-- DELETE
