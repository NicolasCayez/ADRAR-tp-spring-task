CREATE DATABASE IF NOT EXISTS tp_spring_task;
use tp_spring_task;
CREATE TABLE IF NOT EXISTS roles (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
role_name VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS categories (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
label VARCHAR(50) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
lastname VARCHAR(50) NOT NULL,
firstname VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL UNIQUE,
`password` VARCHAR(50) NOT NULL,
role_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS tasks (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
title VARCHAR(50) UNIQUE NOT NULL,
`description` VARCHAR(255)  NOT NULL,
creation_date DATE  NOT NULL,
`status` TINYINT,
user_id INT NOT NULL
);

CREATE TABLE IF NOT EXISTS completing (
task_id INT NOT NULL,
category_id INT NOT NULL
);

ALTER TABLE users
ADD CONSTRAINT fk_roles
FOREIGN KEY(role_id) REFERENCES roles(id);

ALTER TABLE tasks
ADD CONSTRAINT fk_users
FOREIGN KEY(user_id) REFERENCES users(id);

ALTER TABLE completing
ADD CONSTRAINT fk_completing_tasks
FOREIGN KEY(task_id) REFERENCES tasks(id);

ALTER TABLE completing
ADD CONSTRAINT fk_completing_categories
FOREIGN KEY(category_id) REFERENCES categories(id);