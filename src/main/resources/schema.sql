CREATE TABLE IF NOT EXISTS  professor_info(
professor_id SERIAL PRIMARY KEY,
professor_name VARCHAR(255),
professor_domain VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS student_info (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    degree VARCHAR(255),
    branch VARCHAR(255),
    address json,
    class_incharge INT,
    FOREIGN KEY (class_incharge) REFERENCES professor_info(professor_id)
);