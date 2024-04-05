-- Creating a database schema
CREATE SCHEMA `SWE645`;

-- Selecting the created database schema to use
USE `SWE645`;

-- Creating the survey table to store the details
CREATE TABLE `survey` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `streetaddress` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `zip` int NOT NULL,
  `telephone` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `dateofsurvey` date NOT NULL,
  `likings` json DEFAULT NULL,
  `interests` varchar(45) DEFAULT NULL,
  `recommendation` varchar(45) DEFAULT NULL,
  `comments` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Viewing the data from table
SELECT * FROM `survey`;