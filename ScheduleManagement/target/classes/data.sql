-- ビル
INSERT INTO building VALUES(1001,'Aビル',3,120,1,0,1,0,1,0,1);
INSERT INTO building VALUES(1002,'Bビル',2,150,0,0,0,0,0,1,1);
INSERT INTO building VALUES(1003,'Cビル',2,60,0,0,0,0,0,1,1);
INSERT INTO building VALUES(1004,'Dビル',3,180,0,1,0,1,0,1,0);
INSERT INTO building VALUES(1005,'Eビル',4,30,1,0,1,0,1,0,0);
INSERT INTO building VALUES(1006,'Fビル',2,1200,1,1,1,1,1,1,1);

-- 従業員
INSERT INTO employee VALUES(1001,1001,'Aさん',10,0,0,0,0,0,0,0,'8160000','福岡市早良区百道浜1-1-1','0928411000','seinan@edu.cc.jp');
INSERT INTO employee VALUES(1002,1002,'Bさん',15,0,0,0,0,0,0,0,'8160020','福岡市西区愛宕浜1-1-1','0928411000','atago@edu.cc.jp');
INSERT INTO employee VALUES(1003,1003,'Cさん',20,0,0,0,0,0,0,0,'8160001','福岡市南区大橋1-1-1','0928419999','oohashi@edu.cc.jp');
INSERT INTO employee VALUES(1004,1004,'D',25,0,0,0,0,0,0,0,'8160002','福岡市中央区天神1-1-1','0928419999','tenjiin@edu.cc.jp');
INSERT INTO employee VALUES(1005,1005,'Eさん',15,0,0,0,0,0,0,0,'8160003','福岡市東区香椎1-1-1','0928419899','dddd@edu.cc.jp');

-- 勤務
INSERT INTO work VALUES(1,1001,1001,'2020-06-01');
INSERT INTO work VALUES(2,1002,1002,'2020-06-15');
INSERT INTO work VALUES(3,1003,1003,'2020-06-17');
INSERT INTO work VALUES(4,1004,1004,'2020-06-25');
