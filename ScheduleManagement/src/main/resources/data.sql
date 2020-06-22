delete from work;
delete from employee;
delete from building;

-- ビル
INSERT INTO building VALUES(1001,'Aビル',2,120,1,0,1,0,1,0,0);
INSERT INTO building VALUES(1002,'Bビル',2,150,0,1,0,1,0,0,0);
INSERT INTO building VALUES(1003,'Cビル',2,60,0,0,0,0,0,1,1);

-- 従業員
INSERT INTO employee VALUES(1001,1001,'Aさん',30,1,0,1,0,1,0,0);
INSERT INTO employee VALUES(1002,1002,'Bさん',30,0,1,0,1,0,0,0);
INSERT INTO employee VALUES(1003,1003,'Cさん',30,0,0,0,0,0,1,1);
INSERT INTO employee VALUES(1004,1003,'Dさん',30,0,0,0,0,0,1,1);
INSERT INTO employee VALUES(1005,1001,'Eさん',30,1,0,1,0,1,0,0);
INSERT INTO employee VALUES(1006,1002,'Fさん',30,0,1,0,0,1,0,0);
INSERT INTO employee VALUES(1007,1001,'Gさん',10,1,1,1,1,1,1,1);


-- 勤務
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,1,1,'2020-06-01');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,1,3,'2020-06-03');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,2,1,5,'2020-06-05');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,2,1,'2020-06-08');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,2,3,'2020-06-10');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,2,2,5,'2020-06-12');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,3,1,'2020-06-15');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,3,3,'2020-06-17');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,2,3,5,'2020-06-19');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,4,1,'2020-06-22');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,4,3,'2020-06-24');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,2,4,5,'2020-06-26');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,5,1,'2020-06-29');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,1,1,1,'2020-06-01');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,1,3,'2020-06-03');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,1,5,'2020-06-05');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,1,2,1,'2020-06-08');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,2,3,'2020-06-10');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,2,5,'2020-06-12');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,1,3,1,'2020-06-15');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,3,3,'2020-06-17');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,3,5,'2020-06-19');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,1,4,1,'2020-06-22');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,4,3,'2020-06-24');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,4,5,'2020-06-26');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1007,1,5,1,'2020-06-29');

insert into desire values(1001,2,'2020-07-27',1001,'2020-07-12');
insert into desire values(1001,1,'2020-06-29',1007,'2020-06-11');






--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,2,4,0,'2020-06-28');
--
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,4,0,'2020-06-28');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1002,1010,1,5,1,'2020-06-29');
--
--
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,4,0,'2020-06-28');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1003,1010,1,5,1,'2020-06-29');
--
--
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,4,0,'2020-06-28');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1004,1010,1,5,1,'2020-06-29');
--
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,4,0,'2020-06-28');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1005,1010,1,5,1,'2020-06-29');
--
--
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,2,'2020-06-02');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,4,'2020-06-04');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,6,'2020-06-06');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,0,'2020-06-07');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,2,'2020-06-09');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,4,'2020-06-11');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,6,'2020-06-13');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,2,0,'2020-06-14');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,2,'2020-06-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,4,'2020-06-18');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,6,'2020-06-20');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,3,0,'2020-06-21');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,2,'2020-06-23');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,4,'2020-06-25');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,6,'2020-06-27');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,4,0,'2020-06-28');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,5,1,'2020-06-29');

--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,3,'2020-07-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1006,1010,1,1,1,'2020-07-01');

--DESIREテーブル追加
--INSERT INTO desire VALUES (47,'2020-07-14');
--INSERT INTO desire VALUES (53,'2020-07-14');
--INSERT INTO desire VALUES (58,'2020-07-14');


--INSERT INTO work VALUES(2,1001,1012,1,1,2,'2020-05-05');
--INSERT INTO work VALUES(3,1001,1012,1,2,0,'2020-05-10');
--INSERT INTO work VALUES(4,1001,1012,1,3,3,'2020-05-15');
--INSERT INTO work VALUES(5,1001,1012,1,3,5,'2020-05-20');
--INSERT INTO work VALUES(6,1001,1012,1,4,3,'2020-05-25');
--INSERT INTO work VALUES(7,1004,1012,1,5,1,'2020-05-30');

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
