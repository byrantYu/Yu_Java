create table product(
	pid int primary key,
	pname varchar(20),
	price double,
	category_id varchar(32)
);


INSERT INTO product(pid,pname,price,category_id) VALUES(1,'IBM',5500,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES(2,'长城',3200,'c001');
INSERT INTO product(pid,pname,price,category_id) VALUES(3,'惠普',5000,'c001');

INSERT INTO product(pid,pname,price,category_id) VALUES(4,'华为',3800,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(5,'小米',2000,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(6,'OPPO',3400,'c002');
INSERT INTO product(pid,pname,price,category_id) VALUES(7,'NOKIA',2000,'c002');

INSERT INTO product(pid,pname,price,category_id) VALUES(8,'佰草集',800,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(9,'玉兰油',200,'c003');
INSERT INTO product(pid,pname,price,category_id) VALUES(10,'大宝',5,'c003');
