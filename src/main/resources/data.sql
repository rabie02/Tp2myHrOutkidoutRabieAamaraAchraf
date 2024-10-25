CREATE TABLE employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    mail VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('John', 'Doe', 'john.doe@example.com', 'password123');

INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('Jane', 'Smith', 'jane.smith@example.com', 'password456');

INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('Emily', 'Johnson', 'emily.johnson@example.com', 'password789');

INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('Michael', 'Brown', 'michael.brown@example.com', 'password321');

INSERT INTO employees (first_name, last_name, mail, password)
VALUES ('David', 'Wilson', 'david.wilson@example.com', 'password654');
