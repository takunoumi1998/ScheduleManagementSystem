DROP TABLE work;
DROP TABLE employee;
DROP TABLE building;

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
	building_sunday BOOLEAN
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
	work_id INT PRIMARY KEY,
	building_id INT ,
	employee_id INT ,
	work_day DATE ,
	FOREIGN KEY (building_id) REFERENCES building(building_id),
	FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);
