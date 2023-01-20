
/*   
    Author :- Aakash Solanke 
    Date :- 31 Dec 2022
*/

------- DML ------

USE tfms;

------------- Trainer Table -------------

INSERT INTO Trainer VALUES('101','Trainer-1','Java','M-Tech','15');
INSERT INTO Trainer VALUES('102','Trainer-2','Dotnet','MCA','12');
INSERT INTO Trainer VALUES('103','Trainer-3','mainframe','B-Tech','18');
INSERT INTO Trainer VALUES('104','Trainer-4','testing','M.SC.IT','25');


SELECT * FROM trainer;

------------ Associate Table -------------

INSERT INTO Associate VALUES('101','Aakash','Java','M-Tech','5');
INSERT INTO Associate VALUES('102','krunal','Mainframe','M.sc','6');
INSERT INTO Associate VALUES('103','vasavi','testing','MCA','8');
INSERT INTO Associate VALUES('104','prathamesh','DotNet','B-Tech','7');
INSERT INTO Associate VALUES('105','Ankita','Java','M-Tech','10');
INSERT INTO Associate VALUES('106','Swaraj','Mainframe','MCA','12');
INSERT INTO Associate VALUES('107','ram','testing','MCA','12');
INSERT INTO Associate VALUES('108','shriram','DotNet','B.tech','20');
INSERT INTO Associate VALUES('109','veera','Java','M-Tech','12');
INSERT INTO Associate VALUES('110','hemlata','Mainframe','M.sc','12');




select * from Associate;

---------------- login Table ---------
INSERT INTO associate_login values("aakashsolanke","aakash@123","associate");
INSERT INTO associate_login values("krnal","krunal@123","trainer");
INSERT INTO associate_login values("swaraj","swaraj@123","admin");


----------------  Batch Table ---------

INSERT INTO batch VALUES('Android 9.0',4500,101,101,'2022-11-19','2023-03-19');
INSERT INTO batch VALUES('core-java',5500,102,102,'2021-09-11','2021-12-29');
INSERT INTO batch VALUES('Advance-java',6500,103,101,'2023-1-12','2023-04-12');
INSERT INTO batch VALUES('selenium',3500,104,101,'2021-11-09','2022-03-19');

---------------- Question Management Table ---------

INSERT INTO question_management VALUES('Q 1','Instructor','Instructor knowledgeable and able to handle all your queries');
INSERT INTO question_management VALUES('Q 2','Instructor','All the topics in a particular course handled by the trainer without any gaps or slippages');
INSERT INTO question_management VALUES('Q 3','Course Material','The course materials (presentation, hands-on,  etc.) referred during the training are relevant and useful.');
INSERT INTO question_management VALUES('Q 4','Course Material','The reference materials suggested for each module are adequate.');
INSERT INTO question_management VALUES('Q 5','Learning Effectiveness','Knowledge and skills presented in this training are applicable at your work');
INSERT INTO question_management VALUES('Q 6','Environment','The physical environment (e.g. classroom space, air-conditioning) was conducive to learning.');
INSERT INTO question_management VALUES('Q 7','Environment','The software/hardware environment provided was sufficient for the purpose of the training.');
INSERT INTO question_management VALUES('Q 8','Job Impact','This training will improve your job performance.');

SELECT * FROM question_management;

----------------- Capture Feedback Table --------------

INSERT INTO capture_feedback VALUES(101, 102,'Android 9.0','Q 1','Instructor','Instructor knowledgeable and able to handle all your queries','Strongly Disagree-1');
INSERT INTO capture_feedback VALUES(103, 103,'Selenium','Q 2','Instructor','All the topics in a particular course handled by the trainer without any gaps or slippages','Disagree-2');
INSERT INTO capture_feedback VALUES(101, 102,'core-java ','Q 6','Environment','The physical environment (e.g. classroom space, air-conditioning) was conducive to learning.','Neutral-3');
INSERT INTO capture_feedback VALUES(102, 101,'Advance-java','Q 8','Job Impact','This training will improve your job performance.','Agree-4');
INSERT INTO capture_feedback VALUES(103, 106,'Android 9.0','Q 3','Course Material','The course materials (presentation, hands-on,  etc.) referred during the training are relevant and useful.','Strongly Agree-5');

---------------- Associate login ----------------------

INSERT INTO associate_login values("aakash","aakash@123","associate");
INSERT INTO associate_login values("krnal","krunal@123","trainer");
INSERT INTO associate_login values("swaraj","swaraj@123","admin");

-------------------------- --------------

DELETE FROM `tfms`.`associate`
WHERE Associate_id = 101 ;

DELETE FROM `tfms`.`Associate` 
WHERE Associate_name = 'Hemlata';


UPDATE `tfms`.`associate`
SET
`Associate_id` = 109
WHERE `Associate_id` = '108' ;

UPDATE trainer 
SET EMAIL_ID ="aakashsolanke99@gmail.com"
where trainer_id = 101;



DELETE FROM trainer
WHERE
trainer_id = 105;

SELECT * FROM trainer;

DELETE FROM `tfms`.`associate`
WHERE Associate_id = 101 ;

DELETE FROM `tfms`.`Associate` 
WHERE Associate_name = 'Hemlata';


UPDATE `tfms`.`associate`
SET
`Associate_id` = 109
WHERE `Associate_id` = '108' ;

