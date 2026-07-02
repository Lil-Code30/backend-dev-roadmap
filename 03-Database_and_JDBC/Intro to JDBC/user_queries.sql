CREATE TABLE IF NOT EXISTS users (
id BIGSERIAL PRIMARY KEY,
full_name VARCHAR(100) NOT NULL,
email VARCHAR(200) NOT NULL UNIQUE,
created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

SELECT * FROM users;

INSERT INTO users (full_name, email) 
VALUES ('John Doe', 'johndoe@gmail.com');