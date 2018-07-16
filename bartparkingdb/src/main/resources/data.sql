insert into consumer values(null,'User1','test1@gmail.com','test1');
insert into consumer values(null,'User2','test2@gmail.com','test2');
insert into consumer values(null,'User3','test3@gmail.com','test3');

insert into parkinglot values(null,'Fremont',SYSDATE());
insert into parkinglot values(null,'Union City',SYSDATE());
insert into parkinglot values(null,'Hayward',SYSDATE());

INSERT INTO parkingslot VALUES (null,1,false,null,1);
INSERT INTO parkingslot VALUES (null,2,false,null,1);
INSERT INTO parkingslot VALUES (null,3,false,null,1);

INSERT INTO parkingslot VALUES (null,1,false,null,2);
INSERT INTO parkingslot VALUES (null,2,false,null,2);
INSERT INTO parkingslot VALUES (null,3,false,null,2);

INSERT INTO parkingslot VALUES (null,1,false,null,3);
INSERT INTO parkingslot VALUES (null,2,false,null,3);
INSERT INTO parkingslot VALUES (null,3,false,null,3);