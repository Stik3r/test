-- init.sql
CREATE TABLE IF NOT EXISTS savetime (
    id SERIAL PRIMARY KEY,
    savedtime VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO savetime (savedtime) VALUES ('тестовое значение');