/* 

    Author :- Aakash Solanke
    Date :- 1 Jan 2023
    
*/

 select @@autocommit;
 
 SHOW VARIABLES WHERE variable_name='autocommit';
 
 START TRANSACTION;
SAVEPOINT initialstate;
INSERT INTO  associate values("123","mrunal","dotnet","b-tech","20 year");
select * from associate;
SAVEPOINT updatestate;
update associate set associate_name="krunal" where associate_id=101;
select * from associate;
rollback to initialstate;
select * from associate;
 