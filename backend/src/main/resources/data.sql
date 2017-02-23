--SQL inserts for database

--SYSTEM MANAGER--
insert into system_manager(id/*, email*/, password) values (1/*, 'admin@admin.com'*/, 'admin');
--RESTAURANT--
insert into restaurant(id, open_hour, close_hour) values (1, 7, 23);
insert into restaurant(id, open_hour, close_hour) values (2, 8, 24);
--RESTAURANT MANAGER--
insert into restaurant_manager(id, restaurant_id, email, password, name) values (1, 1, 'manager1@manager.com', 'password', 'Managers Name1');
insert into restaurant_manager(id, restaurant_id, email, password, name) values (2, 1, 'manager2@manager.com', 'password', 'Managers Name2');
--SHIFT--
insert into shift(id, name, restaurant_id, begin_hour, end_hour) values (1, 'Morning shift', 1, 7, 15);
insert into shift(id, name, restaurant_id, begin_hour, end_hour) values (2, 'Afternoon shift', 1, 15, 23);
--COOK--
insert into cook(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id, food_type) values (3, 'cook1@cook.com', 'Cook1', 'password', 7.00, 1, 1, 0);
insert into cook(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id, food_type) values (4, 'cook2@cook.com', 'Cook2', 'password', 6.50, 1, 1, 1);
--BARTENDER--
insert into bartender(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id) values (5, 'bartender1@bartender.com', 'Bartender1', 'password', 5.00, 1, 1);
insert into bartender(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id) values (6, 'bartender2@bartender.com', 'Bartender2', 'password', 5.00, 1, 1);
--WAITER--
insert into waiter(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id) values (7, 'waiter1@waiter.com', 'Waiter1', 'password', 8.00, 1, 1);
insert into waiter(id, email, name, password, hourly_pay_rate, restaurant_id, shift_id) values (8, 'waiter2@waiter.com', 'Waiter2', 'password', 8.00, 1, 2);
--SUPPLIER--
insert into supplier(id, email, name, password, restaurant_id) values (9, 'supplier1@supplier.com', 'Supplier1', 'password', 1);
insert into supplier(id, email, name, password, restaurant_id) values (10, 'supplier2@supplier.com', 'Supplier2', 'password', 1);
--GUEST--
insert into tbl_guest(id, email, name, password) values (11, 'guest1@guest.com', 'Guest1', 'password');
insert into tbl_guest(id, email, name, password) values (12, 'guest2@guest.com', 'Guest2', 'password');
insert into tbl_guest(id, email, name, password) values (13, 'guest3@guest.com', 'Guest3', 'password');
insert into tbl_guest(id, email, name, password) values (14, 'guest4@guest.com', 'Guest4', 'password');
--DRINK--
insert into tbl_drink(id, name, price, restaurant_id) values (1, 'Drink1', 10.00, 1);
insert into tbl_drink(id, name, price, restaurant_id) values (2, 'Drink2', 20.00, 1);
--FOOD--
insert into tbl_food(id, name, price, food_type, restaurant_id) values (3, 'Food1', 30.00, 1, 1);
insert into tbl_food(id, name, price, food_type, restaurant_id) values (4, 'Food2', 40.00, 2, 1);
insert into tbl_food(id, name, price, food_type, restaurant_id) values (5, 'Food3', 50.00, 3, 1);
--POSITION--
insert into table_position(id, row, col, restaurant_id) values (1, 1, 1, 1);
insert into table_position(id, row, col, restaurant_id) values (2, 1, 2, 1);
insert into table_position(id, row, col, restaurant_id) values (3, 1, 3, 1);
insert into table_position(id, row, col, restaurant_id) values (4, 2, 1, 1);
insert into table_position(id, row, col, restaurant_id) values (5, 2, 2, 1);
insert into table_position(id, row, col, restaurant_id) values (6, 2, 3, 1);
--REON--
insert into reon(id, description, name, restaurant_id) values (1/*id*/, 'Description Text1', 'Reon1', 1/*restaurant_id*/);
insert into reon(id, description, name, restaurant_id) values (2/*id*/, 'Description Text2', 'Reon2', 1/*restaurant_id*/);
insert into reon(id, description, name, restaurant_id) values (3/*id*/, 'Description Text3', 'Reon3', 1/*restaurant_id*/);
--RESTAURANT TABLE--
insert into restaurant_table(id, max_seats, number, position_id, status, reon_id, restaurant_id, waiter_id) values (1/*id*/, 4/*seats*/, 1/*number*/, 1/*position*/, 0/*status(aviable)*/, 1/*reon*/, 1/*restaurant*/, 7/*waiter*/);
insert into restaurant_table(id, max_seats, number, position_id, status, reon_id, restaurant_id, waiter_id) values (2/*id*/, 4/*seats*/, 2/*number*/, 2/*position*/, 0/*status(aviable)*/, 1/*reon*/, 1/*restaurant*/, 7/*waiter*/);
insert into restaurant_table(id, max_seats, number, position_id, status, reon_id, restaurant_id, waiter_id) values (3/*id*/, 8/*seats*/, 3/*number*/, 4/*position*/, 0/*status(aviable)*/, 2/*reon*/, 1/*restaurant*/, 7/*waiter*/);
insert into restaurant_table(id, max_seats, number, position_id, status, reon_id, restaurant_id, waiter_id) values (4/*id*/, 4/*seats*/, 4/*number*/, 3/*position*/, 2/*status(not_in_use)*/,1/*reon*/, 1/*restaurant*/, NULL);
--RATING RESTAURANT--
insert into rating_restaurant(id, rate, rating_date, guest_id, restaurant_id) values (1/*id*/, 4/*exellent*/,  '2017-02-17 10:00:00'/*date-time*/, 11/*guest*/, 1/*restaurant*/);
insert into rating_restaurant(id, rate, rating_date, guest_id, restaurant_id) values (2/*id*/, 4/*exellent*/,  '2017-02-17 10:30:00'/*date-time*/, 12/*guest*/, 1/*restaurant*/);
--RATING MENU ITEM--
insert into rating_menu_item(id, rate, rating_date, guest_id, menu_item_id) values (3/*id*/, 4/*exellent*/,  '2017-02-17 14:00:00'/*date-time*/, 11/*guest*/, 2/*menu item*/);
insert into rating_menu_item(id, rate, rating_date, guest_id, menu_item_id) values (4/*id*/, 3/*exellent*/,  '2017-02-17 11:00:00'/*date-time*/, 11/*guest*/, 4/*menu item*/);
--RATING EMPLOYEE-
insert into rating_employee(id, rate, rating_date, guest_id, employee_id) values (5/*id*/, 4/*exellent*/,  '2017-02-17 15:00:00'/*date-time*/, 11/*guest*/, 7/*waiter*/);
insert into rating_employee(id, rate, rating_date, guest_id, employee_id) values (6/*id*/, 3/*exellent*/,  '2017-02-17 16:00:00'/*date-time*/, 12/*guest*/, 7/*waiter*/);
--INGREDIENT--
insert into ingredient(id, name, stock_level, unit) values (1/*id*/, 'Ingredient1',  0/*stock_level(low)*/, 0/*unit(kg)*/);
insert into ingredient(id, name, stock_level, unit) values (2/*id*/, 'Ingredient2',  1/*stock_level(medium)*/, 1/*unit(piece)*/);
insert into ingredient(id, name, stock_level, unit) values (3/*id*/, 'Ingredient3',  2/*stock_level(high)*/, 4/*unit(package)*/);
--RESERVATION--
insert into reservation(id, canceled, reservation_begin, reservation_end, reservation_expire, guest_id, restaurant_id, restaurant_table_id)
	values (1/*id*/, 0/*not_canceled*/, '2017-02-17 08:00:00'/*start*/, '2017-02-17 09:00:00'/*end(bill time)*/, '2017-02-17 10:00:00'/*expire*/, 11/*guest*/, 1/*restaurant*/, 1/*table*/);
