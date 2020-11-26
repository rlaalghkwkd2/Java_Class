--13_트랜잭션.sql

/* 

	- 트랜잭션 (Transaction)
	- 데이터 처리의 한 단위
	- 하나의 논리적인 작업을 처리하기 위한 여러 쿼리문
	- 송금 트랜잭션:
		1. 보내는 사람의 통장에서 돈이 줄어듬
		2. 받는 사람의 통장에서 돈이 늘어남
	- 명령어의 집합인 트랜잭션이 정상적으로 처리되는 경우에만 모두 처리하도록 함
	- ALL OR NOTHING
	- COMMIT, ROLLBACK, SAVEPOINT (트랜잭션 관리 명령어)를 이용해 데이터를 안정적으로 복구
	- 트랜잭션: 마지막으로 실행된 커밋/롤백 이후부터 새로운 커밋/롤백을 실행하는 시점까지 수행된 모든 "DML"

	COMMIT -> UPDATE -> INSERT -> DELETE -> COMMIT(OR ROLLBACK)
		   [            TRANSACTION            ]


*/

SELECT * FROM emp;

COMMIT;

UPDATE emp SET salary = 100; --> TRANSACTION

-- CREATE TABLE fruits ( fruit_name VARCHAR2(30) ); 

	-- ※ CREATE TABLE 은 DML이 아니므로 트랜잭션이 아님. only DML만
	-> 트랜잭션 도중에 DDL문을 사용하면 자동으로 커밋이 되기 때문에 주의해야 함!
	--> DDL문이 들어가면 자동 커밋. 롤백 안됨.

ROLLBACK;


-- SAVEPOINT 를 이용한 트랜잭션 관리

COMMIT;

UPDATE emp SET salary = 200;
SAVEPOINT save01;

UPDATE emp SET salary = 300;
SAVEPOINT save02;

UPDATE emp SET salary = 400;
SAVEPOINT save03;

ROLLBACK;
ROLLBACK TO save02; -- 먼저 생성된 SAVEPOINT 로만 돌아갈 수 있음

SELECT * FROM user_constraints WHERE table_name = 'EMPLOYEES';

SELECT
    *
FROM tab;

SELECT
    *
FROM coffees;

SELECT
    *
FROM sequn


























