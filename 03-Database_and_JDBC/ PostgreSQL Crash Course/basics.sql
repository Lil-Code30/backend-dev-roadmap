DROP TABLE IF EXISTS people;

CREATE TABLE IF NOT EXISTS people(
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	age INT,
	job VARCHAR(100),
	employed BOOL
);

--- dfdfdf
TRUNCATE TABLE peolple;

INSERT INTO people VALUES (1, 'John', 'Doe', 30, 'Programmer', true);

INSERT INTO people
VALUES  
(2, 'peter', 'johnson', 23, 'indie', true),
(3, 'peter', 'pan', 10, null , false),
(4, 'Stacy', 'something', 30, 'hacker', true);


INSERT INTO people (first_name, last_name, employed) VALUES ('Doe', 'j', false);

SELECT * FROM people;


UPDATE people SET job = 'Designer' WHERE first_name LIKE 'pe%';