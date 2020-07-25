DROP TABLE IF EXISTS accounts;
CREATE TABLE accounts
(
    user_id    serial PRIMARY KEY,
    full_name  VARCHAR(255)        NOT NULL,
    username   VARCHAR(50) UNIQUE  NOT NULL,
    password   VARCHAR(255)        NOT NULL,
    email      VARCHAR(255) UNIQUE NOT NULL,
    created_on TIMESTAMP           NOT NULL,
    last_login TIMESTAMP
);