-- 02_SELECT.sql

/* 
    # SECECT �÷��� FROM ���̺��;
        - �����͸� ��ȸ�ϴ� ������
        - �÷��� *�� ���� ���� ��� �÷��� ���Ѵ�.

*/

SELECT * FROM tab;  -- tab ���̺��� ��� �÷�(�Ӽ�, �ʵ�, ��)�� ��ȸ�Ѵ�.

SELECT * FROM employees;  -- ���� ���̺��� ��� �÷��� ��ȸ�Ѵ�.

-- �÷����� ������ �ش� �÷��� �����͸� ��ȸ�Ѵ�.
SELECT last_name, phone_number, hire_date FROM employees;

-- ������ ���̺� ����

/*
    COUNTRIES : ���� ������ ������ ���̺�
    EMPLOYEES : ��� ������ ������ ���̺�
    DEPARTMENTS : �μ� ������ ������ ���̺�
    JOBS : ���� ������ ������ ���̺�
    LOCATIONS : ���� ������ ������ ���̺�
    REGIONS : ��� ������ ������ ���̺�
*/

-- SELECT * FROM jobs;

-- ���̺��� �Ӽ� ���� ����
DESC employees;
DESC countries;

/*
    Oracle ������ Ÿ��
    
    # NUMBER(n), NUMBER(��ü �ڸ���, �Ҽ��� �ڸ���)
        - ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - NUMBER(6) : 6�ڸ� ������ ������ �� �ִ� �÷��� �ȴ�.
        - NUMBER(6, 3) : 3�ڸ� ������ 3�ڸ� �Ҽ����� ������ �� �ִ� �÷��� �ȴ�.

    # CHAR(n)
        - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - ������ ���̺��� ���� ���� �����Ͱ� ��������
          ���������� ������ ���̸� �����Ѵ�.
        - CHAR(10)���� ������ �÷��� 2���ڰ� �������� 10����Ʈ�� �����Ѵ�.
    
    # VARCHAR2(n)
        - ���� ���� ���� �����͸� ������ �� ����ϴ� �÷� Ÿ��
        - ����� �������� ũ�⿡ ���� �˸��� ������ ����Ѵ�.
        - ���� ������ ���� ���� �� �ִ�.
        - VARCHAR2(10)���� ������ �÷��� 2���ڰ� ������ 2����Ʈ�� �����Ѵ�.

    # DATE
        - ��¥ �� �ð��� �����ϴ� �÷� Ÿ��
        - ���� / �� / �� / �� / �� / �� / �� /���� ���� �����Ѵ�.
*/
SELECT * FROM countries;

-- ���� ���� 01 : ��� ����� ��� / �̸� / ���� / �μ���ȣ�� ��ȸ�غ��ÿ�.
SELECT * FROM tab;
SELECT * FROM employees;
SELECT employee_id, first_name, last_name, salary, department_id FROM employees;
DESC employees;

-- �� �÷���, ���̺��, Ű����� ��ҹ��ڸ� �������� �ʴ´�.

-- ��� �����ڷ� ���� �� ����ϱ�
SELECT last_name, salary FROM employees;
SELECT last_name, salary + 500 FROM employees;
SELECT last_name, salary * 2 FROM employees;
SELECT last_name, salary / 10 FROM employees;


SELECT * FROM employees;
-- ���޿� ���ʽ� �����غ���

-- �÷����� ���� ������ ������� ��� AS�� �̿��� �÷����� ������ �� �ִ�.
SELECT last_name, salary * commission_pct AS ���ʽ� FROM employees;

-- ���� + ���ʽ� ����غ���
-- �� null�� �������� �ʴ� ���̱� ������ ������꿡 ���ԵǸ� ������ null�� �ȴ�.
SELECT last_name, salary + salary * commission_pct AS �Ǽ��ɾ� FROM employees;

-- NBL(�÷���, ��ü��) �Լ� : �ش� �÷����� NULL ���� ������ �� ��ü���� ����Ѵ�.
SELECT last_name, salary * (NVL(commission_pct, 0)+1) AS total_salary FROM employees;

-- "�÷���"�� �̿��ϸ� �÷����� ��ҹ��ڸ� ������ �� �ִ�.
SELECT last_name as "Last_Name" FROM employees;

-- �������� 02 : ��� ������� ��� / �̸� / ������ ����غ��ÿ�.
--                  salary�� �����Դϴ�. ���� �÷����� �ѱ� ��Ī�� ���

SELECT employee_id AS ���, last_name AS �̸�, salary * 12 AS ���� FROM employees;

-- SELECT DISTINCT : �ߺ��Ǵ� ����� �־ �� ���� ��ȸ�ȴ�.

-- ��� �������� ��å�� �ѹ����� �� �� �ִ�.
SELECT DISTINCT job_id FROM employees;
SELECT DISTINCT department_id FROM employees;

-- �Ŵ��� ������ �ϰ� �ִ� ������� ����� �ѹ����� ��ȸ�� �� �ִ�.
SELECT DISTINCT manager_id FROM employees;