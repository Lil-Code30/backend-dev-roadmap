CREATE TABLE Customer (
 customerId SERIAL PRIMARY KEY,
 first_name VARCHAR(100) NOT NULL,
 last_name VARCHAR(100),
 points INT DEFAULT 0
);

SELECT * FROM Customer;

INSERT INTO customer (first_name, last_name) VALUES 
('loko','Ismael'),
('John', 'Doe')
;