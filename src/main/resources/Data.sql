CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone VARCHAR(10) NOT NULL,
    has_license BOOLEAN NOT NULL
);

CREATE TABLE cars (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL
);

INSERT INTO users VALUES (1,'Kris','Tonis',456778,true);
-- INSERT INTO users VALUES (false,4343556,1,'Kris','Ton');

INSERT INTO cars VALUES (1,'Mercedes-Benz','C-klass');
-- INSERT INTO cars (brand, model) VALUES ('Mercedes-Benz', 'C 160');
-- INSERT INTO cars (brand, model) VALUES ('Mercedes-Benz', 'C 180');
-- Add more car brands and models as needed