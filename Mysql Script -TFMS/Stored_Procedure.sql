/*
     Author :- Aakash Solanke
     Date:- 17Th Jan 2023

*/

USE tfms;

------------- Insertion of data ------------

DROP PROCEDURE IF EXISTS insert_Associate_Details;
DELIMITER // ;
CREATE PROCEDURE insert_Associate_Details(IN Associate_id VARCHAR(10),IN Associate_name VARCHAR(20), IN Associate_track VARCHAR(20),IN Associate_qualification VARCHAR(20),IN Associate_experience VARCHAR(30))
BEGIN
INSERT INTO associate(Associate_id, Associate_name, Associate_track, Associate_qualification,Associate_experience) values (Associate_id, Associate_name, Associate_track, Associate_qualification,Associate_experience);
END ;

SELECT * FROM ASSOCIATE;
CALL insert_Associate_Details("23","ram","mainframe","m-tech","4");

----------- Show Associate details ----------------

DROP PROCEDURE IF EXISTS show_Associate_details ;
DELIMITER // ;
CREATE PROCEDURE show_Associate_details()
BEGIN
SELECT * FROM associate;
END ;

CALL show_Associate_details();


----------------- Delete Associate details -------------

DROP PROCEDURE IF EXISTS Delete_Associate_details ;
DELIMITER // ;
CREATE PROCEDURE Delete_Associate_details(IN my_associate_id varchar(20))
BEGIN
DELETE FROM associate WHERE associate_id = my_associate_id;
END ;

CALL Delete_Associate_details("23");



----------- Update Associate name --------------

DROP PROCEDURE IF EXISTS update_Associate_name ;
DELIMITER // ;
CREATE PROCEDURE update_Associate_name(IN my_associate_id varchar(20),IN my_associate_name varchar(20))
BEGIN
UPDATE associate SET associate_name = my_associate_name WHERE associate_id = my_associate_id;
END ;

CALL update_Associate_name("101","new_name")

----------- Update Associate track  --------------

DROP PROCEDURE IF EXISTS update_Associate_track ;
DELIMITER // ;
CREATE PROCEDURE update_Associate_track(IN my_associate_id varchar(20),IN my_associate_track varchar(20))
BEGIN
UPDATE associate SET associate_track = my_associate_track WHERE associate_id = my_associate_id;
END ;

select * from associate;
CALL update_Associate_track("101","testing")


-------------- Update Associate qualification ------------

DROP PROCEDURE IF EXISTS update_Associate_qualification ;
DELIMITER // ;
CREATE PROCEDURE update_Associate_qualification(IN my_associate_id varchar(20),IN my_associate_qualification varchar(20))
BEGIN
UPDATE associate SET associate_qualification = my_associate_qualification WHERE associate_id = my_associate_id;
END ;

CALL update_Associate_qualification("101","B-tech");


-------------- Update Associate experience ---------- 

DROP PROCEDURE IF EXISTS update_Associate_experience ;
DELIMITER // ;
CREATE PROCEDURE update_Associate_experience(IN my_associate_id varchar(20),IN my_Associate_experience varchar(20))
BEGIN
UPDATE associate SET Associate_experience = my_Associate_experience WHERE associate_id = my_associate_id;
END ;

Call update_Associate_experience("101","23 year")

-------------------- Insert data into login table -------------

DROP PROCEDURE IF EXISTS Associate_Registrstion_details ;
DELIMITER // ;
CREATE PROCEDURE Associate_Registrstion_details(IN user_name varchar(20),IN user_password varchar(20),IN user_rool VARCHAR(20) )
BEGIN
INSERT INTO  associate_login(user_name,user_password,user_rool) VALUES(user_name,user_password,user_rool);
END ;

CALL Associate_Registrstion_details("veera","veera@123","associate");

select * from associate_login;


----------------------- Particular associate data using Associated Id ------------------

DROP PROCEDURE IF EXISTS getone_Associate_details ;
DELIMITER // ;
CREATE PROCEDURE getone_Associate_details(IN my_associate_id varchar(20))
BEGIN
SELECT * FROM associate WHERE associate_id = my_associate_id;
END ;

CALL getone_Associate_details("101");
