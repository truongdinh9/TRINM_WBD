CREATE  DATABASE  LIBARY;
USE LIBARY;


CREATE TABLE Category(
                         CATEGORY_ID              INT AUTO_INCREMENT,
                         CONSTRAINT PK_Category PRIMARY KEY (CATEGORY_ID),
                         CATEGORY_NAME            VARCHAR(50) NOT NULL
);

CREATE TABLE Student(
                        STUDENT_ID               INT AUTO_INCREMENT,
                        CONSTRAINT PK_Student PRIMARY KEY (STUDENT_ID),
                        STUDENT_NAME             VARCHAR(50) NOT NULL ,
                        BIRTHDAY                 DATE NOT NULL ,
                        ADDRESS                  VARCHAR(200) NOT NULL ,
                        EMAIL                    VARCHAR(100) NOT NULL ,
                        PHONE                    VARCHAR(10) NOT NULL ,
                        INMAGE                   TEXT
);

CREATE TABLE BorrowOrder(
                            BORROW_ORDER_ID          INT AUTO_INCREMENT,
                            CONSTRAINT PK_BorrowOrder PRIMARY KEY (BORROW_ORDER_ID),
                            STUDENT_ID               INT NOT NULL ,
                            START_DATE               DATETIME NOT NULL ,
                            OVER_DATE                DATETIME NOT NULL ,
                            QUANTITY                 INT NOT NULL ,
                            STATUS                   VARCHAR(50) DEFAULT 'NOT YET',
                            DATE_OF_PAYMENT          DATETIME NOT NULL ,
                            DESCRIPTION              TEXT,
                            CONSTRAINT FK_Student_BorrowOrder FOREIGN KEY (STUDENT_ID) REFERENCES Student(STUDENT_ID)
);

CREATE TABLE Book(
                     BOOK_ID                  INT AUTO_INCREMENT,
                     CONSTRAINT  PK_Book PRIMARY KEY (BOOK_ID),
                     BOOK_NAME                VARCHAR(50) NOT NULL ,
                     PUBLISHER                VARCHAR(50) NOT NULL ,
                     AUTHOR                   VARCHAR(50) NOT NULL ,
                     PUBLISHING_YEAR          DATE NOT NULL ,
                     PUBLICATION_NUMBER       INT NOT NULL ,
                     PRICE                    NUMERIC(11,2) NOT NULL ,
                     INMAGE                   TEXT,
                     CATEGORY_ID              INT NOT NULL ,
                     BORROW_ORDER_ID          INT NOT NULL ,
                     CONSTRAINT FK_BorrowOrder_Book FOREIGN KEY (BORROW_ORDER_ID) REFERENCES BorrowOrder(BORROW_ORDER_ID),
                     CONSTRAINT FK_Category_Book FOREIGN KEY (CATEGORY_ID) REFERENCES Category(CATEGORY_ID)
);

