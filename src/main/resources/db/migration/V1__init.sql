CREATE TABLE IF NOT EXISTS conference (
    id SERIAL PRIMARY KEY,
    description VARCHAR(50),
    city VARCHAR(50),
    totalassistants INT
    );

CREATE TABLE IF NOT EXISTS assistant (
    id SERIAL PRIMARY KEY,
    fullname VARCHAR(50),
    role VARCHAR(50),
    conferenceid INT,
    FOREIGN KEY (conferenceid) REFERENCES conference(id)
    );
