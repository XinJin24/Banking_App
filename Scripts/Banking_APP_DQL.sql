select * from bankingapp.cardinfo c ;


select * from bankingapp.customerinfo;

select c.customer_name, c2.card_id from bankingapp.customerinfo c 
left join bankingapp.cardinfo c2 on c.customer_id =c2.customer_id ;

select c.customer_id as id, c.customer_name as name from bankingapp.customerinfo c 
union select c2.customer_id , c2.card_balance from bankingapp.cardinfo c2 ;

select avg(card_balance) from bankingapp.cardinfo c ;