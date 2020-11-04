insert into Account values (123, 'UserOne', 'Savings', '2015-12-19', 'INR', 1000);
insert into Account values (124, 'UserTwo', 'Savings', '2014-11-23', 'INR', 1000);

insert into Transactions values (1000, 500, null, curdate(), 'CREDIT', 123);
insert into Transactions values (1001, 200, null, curdate(), 'CREDIT', 123);