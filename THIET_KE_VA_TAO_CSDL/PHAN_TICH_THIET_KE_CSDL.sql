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