insert into reservation(id, canceled, reservation_begin, reservation_end, reservation_expire, guest_id, restaurant_id, restaurant_table_id) 
	values (2/*id*/, 0/*not_canceled*/, '2017-02-17 10:30:00'/*start*/, '2017-02-17 12:00:00'/*end(bill time)*/, '2017-02-17 12:30:00'/*expire*/, 11/*guest*/, 1/*restaurant*/, 2/*table*/);
--ORDER ITEM--
insert into order_item(id, order_status, ready_time, guest_id, menu_item_id, restaurant_id, restaurant_table_id, waiter_id)
	values (1, 4/*paid*/, '2017-02-17 08:00:00', 11/*guest*/, 2/*menu_item(drink)*/, 1/*restaurant*/, 1/*table*/, 7/*waiter*/);
insert into order_item(id, order_status, ready_time, guest_id, menu_item_id, restaurant_id, restaurant_table_id, waiter_id) 
	values (2, 4/*paid*/, '2017-02-17 08:00:00', 11/*guest*/, 4/*menu_item(food)*/, 1/*restaurant*/, 1/*table*/, 7/*waiter*/);
insert into order_item(id, order_status, ready_time, guest_id, menu_item_id, restaurant_id, restaurant_table_id, waiter_id) 
	values (3, 4/*paid*/, '2017-02-17 10:40:00', 11/*guest*/, 3/*menu_item(food)*/, 1/*restaurant*/, 2/*table*/, 7/*waiter*/);
--BILL--
insert into tbl_bill(id, creation_date, restaurant_id, total, restaurant_table_id, waiter_id) values (1, '2017-02-17 09:00:00', 1/*restaurant*/, 60.00/*total*/, 1/*table*/, 7/*waiter*/);
insert into tbl_bill(id, creation_date, restaurant_id, total, restaurant_table_id, waiter_id) values (2, '2017-02-17 12:00:00', 1/*restaurant*/, 30.00/*total*/, 2/*table*/, 7/*waiter*/);
--OFFER ITEM--
insert into offer_item(id, count, offer_status, price_per_unit, ingredient_id, restaurant_id, supplier_id)
	values (1/*id*/, 5/*five kg*/, 2/*status(await)*/, 15.00/*price per unit*/, 1/*ingredient*/, 1/*restaurant_id*/, 9/*supplier*/);
