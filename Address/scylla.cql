CREATE KEYSPACE address WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1};

use address;

CREATE TABLE Address(
id UUID,
street VARCHAR,
number INT,
city VARCHAR,
state VARCHAR,
postalCode VARCHAR,
PRIMARY KEY (id)
);