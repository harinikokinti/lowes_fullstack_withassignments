CREATE DATABASE jdbctraining;

USE jdbctraining;

CREATE TABLE employee (id int auto_increment, name text, age int, designation text, department text, country text, PRIMARY KEY(id));

SELECT * FROM employee;

TRUNCATE employee;

SELECT * FROM employee;
INSERT INTO employee (name, age, designation, department, country) VALUES ('Anand', 25, 'Developer', 'IT', 'India'); 
UPDATE employee SET designation = 'IT' WHERE id = 100;
DELETE FROM employee WHERE pid = 100;

SELECT CURRNT_TIMESTAMP;

DROP TABLE employee;
DROP DATABASE jdbctraining;