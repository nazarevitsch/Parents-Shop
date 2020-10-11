drop table if exists categories cascade;
create table categories(
                           id serial primary key,
                           name varchar(100)
);

drop table if exists products cascade;
create table products(
                         id serial primary key,
                         category_id int,
                         name varchar(100),
                         price int,
                         price_wholesale int,
                         description text,
                         is_active bool,
                         main_image varchar(100)
);

drop table if exists images cascade;
create table images(
                       id serial primary key,
                       product_id int,
                       image_name varchar(100)
);

-- drop table if exists products_option cascade;
-- create table products_option(
--                                 id serial primary key,
--                                 size varchar(5),
--                                 color_name varchar(20),
--                                 color_number varchar(20),
--                                 product_id int
-- );

drop table if exists orders cascade;
create table orders(
                       id serial primary key,
                       name varchar(30),
                       phone_number varchar(15),
                       city varchar(30),
                       new_post_number int
);

drop table if exists sizes cascade;
create table sizes(
                      id serial primary key,
                      product_id int,
                      size varchar(6)
);

drop table if exists colors cascade;
create table colors(
                       id serial primary key,
                       product_id int,
                       color_name varchar(20),
                       color_number varchar(20)
);

insert into categories(name) values('Куртки');

-- select * from products;
insert into products(category_id, name, price, price_wholesale, description, is_active, main_image)
values (1,'Куртка 1', 1100, 1000, 'Good 1', true, '123.jpg'),
       (1,'Куртка 2', 1200, 1000, 'Good 2', true, '123.jpg'),
       (1,'Куртка 3', 1300, 1000, 'Good 3', true, '123.jpg');

insert into products(category_id, name, price, price_wholesale, description, is_active, main_image)
values (1,'Куртка 4', 1400, 1000, 'Good 1', true, '123.jpg');

-- select * from sizes;
insert into sizes(product_id, size)
values (1, 'S'), (1, 'M'), (1, 'L'),
       (2, 'S'), (2, 'M'), (2, 'L'),
       (3, 'S'), (3, 'M'), (3, 'L');

-- select * from colors;
insert into colors(product_id, color_name, color_number)
values (1, 'black', '#121212'),(1, 'red', '#BF3030'),
       (2, 'black', '#121212'),(2, 'red', '#BF3030'),
       (3, 'black', '#121212'),(3, 'red', '#BF3030');


-- select * from images;
insert into images(product_id, image_name)
values (1,'123.jpg'), (1,'123.jpg'), (1,'123.jpg');

select * from images;