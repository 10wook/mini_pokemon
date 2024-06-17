DROP TABLE Product;
CREATE table Product(
product_id int AUTO_INCREMENT PRIMARY KEY,
product_kind varchar(10) not null,
product_name varchar(10) not null,
product_stock int ,
product_price int not null,
product_image char);

INSERT into Product
VALUES
(1 ,'인형','피카츄인형', 5 , 32000 , ' '),
(2 ,'인형','파이리인형', 3 , 30000 , ' '),
(3 , '인형', '마휘핑인형' , 5, 30000, ' '),
(4 , '인형', '꼬부기인형', 10, 30000, ' '),
(5 , '피규어', '마휘핑피규어', 10, 32000, ' '),
(6 , '피규어', '피카츄피규어', 10, 32000, ' '),
(7 , '피규어' , '리자몽피규어', 4, 30000, ' '),
(8 , '피규어', '뮤츠피규어', 4 , 35000, ' '),
(10, '뱃지', '꼬지모뱃지', 3 , 8000, ' '),
(11, '뱃지', '피카츄뱃지', 3 , 8000, ' '),
(12, '뱃지', '레쿠쟈뱃지', 5 , 10000, ' '),
(13, '뱃지' , '뮤뱃지', 4, 10000, ' ');