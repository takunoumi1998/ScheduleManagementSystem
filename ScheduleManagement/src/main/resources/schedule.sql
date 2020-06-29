-- DROP TABLE work;
-- DROP TABLE employee;
-- DROP TABLE building;

CREATE TABLE IF NOT EXISTS building (
	building_id INT PRIMARY KEY,
	building_name VARCHAR(256) ,
	building_ninzu INT ,
	building_time INT ,
	building_monday BOOLEAN,
	building_tuesday BOOLEAN,
	building_wednesday BOOLEAN,
	building_thursday BOOLEAN,
	building_friday BOOLEAN,
	building_saturday BOOLEAN,
	building_sunday BOOLEAN,
	building_ad_number VARCHAR(256),
	building_address VARCHAR(256),
	building_phone_number VARCHAR(256),
	building_mail VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS employee (
employee_id INT,
employee_name varchar(256),
employee_adana varchar(256),
desire_days int,
employee_monday boolean,
employee_tuesday boolean,
employee_wednesday boolean,
employee_thursday boolean,
employee_friday boolean,
employee_saturday boolean,
employee_sunday boolean,
employee_ad_number varchar(256),
employee_address varchar(256),
employee_phone_number varchar(256),
employee_mail varchar(256),
employee_bikou varchar(256),
PRIMARY KEY(employee_id)
);

CREATE TABLE IF NOT EXISTS work(
	building_id INT ,
	employee_id INT ,
	work_number INT ,
	work_week INT ,
	work_day INT ,
	work_date DATE ,
	PRIMARY KEY(building_id,work_number,work_date),
	FOREIGN KEY (building_id) REFERENCES building(building_id),
	FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

CREATE TABLE IF NOT EXISTS calendar(
	building_name VARCHAR(256),
	building_time INT,
	employee_id INT,
	work_date DATE,
	FOREIGN KEY(building_name) REFERENCES building(building_name),
	FOREIGN KEY(building_time) REFERENCES building(building_time),
	FOREIGN KEY(employee_id) REFERENCES employee(employee_id),
	FOREIGN KEY(work_date) REFERENCES work(work_date)
);