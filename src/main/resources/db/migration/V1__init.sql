CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    username VARCHAR(100) NOT NULL,
    password VARCHAR (100) NOT NULL,
    firstname VARCHAR (100) NOT NULL,
    lastname VARCHAR (100) NOT NULL,
    PRIMARY KEY (id)
    );
insert into users (username,password,firstname,lastname)
values ('jp','xxx','Juan', 'Perez');