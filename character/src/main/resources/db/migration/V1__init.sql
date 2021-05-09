CREATE TABLE character (
	id SERIAL PRIMARY KEY,
	name VARCHAR(200) NOT NULL,
	specie NUMERIC,
	age INTEGER,
	planet NUMERIC,
	date_creation TIMESTAMP,
	master_id INTEGER
);