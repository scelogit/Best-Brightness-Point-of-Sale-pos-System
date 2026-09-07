create table Product(product_id int primary key,
                     product_Name varchar(50),
                     price double,
                     quantity int);

create table Sales (Sale_id int primary key,
                    Total double,
					Discount double,
                    Final_total double,
                    Sale_Date date);
                    

create table Sale_Items(item_id int primary key,
                        Sale_id int,
                        product_id int,
                        quantity int,
                        subtotatal double,
                        
                      FOREIGN KEY (Sale_id) REFERENCES Sales(Sale_id),
                      FOREIGN KEY (product_id) REFERENCES Product(product_id));
                      
insert into users(user_id, Username, Password)
            values( 101, 'Admin', 'admin123');
 
 insert into users(user_id, Username, Password,user)
             values( 102, 'Mayanda', 'manager123','Manager');
             
 insert into users(user_id, Username, Password,user)
             values( 103, 'Simi', 'cashier123','Cashier');
