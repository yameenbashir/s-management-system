-- AUTHOR : Team(TSHSMS)
-- DATE : 20-August-2014
-- TIME: 10:19 PM
-- LAST COMMIT: Add 4 tables and remove errors

DROP DATABASE IF EXISTS TSHSMS;
CREATE DATABASE TSHSMS;
USE `TSHSMS`;
DROP TABLE IF EXISTS `login`;
CREATE TABLE login(
  user_id INT(12)   NOT NULL,
  password TEXT(10)  NOT NULL,
  CONSTRAINT `login_user_id_pk` PRIMARY KEY (user_id)
);

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE administrator(
  user_id INT(12)   NOT NULL,
  password TEXT(10)  NOT NULL,
  admin_name TEXT(10)  NOT NULL,
  CONSTRAINT `administrator_user_id_pk` PRIMARY KEY (user_id),
  CONSTRAINT `administrator_user_id_fk` FOREIGN KEY (user_id) REFERENCES login (`user_id`)
);

DROP TABLE IF EXISTS `student`;
CREATE TABLE student(
  registration_no INT(12)   NOT NULL,
  CONSTRAINT `student_reg_no_pk` PRIMARY KEY (registration_no),
  CONSTRAINT `student_reg_no_fk` FOREIGN KEY (registration_no) REFERENCES login (`user_id`)
);

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE teacher(
  teacher_id INT(12)   NOT NULL,
  CONSTRAINT `teacher_teacher_id_pk` PRIMARY KEY (teacher_id),
  CONSTRAINT `teacher_teacher_id_fk` FOREIGN KEY (teacher_id) REFERENCES login (`user_id`)
);

DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts`(
 registration_no INT (10) NOT NULL,
 student_name TEXT(10) NOT NULL,
 fee_amount DOUBLE NOT NULL,
 fee_month TEXT (10) NOT NULL,
 start_date DATE NOT NULL,
 due_date DATE NOT NULL,
 end_date DATE NOT NULL,
 after_due_date_fine INT (10) NOT NULL,
 fee_after_due_date double NOT NULL,
 CONSTRAINT `accounts_reg_no_pk` PRIMARY KEY (registration_no),
 CONSTRAINT `accounts_reg_no_fk` FOREIGN KEY (registration_no) REFERENCES student (`registration_no`)
);

DROP TABLE IF EXISTS `student_personal_info`;
CREATE TABLE `student_personal_info`(
 registration_no INT (10) NOT NULL,
 first_name TEXT(10) NOT NULL,
 last_name TEXT(10) NOT NULL,
 father_name TEXT(20) NOT NULL,
 dob DATE NOT NULL,
 gender TEXT (10) NOT NULL,
 address TEXT (30) NOT NULL,
 religion TEXT (10) NOT NULL,
 land_line INT (15) NOT NULL,
 student_cetagary TEXT (20) NOT NULL,
 CONSTRAINT `student_p_info_pk` PRIMARY KEY (registration_no),
  CONSTRAINT `student_p_info_fk` FOREIGN KEY (registration_no) REFERENCES student (`registration_no`)
);

DROP TABLE IF EXISTS `parent_details`;
CREATE TABLE `parent_details`(
 registration_no INT (10) NOT NULL,
 father_first_name TEXT(10) NOT NULL,
 father_last_name TEXT(10) NOT NULL,
 father_occupation TEXT(20) NOT NULL,
 father_mob INT(15) NOT NULL,
 -- parent_contct_detail TEXT(30) NOT NULL,
 office_fone1 INT(15) NOT NULL,
 office_fone2 INT(15) NOT NULL,
 office_address TEXT (30) NOT NULL,
 e_mail TEXT(20) NOT NULL,
 CONSTRAINT `parent_detail_reg_no_pk` PRIMARY KEY (registration_no),
 CONSTRAINT `parent_detail_reg_no_fk` FOREIGN KEY (registration_no) REFERENCES student (`registration_no`)
);

DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info`(
 teacher_id INT (10) NOT NULL,
 first_name TEXT (10) NOT NULL,
 last_name TEXT (10) NOT NULL,
 merital_status TEXT NOT NULL,
 father_name TEXT (20) NOT NULL,
 experience INT (3) NOT NULL,
 emp_dept TEXT (10) NOT NULL,
 dob DATE NOT NULL,
 gender TEXT (10) NOT NULL,
 religion TEXT (10) NOT NULL,
 CONSTRAINT `teacher_info_pk` PRIMARY KEY (teacher_id),
  CONSTRAINT `teacher_info_fk` FOREIGN KEY (teacher_id) REFERENCES teacher (`teacher_id`)
);

DROP TABLE IF EXISTS `teacher_contact`;
CREATE TABLE `teacher_contact`(
 teacher_id INT (10) NOT NULL,
 last_name TEXT (10) NOT NULL,
 father_occupation TEXT (20) NOT NULL,
 phone1 TEXT(15) NOT NULL,
 phone2 TEXT(15) NOT NULL,
 -- father/husband_mob INT(15) NOT NULL,
 address TEXT(30) NOT NULL,
 e_mail TEXT(20) NOT NULL,
CONSTRAINT `teacher_contact_pk` PRIMARY KEY (teacher_id),
  CONSTRAINT `teacher_contact_fk` FOREIGN KEY (teacher_id) REFERENCES teacher (`teacher_id`)
);
