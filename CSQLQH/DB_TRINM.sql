CREATE DATABASE Trinm;
USE Trinm;


CREATE TABLE Customer(
    ID_CUSTOMER CHAR(5),
    CONSTRAINT PK_Customer PRIMARY KEY (ID_CUSTOMER),
    FULL_NAME NVARCHAR(50) NOT NULL ,
    ADDRESS NVARCHAR(50) NOT NULL ,
    BIRTHDAY DATE NOT NULL
);


INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00001','Tran Canh','ENG','2005-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00002','Ho Quy Ly','GERMANY','2006-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00003','Le Van Dinh','VIETNAM','2007-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00004','Tran Thanh Tong','USA','2004-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00005','Tran Quoc Tuan','ICELAND','2002-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00006','Tran Nhan Tong','VIETNAM','2003-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00007','Nguyen Hue','CANADA','2008-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00008','Nguyen Anh','USA','2009-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00009','Nguyen Nhac','FRANCE','2010-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00010','Khai Dinh','CHINA','2011-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00011','Bao Dai','BRUNE','2012-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00012','Ly Tu Trong','ITALYA','2013-03-03');
INSERT INTO Trinm.Customer  (ID_CUSTOMER,FULL_NAME,ADDRESS,BIRTHDAY) VALUE ('00013','Tran Quoc Toan','SING','2018-03-03');


-- LIMIT 10 RECORD

SELECT  * FROM  Trinm.Customer  LIMIT 10;

-- UPDATE

UPDATE Trinm.Customer SET Customer.ADDRESS = 'Viet Nam' WHERE Customer.ID_CUSTOMER = '00001';

SELECT * FROM  Trinm.Customer WHERE Customer.ID_CUSTOMER = '00001';

-- DELETE

DELETE FROM  Trinm.Customer WHERE Customer.ID_CUSTOMER = '00001';

-- LIKE

SELECT * FROM Trinm.Customer WHERE Customer.FULL_NAME LIKE '%a%';

-- BETWEEN

SELECT * FROM Trinm.Customer WHERE Customer.AGE BETWEEN 10 AND 15;

-- IN

SELECT * FROM Trinm.Customer WHERE Customer.ADDRESS IN ('Viet Nam','Canada','Brune');

--  <=
SELECT  * FROM  Trinm.Customer WHERE Customer.BIRTHDAY <='2003-03-03' AND ADDRESS = 'Viet Nam';

-- DROP

DROP DATABASE Trinm;
