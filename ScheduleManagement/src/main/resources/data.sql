-- ビル
INSERT INTO building VALUES(2001,'Aビル',3,120,true,false,true,false,true,false,true,8120000,'福岡市博多区本町1-1',092111111,'aa@co.jp');
INSERT INTO building VALUES(2002,'Bビル',2,150,false,false,false,false,false,true,true,8120001,'福岡市博多区本町1-2',092222222,'bb@co.jp');
INSERT INTO building VALUES(2003,'Cビル',2,60,false,false,false,false,false,true,true,8120002,'福岡市博多区本町1-3',092333333,'cc@co.jp');
INSERT INTO building VALUES(2004,'Dビル',3,180,false,true,false,true,false,true,false,8120003,'福岡市博多区本町1-4',092444444,'dd@co.jp');
INSERT INTO building VALUES(2005,'Eビル',4,30,true,false,true,false,true,false,false,8120004,'福岡市博多区本町1-5',092555555,'ee@co.jp');
INSERT INTO building VALUES(2006,'Fビル',2,1200,true,true,true,true,true,true,true,8120005,'福岡市博多区本町1-6',092666666,'ff@co.jp');

-- 従業員
INSERT INTO employee VALUES(1001,2001,'Aさん',10,false,false,false,false,false,false,false);
INSERT INTO employee VALUES(1002,2002,'Bさん',15,false,false,false,false,false,false,false);
INSERT INTO employee VALUES(1003,2003,'Cさん',20,false,false,false,false,false,false,false);
INSERT INTO employee VALUES(1004,2004,'Dさん',25,false,false,false,false,false,false,false);
INSERT INTO employee VALUES(1005,2005,'Eさん',5,false,false,false,false,false,false,false);

-- 勤務
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,1,1,'2020-06-01');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,1,3,'2020-06-03');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,1,5,'2020-06-05');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,2,2,1,'2020-06-08');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,2,3,'2020-06-10');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,2,5,'2020-06-12');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,3,1,'2020-06-15');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,3,3,'2020-06-17');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,2,3,5,'2020-06-19');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,4,1,'2020-06-22');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,4,3,'2020-06-24');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,4,5,'2020-06-26');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,5,1,'2020-06-29');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,1,1,'2020-06-01');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,1,3,'2020-06-03');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,1,5,'2020-06-05');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,1,2,1,'2020-06-08');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,1,2,3,'2020-06-10');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,2,5,'2020-06-12');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,3,1,'2020-06-15');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,3,3,'2020-06-17');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,1,3,5,'2020-06-19');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,1,4,1,'2020-06-22');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,4,3,'2020-06-24');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,4,5,'2020-06-26');
INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,5,1,'2020-06-29');

--カレンダー用テーブル
INSERT INTO calendar VALUES()