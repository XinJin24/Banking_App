
DROP SCHEMA IF EXISTS bankingapp cascade;
create schema bankingApp;

create table bankingApp.employeeinfo (
		employee_id INTEGER primary key,
		employee_Name VARCHAR(200)
);

CREATE TABLE bankingApp.customerinfo (
		customer_id INTEGER primary key ,
		customer_name VARCHAR(200) check(length(customer_name)>1),
		customer_age VARCHAR(200),
		customer_card INTEGER foreign key references cardinfo(card_id)
		
);

create table bankingApp.cardinfo (
		card_id INTEGER primary key,
		customer_id INTEGER foreign key references bankingApp.customerInfo(customer_id),
		customer_name VARCHAR(200) check(length(customer_name)>1),
		customer_age INTEGER,
		customer_balance DECIMAL
);


create table bankingApp.reciept (
		reciept_id INTEGER unique primary key,
		customer_id INTEGER foreign KEY references bankingApp.customerInfo(customer_id),
		changing_amount decimal,
		receipt_date date
);







--
--INSERT INTO bankingApp.customerInfo VALUES (DEFAULT,'John','30',00000001);
--INSERT INTO bankingApp.customerInfo VALUES (DEFAULT,'Ann','19',00000003);
--INSERT INTO bankingApp.customerInfo VALUES (DEFAULT,'jason','25',00000002);
--INSERT INTO bankingApp.customerInfo VALUES (DEFAULT,'Su','61',00000004);
--
--INSERT INTO bankingApp.cardInfo VALUES (DEFAULT,00000001,'John','61',32323.212);