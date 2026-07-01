CREATE TABLE Customer (
 customerId SERIAL PRIMARY KEY,
 first_name VARCHAR(100) NOT NULL,
 last_name VARCHAR(100),
 points INT DEFAULT 0
);