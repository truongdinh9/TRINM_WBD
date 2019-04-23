CREATE DATABASE ManagerBlog;
USE ManagerBlog;

CREATE TABLE Blog(
    id          INT AUTO_INCREMENT,
    CONSTRAINT PK_Blog PRIMARY KEY (id),
    name        VARCHAR(100) NOT NULL ,
    content     TEXT NOT NULL
);

