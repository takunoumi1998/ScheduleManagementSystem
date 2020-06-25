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
	building_sunday BOOLEAN,
	building_ad_number INT,
	building_address VARCHAR(100),
	building_phone_address INT,
	building_mail VARCHAR(100)
);

CREATE TABLE IF NOT EXISTS employee (
employee_id int,
building_id int,
employee_name varchar(256),
desire_days int,
employee_monday boolean,
employee_tuesday boolean,
employee_wednesday boolean,
employee_thursday boolean,
employee_friday boolean,
employee_saturday boolean,
employee_sunday boolean,
PRIMARY KEY(employee_id),
FOREIGN KEY(building_id) REFERENCES building(building_id)
);

CREATE TABLE IF NOT EXISTS work(
	work_id INT PRIMARY KEY,
	building_id INT ,
	employee_id INT ,
	work_day DATE ,
	FOREIGN KEY (building_id) REFERENCES building(building_id),
	FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);
