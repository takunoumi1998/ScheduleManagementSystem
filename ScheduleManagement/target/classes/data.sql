--delete from desire;
--delete from work;
--delete from employee;
delete from building;

--sample
--insert into building values (1100,'Aビル',1,120,0,0,0,1,0,1,1,'郵便番号','住所','電話番号','メールアドレス','09:00','11:00');
INSERT INTO employee VALUES(1000,'サンプル','サンプルさん',10,0,0,0,0,0,0,0,'8160000','福岡市早良区百道浜1-1-1','0928411000','seinan@edu.cc.jp','毎月第4月曜日はだめ','$2a$10$NsqIwdjOXUeErn1scAVnjuaz3gszcRETtcisaUKzhOLKELCJbzvHu','ROLE_ADMIN');
--INSERT INTO work values(1100,1100,1,1,6,'2020-8-1');

-- ビル
--INSERT INTO building VALUES(1001,'Aビル',3,120,1,0,1,0,1,0,0,'8120000','福岡市博多区本町1-1','092-111-111','aa@co.jp','09:00','11:00','毎週月曜日');
--INSERT INTO building VALUES(1002,'Bビル',2,150,0,1,0,1,0,0,0,'8120001','福岡市博多区本町1-2','092-222-222','bb@co.jp','11:30','14:00','毎週月曜日');
--INSERT INTO building VALUES(1003,'Cビル',2,60,0,0,0,0,0,1,1,'8120002','福岡市博多区本町1-3','092-333-333','cc@co.jp','20:00','21:00','毎週月曜日');
--INSERT INTO building VALUES(1004,'Dビル',3,180,0,1,0,1,0,1,0,'8120003','福岡市博多区本町1-4','092-444-444','dd@co.jp','12:00','15:00','毎週月曜日');
--INSERT INTO building VALUES(1005,'Eビル',4,30,1,0,1,0,1,0,0,'8120004','福岡市博多区本町1-5','092-555-555','ee@co.jp','12:00','12:30','毎週月曜日');
INSERT INTO building VALUES(1006,'Fビル',2,1200,1,1,1,1,1,1,1,'8120005','福岡市博多区本町1-6','092-666-666','ff@co.jp','11:00','23:00','毎週月曜日のみ可');

-- 従業員
--INSERT INTO employee VALUES(1001,'Aさん','明石家さんま',10,0,0,0,0,0,0,0,'8160000','福岡市早良区百道浜1-1-1','0928411000','seinan@edu.cc.jp','毎月第4月曜日はだめ');
--INSERT INTO employee VALUES(1002,'Bさん','中尾彬',15,0,0,0,0,0,0,0,'8160020','福岡市西区愛宕浜1-1-1','0928411000','atago@edu.cc.jp','毎月第4月曜日はだめ');
--INSERT INTO employee VALUES(1003,'Cさん','石原さとみ',20,0,0,0,0,0,0,0,'8160001','福岡市南区大橋1-1-1','0928419999','oohashi@edu.cc.jp','毎月第4月曜日はだめ');
--INSERT INTO employee VALUES(1004,'Dくん','Dくん',25,0,0,0,0,0,0,0,'8160002','福岡市中央区天神1-1-1','0928419999','tenjiin@edu.cc.jp','毎月第4火曜日はだめ');
--INSERT INTO employee VALUES(1005,'Eさん','太郎ちゃん',15,0,0,0,0,0,0,0,'8160003','福岡市東区香椎1-1-1','0928419899','dddd@edu.cc.jp','毎週金曜日は3時まで');


-- 勤務
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,1,1,'2020-07-16');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,2,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,2,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,2,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,2,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,2,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,2,5,1,'2020-06-29');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,1,1,'2020-06-01');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,1,3,'2020-06-03');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,1,5,'2020-06-05');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,1,2,1,'2020-06-08');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,1,2,3,'2020-06-10');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,2,5,'2020-06-12');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,3,1,'2020-06-15');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,3,3,'2020-06-17');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1002,1,3,5,'2020-06-19');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1003,1,4,1,'2020-06-22');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1004,1,4,3,'2020-06-24');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1005,1,4,5,'2020-06-26');
--INSERT INTO work(building_id,employee_id,work_number,work_week,work_day,work_date) VALUES(1001,1001,1,5,1,'2020-06-29');
--
--insert into desire values(1001,2,'2020-07-27',1001,'2020-07-12');
--insert into desire values(1001,1,'2020-06-29',1001,'2020-06-11');






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

--CREATE TABLE IF NOT EXISTS work(
--	building_id INT ,
--	employee_id INT ,
--	work_number INT ,
--	work_week INT ,
--	work_day INT ,
--	work_date DATE ,
--	PRIMARY KEY(building_id,work_number,work_date),
--	FOREIGN KEY (building_id) REFERENCES building(building_id),
--	FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
--);
