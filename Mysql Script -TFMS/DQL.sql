/*  
    Author :- Aakash Solanke
    Date :- 29 Dec 2022
    
*/
USE TFMS;

SELECT * FROM trainer;
SELECT * FROM associate;
SELECT * FROM batch;
SELECT * FROM capture_feedback;
SELECT * FROM question_management;

SELECT Associate_name FROM associate
WHERE Associate_track = 'java';


SELECT Associate_name , associate_id FROM associate
WHERE Associate_experience < 10;

SELECT COUNT(associate_id) from associate 
WHERE associate_track='Java';

SELECT MAX(training_duration) FROM batch;

SELECT MIN(training_duration) FROM batch;

SELECT SUM(training_duration) from batch;

SELECT associate_name FROM associate 
WHERE associate_name LIKE  "%A";

SELECT associate_name FROM associate 
WHERE associate_name LIKE  "A%";

SELECT topic_name FROM batch 
WHERE training_start_date BETWEEN '2022-01-01' AND '2023-03-01';

SELECT * FROM associate
WHERE associate_track = 'java'
ORDER BY associate_experience;

SELECT COUNT(ASSOCIATE_ID), associate_experience FROM ASSOCIATE 
WHERE ASSOCIATE_TRACK ='JAVA' HAVING associate_experience > 10;

SELECT associate_name, associate_experience, ASSOCIATE_TRACK FROM ASSOCIATE 
WHERE associate_experience > 8 
GROUP BY ASSOCIATE_TRACK;

SELECT training_duration DIV 60 AS Totalhours FROM   batch;
