# Simple App that accepts a file via RESTful API and stored the records in Postgres database.


* Download postgres
* Go to terminal : psql template1

Below is the command which is used to create local db 

    template1=# CREATE USER miki WITH PASSWORD 'mypass123';

    template1=# ALTER ROLE miki WITH CREATEDB;

    template1=# CREATE DATABASE  appdb;

    template1=# GRANT ALL PRIVILEGES ON DATABASE  appdb to miki;

    template1=# ALTER DATABASE appdb OWNER to miki;

 * Create below table in pgadmin

```SQL
 CREATE TABLE IF NOT EXISTS public."orders"
(
	id SERIAL PRIMARY KEY,
    orderId text UNIQUE NOT NULL,
    region text,
	country text,
    itemType text,
    salesChannel text,
    orderPriority text,
    orderDate text,
    shipDate text,
    unitsSold integer,
    unitPrice float,
    unitCost float, 
    totalRevenue float,
    totalCost float,
    totalProfit float,
    creationDate timestamp with time zone DEFAULT now()
);
```
##command to run from command line

* cd FileApi/

    java -jar target/FileAPI-0.0.1-SNAPSHOT.jar


## Build docker Image 

* mvn clean install
* docker images
* docker build -t “fileapi:latest” .
* docker run -p 8082:8082 imageid

