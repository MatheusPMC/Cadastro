CREATE KEYSPACE login WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1};

use login;

CREATE TABLE Login(
id UUID,
name VARCHAR,
age INT,
cpf VARCHAR,
email VARCHAR,
phone VARCHAR,
street VARCHAR,
number INT,
city VARCHAR,
state VARCHAR,
postalCode VARCHAR,
PRIMARY KEY (id)
);