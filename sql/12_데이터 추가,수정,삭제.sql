-- 12_데이터 추가,수정,삭제.sql

/*
        #  INSERT : 테이블에 새로운 데이터 추가(생성)
            
            INSERT INTO 테이블명 (컬럼명,..) VALUES(값,...)
*/

rename  COFFEE_SHOP to coffees;

DESC  coffees;

-- # 가장 기본적인 데이터 추가
INSERT INTO  coffees(cfid, cname, cprice) VALUES (1, '아아스 아메리카노', 2000);
INSERT INTO  coffees(cname,cfid, cprice) VALUES ( '뜨거운 아메리카노', 2,2000);
SELECT * FROM coffees;

-- # 일부 컬럼에만 데이터 추가
INSERT INTO coffees (cname, cprice) VALUES ('아이스 카페라떼', 2500);
INSERT INTO coffees(cprice, cfid) VALUES(2500,4);

-- # 컬럼을 생략하면서 데이터 추가 (모든 컬럼에 순서대로 모든 값을 넣어야 함)
INSERT INTO coffees VALUES(5,'아이스 카페모카', 3000);  -- 중복되는 값이 생길 수 있다
INSERT INTO coffees VALUES(5,'아이스 카페모카', 3000);

-- # 서브 쿼리로 데이터 삽입하기
INSERT INTO coffees SELECT * FROM coffees;

/*
        # UPDATE : 테이블의 데이터를 수정
            - UPDATE 테이블명 SET 컬럼명 = 값, ... WHERE 수정할 행의 조건;
            - UPDATE 문에 조건을 입력하지 않으면 모든 행이 수정된다.
            - 조건을 만족하는 모든 행을 수정한다
            - 하나의 행을 구분할 수 있는 기본키와 함께 이용되는 경우가 대부분이다.
*/
SELECT * FROM coffees;

SELECT rownum, coffees.* from coffees where cprice = 3000; -- 첫 번쨰 행만 삭제하고싶을때에는 사용해봐도됨 rowid,rownum 등이 종류가있음
SELECT rownum, coffees.* from coffees ORDER BY cprice DESC; -- 요늠은 안됨 첫번째 값이라고 할 수 없음

UPDATE coffees SET cprice = cprice + 200 WHERE cfid = 2;
 
 --연습문제01 : employees 테이블의 구조만 복사하는 쿼리문을 이용하여 emp테이블을 생성
 CREATE TABLE emp AS SELECT * FROM employees where 1 =0;
 
 SELECT * FROM emp;
 --연습문제02 : emp테이블에 employees의 모든 사원들 중 홀수 사번을 가진 사원들만 추가 해보세요
INSERT INTO emp select * from employees where MOD (employee_id, 2)=1;
 
 --연습문제03 : emp테이블의 모든 사원들 중 JOB_ID에 MAN이 포함된 사원들의 월급을 40%삭감 해보세요
UPDATE emp SET salary = salary - (salary*0.4) WHERE job_id  LIKE '%MAN%';








 
 
