USE TFMS;
SELECT * FROM BATCH;
ALTER TABLE BATCH ADD MESSEGE1 VARCHAR(250) NOT NULL AFTER TRAINING_DURATION ;
SELECT * FROM BATCH;


DROP TRIGGER my_trigger;
delimiter %%
create trigger my_trigger
before insert 
on batch for each row 
begin 
 if NEW.training_duration <2000 then set NEW.MESSEGE1= CONCAT(NEW.TOPIC_NAME, 'ITS NOT UPDATED TRAINING DURATION');
 END IF ;
 END%%
 
 INSERT INTO BATCH VALUES('COREJAVA',12,'HI',101,103,'2022-02-02','2023-02-02','HI');
 SELECT DISTINCT * FROM BATCH;
 