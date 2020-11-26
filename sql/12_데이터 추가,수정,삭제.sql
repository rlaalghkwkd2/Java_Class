-- 12_������ �߰�,����,����.sql

/*
        #  INSERT : ���̺� ���ο� ������ �߰�(����)
            
            INSERT INTO ���̺�� (�÷���,..) VALUES(��,...)
*/

rename  COFFEE_SHOP to coffees;

DESC  coffees;

-- # ���� �⺻���� ������ �߰�
INSERT INTO  coffees(cfid, cname, cprice) VALUES (1, '�ƾƽ� �Ƹ޸�ī��', 2000);
INSERT INTO  coffees(cname,cfid, cprice) VALUES ( '�߰ſ� �Ƹ޸�ī��', 2,2000);
SELECT * FROM coffees;

-- # �Ϻ� �÷����� ������ �߰�
INSERT INTO coffees (cname, cprice) VALUES ('���̽� ī���', 2500);
INSERT INTO coffees(cprice, cfid) VALUES(2500,4);

-- # �÷��� �����ϸ鼭 ������ �߰� (��� �÷��� ������� ��� ���� �־�� ��)
INSERT INTO coffees VALUES(5,'���̽� ī���ī', 3000);  -- �ߺ��Ǵ� ���� ���� �� �ִ�
INSERT INTO coffees VALUES(5,'���̽� ī���ī', 3000);

-- # ���� ������ ������ �����ϱ�
INSERT INTO coffees SELECT * FROM coffees;

/*
        # UPDATE : ���̺��� �����͸� ����
            - UPDATE ���̺�� SET �÷��� = ��, ... WHERE ������ ���� ����;
            - UPDATE ���� ������ �Է����� ������ ��� ���� �����ȴ�.
            - ������ �����ϴ� ��� ���� �����Ѵ�
            - �ϳ��� ���� ������ �� �ִ� �⺻Ű�� �Բ� �̿�Ǵ� ��찡 ��κ��̴�.
*/
SELECT * FROM coffees;

SELECT rownum, coffees.* from coffees where cprice = 3000; -- ù ���� �ุ �����ϰ���������� ����غ����� rowid,rownum ���� ����������
SELECT rownum, coffees.* from coffees ORDER BY cprice DESC; -- ����� �ȵ� ù��° ���̶�� �� �� ����

UPDATE coffees SET cprice = cprice + 200 WHERE cfid = 2;
 
 --��������01 : employees ���̺��� ������ �����ϴ� �������� �̿��Ͽ� emp���̺��� ����
 CREATE TABLE emp AS SELECT * FROM employees where 1 =0;
 
 SELECT * FROM emp;
 --��������02 : emp���̺� employees�� ��� ����� �� Ȧ�� ����� ���� ����鸸 �߰� �غ�����
INSERT INTO emp select * from employees where MOD (employee_id, 2)=1;
 
 --��������03 : emp���̺��� ��� ����� �� JOB_ID�� MAN�� ���Ե� ������� ������ 40%�谨 �غ�����
UPDATE emp SET salary = salary - (salary*0.4) WHERE job_id  LIKE '%MAN%';








 
 
