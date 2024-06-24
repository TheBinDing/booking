# CREATE TABLE public.booking (
# 	book_id varchar NOT NULL,
# 	book_number varchar NULL,
# 	book_qty int4 NULL,
# 	"book_period time" varchar NULL,
# 	book_status bool NULL,
# 	create_date date NULL,
# 	create_by varchar NULL,
# 	update_date date NULL,
# 	update_by varchar NULL,
# 	CONSTRAINT booking_pk PRIMARY KEY (book_id)
# );

# CREATE TABLE public.customer (
# 	cus_code varchar NOT NULL,
# 	cus_name varchar NULL,
# 	cus_lname varchar NULL,
# 	age int4 NULL,
# 	birthday varchar NULL,
# 	create_date date DEFAULT now() NOT NULL,
# 	create_by varchar NOT NULL,
# 	update_date date DEFAULT now() NOT NULL,
# 	update_by varchar NOT NULL,
# 	CONSTRAINT customer_pk PRIMARY KEY (cus_code)
# );

# CREATE TABLE public.dining_table (
# 	din_code varchar NOT NULL,
# 	din_position varchar NOT NULL,
# 	total int4 NOT NULL,
# 	qty int4 NOT NULL,
# 	status varchar NOT NULL,
# 	create_date date NULL,
# 	create_by varchar NULL,
# 	update_date date NULL,
# 	update_by varchar NULL,
# 	CONSTRAINT dining_table_pk PRIMARY KEY (din_code)
# );