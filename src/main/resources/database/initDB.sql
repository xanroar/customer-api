CREATE TABLE IF NOT EXISTS customers
(
    id    INTEGER PRIMARY KEY ,
    name  VARCHAR(200) NOT NULL ,
    email VARCHAR(254) NOT NULL ,
    phone VARCHAR(50)  NOT NULL
    );
CREATE SEQUENCE IF NOT EXISTS customers_seq START 1;