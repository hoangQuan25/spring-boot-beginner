-- drop user first if they exit
DROP USER if exists 'springstudent'@'localhost';

-- now create user with prop privileges
CREATE USER 'springstudent'@'localhost' IDENTIFIED BY 'springstudent';

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'localhost';
