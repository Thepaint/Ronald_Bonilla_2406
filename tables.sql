create table client

(NAME CHAR (20),

ID  CHAR (9) PRIMARY KEY,

ADDRESS CHAR (20),

PHONE_NUMBER CHAR (10));




create table CLIENT_order

(QUANTITY CHAR (2),

DESCRIPTION VARCHAR (20),

LOCATION CHAR(20),
ORDER_DATE DATE,

ID  CHAR (9),

COMMISSION DECIMAL (4,2),

CLASS CHAR (10));





create table worker

(NAME VARCHAR(20),

ID  CHAR (9) PRIMARY KEY,

CONDITIONS CHAR (6),

CLASS CHAR (10),

AVAILABILITY CHAR(3));

task
select client_order.locations, client_order.id, worker.id, client_order.commission
from client_order, worker;

contracted_worker
SELECT client_order.id, client.id, client_order.description, client_order.order_date
from client, client_order;

worker_request
select client_order.id, client.id, worker.id, client_order.description, client_order.date
from client, client_order, worker;

create table bill
(COMMISSION DECIMAL (4,2),
RATE DECIMAL (2,2),
hours_done timestamp,
date_listed date,
info VARCHAR (20));

create table USER_ACCOUNT
(NAME CHAR (18),
ID CHAR (9) PRIMARY KEY,
ADDRESS VARCHAR (30),
PHONE_NUMBER CHAR (9),
EMAIL VARCHAR (30) ,
BILL_INFO varchar(30) );

create table WORKER_REGISTRATION 
(NAME CHAR (20),
ID  CHAR (9) PRIMARY KEY,
ADDRESS CHAR (20),
PHONE_NUMBER CHAR (10));

