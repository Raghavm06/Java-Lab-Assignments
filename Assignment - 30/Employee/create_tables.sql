CREATE DATABASE IF NOT EXISTS jdbc_demo;
USE jdbc_demo;

CREATE TABLE IF NOT EXISTS employee_jsp (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    salary DOUBLE
);

CREATE TABLE IF NOT EXISTS patient (
    patient_id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    disease VARCHAR(100),
    treatment_status VARCHAR(50)
);
