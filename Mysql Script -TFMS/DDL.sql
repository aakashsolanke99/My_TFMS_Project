/*   
    Author :- Aakash Solanke 
    Date :- 31 Dec 2022
*/

------ DDL -----

DROP DATABASE IF EXISTS TFMS;
CREATE DATABASE TFMS;

USE TFMS;

DROP TABLE IF EXISTS trainer;
CREATE TABLE trainer
(    
    trainer_id VARCHAR(40) PRIMARY KEY NOT NULL,
    trainer_name VARCHAR(30),
    trainer_track ENUM('java','dotnet','mainframe','testing') NOT NULL,
    trainer_qualification VARCHAR(10),
    trainer_experience VARCHAR(20)
);



DROP TABLE IF EXISTS Associate;
CREATE TABLE Associate
(    
    Associate_id VARCHAR(40) PRIMARY KEY NOT NULL,
    Associate_name VARCHAR(30),
    Associate_track ENUM('java','dotnet','mainframe','testing') NOT NULL,
    Associate_qualification VARCHAR(10),
    Associate_experience VARCHAR(20)
    
);
select * from associate;

DROP TABLE IF EXISTS associate_login;
CREATE TABLE associate_login
(
user_name VARCHAR(20), 
user_password VARCHAR(20), 
user_rool VARCHAR(20) 

);

DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(    
	topic_name VARCHAR(30),
    training_duration INT,
	trainer_id VARCHAR(40),
    associate_id VARCHAR(40),
    training_start_date DATE ,
    training_end_date DATE,
	FOREIGN KEY (trainer_id ) REFERENCES trainer(trainer_id),
	FOREIGN KEY (associate_id) REFERENCES Associate(Associate_id)
);

DROP TABLE IF EXISTS question_management;
CREATE TABLE question_management
(
   question_id VARCHAR(10) PRIMARY KEY,
   question_section ENUM('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact') NOT NULL,
   question_text VARCHAR(255)
);

DROP TABLE IF EXISTS capture_feedback;
CREATE TABLE capture_feedback
(
   trainer_id VARCHAR(40),
   associate_id VARCHAR(40),
   topic_name VARCHAR(20),
   question_id VARCHAR(10),
   question_section ENUM('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact') NOT NULL,
   question_text VARCHAR(250),
   rating ENUM('Strongly Disagree-1','Disagree-2', 'Neutral-3','Agree-4','Strongly Agree-5') NOT NULL,
   FOREIGN KEY (trainer_id) REFERENCES trainer(trainer_id),
   FOREIGN KEY (associate_id) REFERENCES Associate(Associate_id),
   FOREIGN KEY (question_id) REFERENCES question_management(question_id)
);

ALTER TABLE trainer
ADD email_id varchar(50) not null
AFTER TRAINER_ID;

TRUNCATE TABLE TRAINER;
----- IF FOREIGN KEY IS PRESENT THEN NEED TO USE 
  SET FOREGIN_KEY_CHECKS=0;
  
  
RENAME TABLE  trainer TO new_trainer;


RENAME TABLE  new_trainer TO trainer;

ALTER TABLE new_trainer
DROP COLUMN EMAIL_ID;

ALTER TABLE associate MODIFY Associate_name INT(22); ------- By using MODIFY us can change the datatype of any attribute 


