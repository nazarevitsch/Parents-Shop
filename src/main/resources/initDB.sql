drop table if exists categories;
create table categories(
                           id serial primary key,
                           name varchar(100)
);

drop table if exists products;
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

drop table if exists images;
create table images(
                       id serial primary key,
                       product_id int,
                       image_name varchar(100)
);

-- drop table if exists products_option;
-- create table products_option(
--                                 id serial primary key,
--                                 size varchar(5),
--                                 color_name varchar(20),
--                                 color_number varchar(20),
--                                 product_id int
-- );

drop table if exists sizes;
create table sizes(
                      id serial primary key,
                      product_id int,
                      size varchar(6)
);

drop table if exists colors;
create table colors(
                       id serial primary key,
                       product_id int,
                       color_name varchar(20),
                       color_number varchar(20)
);

drop table if exists orders;
create table orders(
                       id serial primary key,
                       name varchar(30),
                       phone_number varchar(15),
                       city varchar(30),
                       new_post_number int
);