insert into offer_item(id, count, offer_status, price_per_unit, ingredient_id, restaurant_id, supplier_id) 
	values (2/*id*/, 100/*pieces*/, 2/*status(await)*/, 3.00/*price per unit*/, 2/*ingredient*/, 1/*restaurant_id*/, 9/*supplier*/);
insert into offer_item(id, count, offer_status, price_per_unit, ingredient_id, restaurant_id, supplier_id)
	values (3/*id*/, 10/*10 kg*/, 2/*status(await)*/, 14.00/*price per unit*/, 1/*ingredient*/, 1/*restaurant_id*/, 10/*supplier*/);
--DEMAND ITEM--
insert into demand_item(id, count, ingredient_id, restaurant_id, demand_end) values (1/*id*/, 20/*units*/, 1/*ingredient_id*/, 1/*restaurant_id*/, '2017-02-20 00:00:00'/*end time*/);
insert into demand_item(id, count, ingredient_id, restaurant_id, demand_end) values (2/*id*/, 200/*units*/, 2/*ingredient_id*/, 1/*restaurant_id*/, '2017-02-25 00:00:00'/*end time*/);

------JOINS------
--BILL MENU ITEMS--
insert into tbl_bill_menu_items(bill_id, menu_items_id) values (1/*bill_id*/, 2/*menu_item_id*/);
insert into tbl_bill_menu_items(bill_id, menu_items_id) values (1/*bill_id*/, 4/*menu_item_id*/);
insert into tbl_bill_menu_items(bill_id, menu_items_id) values (2/*bill_id*/, 3/*menu_item_id*/);
--MENU ITEM RATINGS--
insert into menu_item_ratings(menu_item_id, ratings_id) values (2/*menu_item_id*/, 3/*rating_id*/);
insert into menu_item_ratings(menu_item_id, ratings_id) values (4/*menu_item_id*/, 4/*rating_id*/);
--RESTAURANT RATING--
insert into restaurant_ratings(restaurant_id, ratings_id) values (1/*restaurant_id*/, 1/*rating_id*/);
insert into restaurant_ratings(restaurant_id, ratings_id) values (1/*restaurant_id*/, 2/*rating_id*/);
--EMPLOYEE RATING--
insert into employee_ratings(employee_id, ratings_id) values (7/*employee_id*/, 5/*rating_id*/);
insert into employee_ratings(employee_id, ratings_id) values (7/*employee_id*/, 6/*rating_id*/);
--RESTAURANT INGREDIENTS--
insert into restaurant_ingredients(restaurant_id, ingredients_id) values (1/*restaurant_id*/, 1/*ingredient_id*/);
insert into restaurant_ingredients(restaurant_id, ingredients_id) values (1/*restaurant_id*/, 2/*ingredient_id*/);
insert into restaurant_ingredients(restaurant_id, ingredients_id) values (1/*restaurant_id*/, 3/*ingredient_id*/);
--RESTAURANT MENU--
insert into restaurant_menu(restaurant_id, menu_id) values (1/*restaurant_id*/, 1/*menu_id*/);
insert into restaurant_menu(restaurant_id, menu_id) values (1/*restaurant_id*/, 2/*menu_id*/);
insert into restaurant_menu(restaurant_id, menu_id) values (1/*restaurant_id*/, 3/*menu_id*/);
insert into restaurant_menu(restaurant_id, menu_id) values (1/*restaurant_id*/, 4/*menu_id*/);
insert into restaurant_menu(restaurant_id, menu_id) values (1/*restaurant_id*/, 5/*menu_id*/);
--RESERVATION ORDERS--
insert into reservation_orders(reservation_id, orders_id) values (1/*reservation_id*/, 1/*order_id*/);
insert into reservation_orders(reservation_id, orders_id) values (1/*reservation_id*/, 2/*order_id*/);
insert into reservation_orders(reservation_id, orders_id) values (2/*reservation_id*/, 3/*order_id*/);
--RESERVATION FRIENDS--
insert into reservation_friends(reservation_id, friends_id) values (1/*reservation_id*/, 12/*friend_id*/);
--INGREDIENT SUPPLIER--
insert into ingredient_supplier(ingredient_id, supplier_id) values (1/*ingredient_id*/, 9/*supplier_id*/);
insert into ingredient_supplier(ingredient_id, supplier_id) values (2/*ingredient_id*/, 9/*supplier_id*/);
insert into ingredient_supplier(ingredient_id, supplier_id) values (1/*ingredient_id*/, 10/*supplier_id*/);
insert into ingredient_supplier(ingredient_id, supplier_id) values (2/*ingredient_id*/, 10/*supplier_id*/);
--FRIENDS--
insert into tbl_friends(guest_id, friend_id) values (11, 13);
insert into tbl_friends(guest_id, friend_id) values (11, 12);
insert into tbl_friends(guest_id, friend_id) values (12, 13);