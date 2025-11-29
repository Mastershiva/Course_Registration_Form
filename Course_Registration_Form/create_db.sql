CREATE DATABASE course_db;
USE course_db;
CREATE TABLE employee (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    contact VARCHAR(20),
    course VARCHAR(100),
    comments VARCHAR(255)
);
