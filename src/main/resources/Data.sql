CREATE TABLE users (
--    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_nr VARCHAR(10) NOT NULL,
    has_license BOOLEAN NOT NULL
);

CREATE TABLE brand (
--    brand_id INT AUTO_INCREMENT PRIMARY KEY,
    brand_name VARCHAR(50) NOT NULL
);
--
CREATE TABLE class (
--    class_id INT AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(50) NOT NULL
);
--
CREATE TABLE model (
--    model_id INT AUTO_INCREMENT PRIMARY KEY,
    model_name VARCHAR(50) NOT NULL
);

-- Adding whole Mercedes-Benz brand to database
INSERT INTO brand VALUES ('Mercedes-Benz');
INSERT INTO class VALUES ('C klass');
INSERT INTO model VALUES ('C 160');
INSERT INTO model VALUES ('C 180');
--INSERT INTO model (name, class_id) VALUES ('C 200', 1);
--INSERT INTO model (name, class_id) VALUES ('C 220', 1);
--
---- Adding whole BWM brand to database
INSERT INTO brand VALUES ('BMW');
INSERT INTO class VALUES ('3 seeria');
INSERT INTO model VALUES ('315');

INSERT INTO users VALUES ('Kris','Tonis','+37245677',true);
--INSERT INTO model (name, class_id) VALUES ('316', 2);
--INSERT INTO model (name, class_id) VALUES ('317', 2);
--INSERT INTO model (name, class_id) VALUES ('318', 2);
--INSERT INTO model (name, class_id) VALUES ('319', 2);
--INSERT INTO class (class_name, brand_id) VALUES ('4 seeria',2);
--INSERT INTO class (name, brand_id) VALUES ('5 seeria', 2);
--INSERT INTO model (name, class_id) VALUES ('518', 4);
--INSERT INTO model (name, class_id) VALUES ('520', 4);
--INSERT INTO model (name, class_id) VALUES ('523', 4);
--INSERT INTO model (name, class_id) VALUES ('524', 4);
--INSERT INTO model (name, class_id) VALUES ('525', 4);
--
---- Adding whole Audi brand to database
--INSERT INTO brand (name) VALUES ('Audi');
--INSERT INTO class (name, brand_id) VALUES ('A-seeria', 3);
--
---- Adding Citroën brand to database
--INSERT INTO brand (name) VALUES ('Citroën');
--
---- Adding Other brand to database
--INSERT INTO brand (name) VALUES ('Muu');

--INSERT INTO users VALUES (true, 1,'Kris','Tonis','+37245677');
-- INSERT INTO users VALUES (false,4343556,1,'Kris','Ton');
-- Add more car brands and models as needed