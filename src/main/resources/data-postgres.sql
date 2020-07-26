INSERT INTO accounts(user_id, full_name, username, password, email, created_on, last_login)
VALUES (uuid_generate_v4(), 'Stefan Miljevic', 'mrstexx', '123', 'test@efforge.io', CURRENT_TIMESTAMP,
        CURRENT_TIMESTAMP);