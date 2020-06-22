--DROP TABLE desire;
--DROP TABLE work;
--DROP TABLE employee;
--DROP TABLE building;

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

drop table desire;
CREATE TABLE IF NOT EXISTS desire(
	building_id INT ,
	work_number INT ,
	work_date DATE ,
	employee_id INT ,
	desire_date DATE ,
	PRIMARY KEY (building_id , work_number , work_date),
	FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
);

