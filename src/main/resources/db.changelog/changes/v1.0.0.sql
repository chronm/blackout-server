-- liquibase formatted sql
-- changeset kevin.raddatz:v1.0.0

create table user (
    id varchar(64) primary key,
    name varchar(255) not null
);

create table home(
    id varchar(64) primary key,
    name varchar(255) not NULL
);
