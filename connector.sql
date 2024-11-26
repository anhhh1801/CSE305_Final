use project_cse305;

create table login (
	username varchar(25) not null primary key,
    password varchar(25) not null
);
insert into login 
values ('Anh123','123456'),
('Hieu123','123456');

create table user (
	username varchar(25) not null,
    fullname varchar(25),
    Date_of_birth date,
    job varchar(25),
    monthlyIncome float,
    constraint fk_username foreign key (username) references login(username)
);

insert into user
values ('Anh123','Đỗ Viết Anh','2003-01-18','Student','2000000'),
('Hieu123','Thái Phan Anh Hiểu','2004-05-19','Developer','10000000');

select * from login;

create table expenses (
	expense_id int unique not null primary key,
	username varchar(25) not null,
    date date,
    type_name varchar(25),
    amount float,
    description varchar(45),
    foreign key (username) references login(username),
    foreign key (type_name) references types(type_name) 
);

select * from expenses;


insert into expenses
values 
('2','Hieu123','2024-05-19','Shopping','10000', null);
select * from expenses;

create table types (
	type_name varchar(25) primary key
);

insert into types
values ('Food'),
('Shopping');

update expenses set amount = 15000, type_name = 'Food' where expense_id = 2;
update expenses set date = '2024-10-18' where expense_id = 1;
alter table expenses drop foreign key expenses_ibfk_2;