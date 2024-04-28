DROP TABLE IF EXISTS books;

CREATE TABLE books (
                       id INT AUTO_INCREMENT  PRIMARY KEY,
                       name VARCHAR(250) NOT NULL,
                       price INTEGER NOT NULL,
                       author VARCHAR(250) DEFAULT NULL
);