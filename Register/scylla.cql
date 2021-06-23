CREATE KEYSPACE register WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1};

use register;

CREATE TABLE Register(
id UUID,
name VARCHAR,
age INT,
cpf VARCHAR,
email VARCHAR,
phone VARCHAR,
PRIMARY KEY (cpf)
);