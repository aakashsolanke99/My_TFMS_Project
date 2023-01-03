/* 
    Author :- Aakash Solanke
	Date :- 1 Jan 2023
    
*/


SHOW DATABASES;

-- Check current user and database server version
SELECT USER();
SELECT version();

SELECT host, user, account_locked, password_expired
FROM mysql.user
ORDER BY 1,2;

SELECT host, user, db, command 
FROM information_schema.processlist;

-- Check previlages on the account
DESCRIBE mysql.user;

SELECT * FROM mysql.user;

DROP USER 'aakash'@'localhost';
CREATE USER 'aakash'@'localhost';

USE TFMS;

------ GIVE PERMISSIONS USING GRANT --------- 
GRANT select , delete , update on Associate TO 'aakash'@'localhost'; 
GRANT ALL ON batch TO 'aakash'@'localhost';

--------- REMOVE PERMISSIONS USING REVOKE -------
REVOKE select, delete , update ON Associate FROM 'aakash'@'localhost';
REVOKE ALL PRIVILEGES, GRANT OPTION FROM 'aakash'@'localhost';

SHOW GRANTS FOR 'aakash'@'localhost';

-- To Reload newly assigned permissions run:
FLUSH PRIVILEGES;

-- Shows all PERMISSIONS to currenly logged in user
SHOW GRANTS;




