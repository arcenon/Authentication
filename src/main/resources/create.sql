CREATE DATABASE IF NOT EXISTS `authentication` DEFAULT CHARACTER SET utf8;
USE `authentication`;

CREATE USER 'demoUser'@'localhost' IDENTIFIED BY 'neverStorePasswordsInSourceCode';
GRANT ALL PRIVILEGES ON authentication.* TO 'demoUser'@'localhost';

CREATE TABLE IF NOT EXISTS `authentication`.`credentials`
(
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(64) NOT NULL,
    `hash` VARCHAR(255) NOT NULL,
    `salt` VARCHAR(10) NOT NULL,
    `algorithm` VARCHAR(20) NOT NULL,
    `code` VARCHAR(10),
    `code_expiration` DATETIME,
    `token` VARCHAR(36),
    PRIMARY KEY (id),
    UNIQUE (username)
);