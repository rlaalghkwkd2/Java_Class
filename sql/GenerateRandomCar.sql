-- GenerateRandomCar

                          
SELECT * FROM car;
DROP SEQUENCE car_num;
CREATE SEQUENCE cnum_seq  MINVALUE 1 MAXVALUE 100  CYCLE NOCACHE;

-- CREATE TABLE random_car_table (cid NUMBER(10) CONSTRAINT car_cnum_pk PRIMARY KEY,
                                    --        cname VARCHAR2(20) CONSTRAINT car_cname_nn NOT NULL,
                                      --      vnum VARCHAR2(20) CONSTRAINT car_vnum_nn NOT NULL
                                     --      );
CREATE TABLE random_car_table(
    car_plate VARCHAR2(12),
    car_type VARCHAR2(30),
    car_usage VARCHAR2(30)
);
SELECT * FROM user_constraints WHERE table_name = 'CAR';
DROP TABLE car;
DELETE FROM random_car_table;
COMMIT; 


SELECT * FROM random_car_table;
desc random_car_table;
SELECT * FROM coffees;
SELECT * FROM employees;



