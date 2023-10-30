CREATE TABLE IF NOT EXISTS conference (
    id SERIAL PRIMARY KEY,
    description VARCHAR(50),
    city VARCHAR(50),
    total_assistants INT
    );

CREATE TABLE IF NOT EXISTS assistant (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(50),
    role VARCHAR(50),
    conference_id INT,
    FOREIGN KEY (conference_id) REFERENCES conference(id)
    );
