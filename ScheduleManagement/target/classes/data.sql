-- ビル
INSERT INTO building VALUES(1001,'Aビル',3,120,1,0,1,0,1,0,1,'8120000','福岡市博多区本町1-1','092-111-111','aa@co.jp');
INSERT INTO building VALUES(1002,'Bビル',2,150,0,0,0,0,0,1,1,'8120001','福岡市博多区本町1-2','092-222-222','bb@co.jp');
INSERT INTO building VALUES(1003,'Cビル',2,60,0,0,0,0,0,1,1,'8120002','福岡市博多区本町1-3','092-333-333','cc@co.jp');
INSERT INTO building VALUES(1004,'Dビル',3,180,0,1,0,1,0,1,0,'8120003','福岡市博多区本町1-4','092-444-444','dd@co.jp');
INSERT INTO building VALUES(1005,'Eビル',4,30,1,0,1,0,1,0,0,'8120004','福岡市博多区本町1-5','092-555-555','ee@co.jp');
INSERT INTO building VALUES(1006,'Fビル',2,1200,1,1,1,1,1,1,1,'8120005','福岡市博多区本町1-6','092-666-666','ff@co.jp');

-- 従業員
INSERT INTO employee VALUES(1001,1001,'Aさん',10,0,0,0,0,0,0,0);
INSERT INTO employee VALUES(1002,1002,'Bさん',15,0,0,0,0,0,0,0);
INSERT INTO employee VALUES(1003,1003,'Cさん',20,0,0,0,0,0,0,0);
INSERT INTO employee VALUES(1004,1004,'Dさん',25,0,0,0,0,0,0,0);
INSERT INTO employee VALUES(1005,1005,'Eさん',5,0,0,0,0,0,0,0);

-- 勤務
INSERT INTO work VALUES(1001,1001,1001,'2020-06-01');
INSERT INTO work VALUES(1002,1002,1002,'2020-06-15');
INSERT INTO work VALUES(1003,1003,1003,'2020-06-17');
INSERT INTO work VALUES(1004,1004,1004,'2020-06-25');
