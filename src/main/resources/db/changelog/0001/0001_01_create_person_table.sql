--liquibase formatted sql
--changeset abed:0001-01

CREATE TABLE Person
(
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    age int
);

INSERT INTO Person(name, age) VALUES ('Test Person', 30);

-- rollback DROP TABLE Person;