-- Creating users table
CREATE TABLE users (
--    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    phone_nr VARCHAR(10) NOT NULL,
    has_license BOOLEAN NOT NULL
);

-- Creating all the needed car tables first
CREATE TABLE brand (
    brand_name VARCHAR(50) NOT NULL
    --    brand_id INT AUTO_INCREMENT PRIMARY KEY,
);
--
CREATE TABLE class (
    class_name VARCHAR(50) NOT NULL
--    brand_id INT AUTO_INCREMENT PRIMARY KEY
);
--
CREATE TABLE model (
--    model_id INT AUTO_INCREMENT PRIMARY KEY,
    model_name VARCHAR(50) NOT NULL
);

-- NB: Hardcoded data directly into the service layer is not the best practice especially
-- when I have multiple brands with their respective classes and models.
-- This way, I can easily manage and update the initial data without modifying the code.

-- Insert first user to database
INSERT INTO users VALUES ('Kris','Tonis','+37245677',true);

-- Insert Car Brands
INSERT INTO brand VALUES ('Mercedes-Benz');
INSERT INTO brand VALUES ('BMW');
--INSERT INTO car_brand (id, name) VALUES (3, 'Audi');

-- Insert Car Classes for Mercedes-Benz
INSERT INTO class VALUES ('C Class');
INSERT INTO class VALUES ('E Class');
--INSERT INTO car_class (id, name, brand_id) VALUES (2, 'D Class', 1);

---- Insert Car Models for Mercedes-Benz C Class
INSERT INTO model VALUES ('C 160');
INSERT INTO model VALUES ('C 170');
--INSERT INTO car_model (id, name, class_id) VALUES (2, 'C 180', 1);

-- Adding whole Mercedes-Benz brand to database
--INSERT INTO brand VALUES ('Mercedes-Benz');
--INSERT INTO class VALUES ('C klass');
--INSERT INTO model VALUES ('C 160');
--INSERT INTO model VALUES ('C 180');
--INSERT INTO model (name, class_id) VALUES ('C 200', 1);
--INSERT INTO model (name, class_id) VALUES ('C 220', 1);

---- Adding whole BWM brand to database
--INSERT INTO brand VALUES ('BMW');
--INSERT INTO class VALUES ('3 seeria');
--INSERT INTO model VALUES ('315');