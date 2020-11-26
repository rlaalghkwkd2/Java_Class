--11_���̺� ����.sql
/*
    # DML (Data Manipulation Languge, ������ ���۾�)
        - ���̺� ������ �����͸� �˻�/�߰�/����/�����ϴ� ��ɾ�
        - SELECT :  �˻�
        - INSERT : ����
        - UPDATE : ����
        - DELETE : ����
        
    # DDL (Data Definition Language, ������ ���Ǿ�)
        - ���̺� ��(������, �ε���, ��..)�� ������ �����ϴµ� ����ϴ� ��ɾ�
        - CREATE : ����
        - DROP : ����
        - ALTER : ����
        - TRUNCATE : ���� ����
    
    # DCL (Data Control Language, ������ �����)
        - ������� ������ �����ϴµ� ����ϴ� ��ɾ�
        - GRANT : ����ڿ��� ������ �ο�
        - REVOKE : ������� ������ ȸ��
*/

/*
-- CREATE TABLE  ���̺�� (�÷��̸�, �÷�Ÿ��0
*/
CREATE TABLE coffees (
            CID NUMBER(4), 
            CNAME VARCHAR2(30),
            CPRICE NUMBER
);

DESC coffees;

-- ������ �����ϴ� ���̺��� �����ϸ鼭 �����
CREATE TABLE employees2 AS SELECT * FROM employees;
CREATE TABLE employees3 AS (SELECT last_name AS �̸�, salary AS ����, job_id AS ���� FROM employees);
SELECT * FROM employees3;
-- # ���̺� �����ϱ�
SELECT * FROM tab;
drop TABLE cmployees2;


-- # ������ ���̺� �˻�
show recyclebin;
SELECT * from recyclebin;

-- # ������ �����ϱ�
FLASHBACK TABLE coffees TO BEFORE DROP;

-- # ������ ����
PURGE recyclebin;

-- # ������ ��ġ�� �ʰ� �ٷ� ���̺� ����
DROP TABLE coffees PURGE;
DROP TABLE employees3 PURGE;

--��������01 : 50�� �μ� �����θ� ������ ���̺��� �ϳ� �����غ�����

CREATE TABLE em5 AS (SELECT * FROM employees WHERE department_id = 50);

SELECT * FROM em5;
DROP TABLE em5 PURGE;

-- # ���̺��� ������ �����ϱ� (�Ϻη� ���� �ȵǴ� ������ �ְ� ���̺��� ����)
CREATE TABLE employeee AS SELECT * FROM employees where 1 =0;

desc employeee;

DROP TABLE employeee PURGE;

-- # ���̺� ���� ���� ��ɾ��
CREATE TABLE coffees (
            CFID NUMBER(4), 
            CNAME VARCHAR2(30),
            cprice NUMBER(20)
);

drop TABLE coffees; 

-- # ALTER TABLE ���̺�� ADD (�÷��� �÷�Ÿ��)
ALTER TABLE coffees ADD (
        location_id NUMBER(4),
        acidity NUMBER(4, 2)
);
DESC coffees;

SELECT * FROM coffees; 

-- # ALTER TABLE ���̺�� MODIFY (�÷��� �÷�Ÿ��, ...)
-- �÷��� ������ ���� ������ Ÿ���̳� ũ�� ���� ������ ���ִ�.
-- �÷����� ������ �� ����

ALTER TABLE coffees MODIFY (
        cid NUMBER(3),
        cname VARCHAR2(50)
        );
        
-- # ALTER TABLE ���̺�� DROP COLUMN �÷���:
ALTER TABLE coffees DROP COLUMN acidity;

-- # ALTER TABLE ���̺�� SET UNUSED(�÷���) : ������ �غ� ��Ű�� (SET UNUSED)
-- �����ϱ� ���� ������� ���ϴ� ���·� �����Ѵ�
-- �������� ������ ���߿� ������ �� ����Ѵ�
-- ���̺� ����� ���� ���� �� ������ �ð��� �����ϱ� ���� �����Ѵ�

ALTER TABLE coffees SET UNUSED (location_id);
-- ������ �ð��뿡 ������ �����Ѵ�
ALTER TABLE coffees DROP UNUSED COLUMNS;



-- # ���̺�� �����ϱ�
RENAME coffees TO coffee_shop;

SELECT * from tab;

-- # �÷��� �����ϱ�
ALTER TABLE coffee_shop RENAME COLUMN cid TO cfid;
DESC coffee_shop;

/*
        # ������ ��ųʸ�
            - �츮�� ���̺��� �߰��ϸ� DB�� �����ϴ� ���̺��� ������ DBMS�� �˾Ƽ� �����Ѵ�
            - ��ó�� ����ڰ� ���� �����ϴ� ���� �ƴ� �����͵��� ������ ��ųʸ���� �θ���.
            
        # ������ ��ųʸ� ��
            - ������ ��ųʸ��� ����ڰ� ���� ���ϵ��� ��ȯ�Ͽ� �����ϴ� ��
*/


SELECT * from tab;
SELECT * from tabs; 
SELECT * from user_tables; -- USER : ���� user�� ������ �ִ� ������ �����ִ� ������ ��ųʸ� ��
SELECT * FROM all_tables; -- ALL : ��� user�� ������ �ִ� ������ �����ִ� ������ ��ųʸ� ��


-- # �������� (constraints) ������ ��ųʸ� ��
SELECT * FROM user_constraints;
SELECT * FROM all_constraints;

show user;