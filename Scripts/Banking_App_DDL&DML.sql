--DROP SCHEMA IF EXISTS bankingapp cascade;
create schema bankingApp;


create table bankingApp.employeeinfo (
		employee_id SERIAL primary key,
		employee_Name VARCHAR(200),
		employee_password VARCHAR(200) not null
);



create table bankingApp.cardInfo (
		card_id INTEGER primary key,
		customer_id INTEGER,
		card_balance DECIMAL
);

CREATE TABLE bankingApp.customerInfo (
		customer_id SERIAL primary key,
		customer_name VARCHAR(200) check(length(customer_name)>1),
		customer_age VARCHAR(200),
		customer_card INTEGER,
		customer_password VARCHAR(200) NOT NULL,
		
		CONSTRAINT customer_card_fk FOREIGN KEY (customer_card) REFERENCES bankingapp.cardinfo(card_id)
);

create table bankingApp.reciept (
		reciept_id SERIAL primary key,
		customer_id INTEGER,
		changing_amount VARCHAR(200),
		receipt_date date,
		CONSTRAINT customer_id_fk FOREIGN KEY (customer_id) REFERENCES bankingapp.customerinfo(customer_id)
);

INSERT INTO bankingApp.cardInfo VALUES (0313,3123001,43434.1);
INSERT INTO bankingApp.cardInfo VALUES (0314,321303,323.2);
INSERT INTO bankingApp.cardInfo VALUES (0315,323122,23.2);
INSERT INTO bankingApp.cardInfo VALUES (0316,321323004,0.212);

INSERT INTO bankingApp.customerInfo VALUES (3123001,'John','30',0313,'dsdsd');
INSERT INTO bankingApp.customerInfo VALUES (321303,'Ann','19',0314,'dsdasdaffwerwqer');
INSERT INTO bankingApp.customerInfo VALUES (323122,'jason','25',0315,'342rfewdfst');
INSERT INTO bankingApp.customerInfo VALUES (321323004,'Su','61',0316,'423edt55436grd');

INSERT INTO bankingApp.reciept VALUES (DEFAULT,DEFAULT,'+1000',CURRENT_DATE);
