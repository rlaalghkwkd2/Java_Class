--13_Ʈ�����.sql

/* 

	- Ʈ����� (Transaction)
	- ������ ó���� �� ����
	- �ϳ��� ������ �۾��� ó���ϱ� ���� ���� ������
	- �۱� Ʈ�����:
		1. ������ ����� ���忡�� ���� �پ��
		2. �޴� ����� ���忡�� ���� �þ
	- ��ɾ��� ������ Ʈ������� ���������� ó���Ǵ� ��쿡�� ��� ó���ϵ��� ��
	- ALL OR NOTHING
	- COMMIT, ROLLBACK, SAVEPOINT (Ʈ����� ���� ��ɾ�)�� �̿��� �����͸� ���������� ����
	- Ʈ�����: ���������� ����� Ŀ��/�ѹ� ���ĺ��� ���ο� Ŀ��/�ѹ��� �����ϴ� �������� ����� ��� "DML"

	COMMIT -> UPDATE -> INSERT -> DELETE -> COMMIT(OR ROLLBACK)
		   [            TRANSACTION            ]


*/

SELECT * FROM emp;

COMMIT;

UPDATE emp SET salary = 100; --> TRANSACTION

-- CREATE TABLE fruits ( fruit_name VARCHAR2(30) ); 

	-- �� CREATE TABLE �� DML�� �ƴϹǷ� Ʈ������� �ƴ�. only DML��
	-> Ʈ����� ���߿� DDL���� ����ϸ� �ڵ����� Ŀ���� �Ǳ� ������ �����ؾ� ��!
	--> DDL���� ���� �ڵ� Ŀ��. �ѹ� �ȵ�.

ROLLBACK;


-- SAVEPOINT �� �̿��� Ʈ����� ����

COMMIT;

UPDATE emp SET salary = 200;
SAVEPOINT save01;

UPDATE emp SET salary = 300;
SAVEPOINT save02;

UPDATE emp SET salary = 400;
SAVEPOINT save03;

ROLLBACK;
ROLLBACK TO save02; -- ���� ������ SAVEPOINT �θ� ���ư� �� ����

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


























