DROP TABLE IF EXISTS student;

CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL);

insert into student(name) values('Vinay');
insert into student(name) values('Sai');