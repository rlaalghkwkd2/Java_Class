-- 08_Join.sql

/*
    # DB �ĺ�Ű (Candidate Key)
        - ���̺� ������ �� ���� �����ϰ� ������ �� �ִ� ��� �÷�
    
    # DB �⺻Ű (Primary Key, PK)
        - �ĺ�Ű�� �߿��� ���̺��� Ű�� ���õ� ��
        - �� ���̺� �� �⺻Ű�� �ϳ��ۿ� ������ �� ����.
        
    # DB �ܷ�Ű (Foreign Key, FK)
        - �ٸ� ���̺����� �⺻Ű(Ȥ�� �ĺ�Ű)������, ���� ���̺����� �ߺ��Ǵ� ���� �÷�
            ���� ���̺����� �ߺ��Ǵ� ���� �÷�
       ex : employees ���̺��� job_id�� jobs ���̺����� �⺻Ű��
       es2 : employees ���̺��� department_id�� departments ���̺����� �⺻Ű��.
       - �ܷ�Ű�� ������ ���̺����� ���谡 �����ȴ�.
       
       �� ���̺��� ������ �⺻Ű�� �ܷ�Ű�� �����Ͽ� �� ���̺� ���� ������ �����Ѵ�
*/
SELECT * FROM  EMP_DETAILS_VIEW;
SELECT * FROM employees;
SELECT * FROM departments; 

/*
    # ���̺� JOIN
        - �⺻Ű�� �ܷ�Ű�� �̿��� ���谡 ���͵Ǿ� �ִ� ���̺���� ������ �����Ͽ� ��ȸ�ϴ� ��
 
    # CROSS JOIN
        - �� ���̺��� �����͸� �����Ͽ� ���� �� �ִ� ��� ��츦 ����� JOIN
        - �׳� ��� ��츦 ������ ������� ����
*/
SELECT * FROM employees, departments;

SELECT * FROM employees;
SELECT * FROM departments;

/*
    # EQUI JOIN
        - �� ���̺� ���� ���� ������ ���� ���� �÷��� �̿��Ͽ�
            CROSS JOIN�� ������� �ǹ��ִ� �����͸� �ɷ����� JOIN
*/

SELECT last_name, department_name
FROM 
    employees, departments
WHERE
    employees.department_id = departments.department_id
ORDER BY 
    last_name asc;
    
-- ��������01 : LAST_NAME�� Bloom�� ����� ������ �μ����� ��ȸ�غ�����
SELECT 
   employees.last_name,
   department_name
FROM
   employees, departments
WHERE
    employees.department_id = departments.department_id
AND
   employees.last_name = 'Bloom';  


SELECT * FROM employees;
SELECT * FROM departments;
SELECT * FROM  jobs;
SELECT * FROM  locations;

--��������02 : JOB_ID��  IT_PROG�� ������� LAST_NAME/�μ���ȣ/�μ���

SELECT
    last_name, departments.department_id, department_name
FROM
    employees, departments
    WHERE
        employees.department_id = departments.department_id
        AND employees.job_id = 'IT_PROG';

--��������03 : �þ�Ʋ���� �ٹ��ϴ� ��� ����� �̸��� �޿��� ��ȸ
SELECT 
    employees.last_name, employees.salary
FROM 
      employees, emp_details_view
WHERE
    employees.employee_id = emp_details_view.employee_id
AND
    emp_details_view.city = 'Seattle';

 

SELECT
    first_name, last_name, salary
FROM
    employees,departments,locations
WHERE
    departments.location_id = locations.location_id 
AND
    employees.department_id = departments.department_id
AND
    locations.city = 'Seattle';  

--��������04 : ��å�̸��� Marketing�� �� ��� ����� �̸��� �޿��� ������� ��ȸ
SELECT
    last_name, salary, hire_date, job_title
FROM
    employees, jobs
WHERE
    employees.job_id = jobs.job_id
AND 
    jobs.job_title like 'Marketing%';

-- ���̺��� �����ϰ� �� �ɰ������� �ʿ��ҋ� �ϳ��� ���̺�� ���ļ� ����� �� �ְ�
-- �����;��� ���� �� �ִ� (��� �ణ ����)

/*
    # SELF JOIN
        - �ϳ��� ���̺� ������ �ڽŰ� JOIN�Ͽ� ���ϴ� �����͸� ���� ��
        - MANAGER_ID�� employees ���̺��� �⺻Ű�� �� �� �ִ� �ܷ�Ű�̴�.
*/     

-- ���� �̸��� �ش� ������ ����ϴ� �Ŵ��� �̸��� ��ȸ
SELECT 
   a.first_name,  a.last_name 
AS 
    "�� �̸�", b.first_name, b.last_name 
AS
    "�Ŵ��� �̸�" 
FROM 
    employees a, employees b
WHERE
    a.manager_id = b.employee_id
ORDER BY
    a.last_name ASC;

--��������05 : �Ŵ����� King�� ������� �̸��� job_title�� ��ȸ
-- ���� �̸��� �ش� ������ ����ϴ� �Ŵ��� �̸��� ��ȸ
SELECT 
     a.first_name,
     job_title
FROM 
    employees a, employees b, jobs
WHERE
    a.manager_id =b.employee_id 
and
    a.job_id = jobs.job_id
and
    b.last_name = 'King';
   

--��������06 : Taylor�� ������ ��å�� ���� ����� ������ ��� ��ȸ

SELECT a.* FROM  employees a, employees b WHERE  a.job_id = b.job_id AND b.last_name ='Taylor';


/*
    # OUTER JOIN
        - JOIN ������ �������� ���ؼ� �������� ���� �����͵��� Ȯ���� �� ����ϴ� JOIN
        - �������� ���� ���� Ȯ���ϰ� ���� ���� �ݴ��� (+)�� ���δ�.
        - (+)�� �������� �࿡ NULL�� �߰��ؼ� �����͸� Ȯ���Ѵ�.
*/

SELECT
     *--a.last_name as  "���̸�", b.last_name as "�Ŵ����̸�"
FROM
    employees a, employees b
WHERE
    a.manager_id = b.employee_id(+)
ORDER BY
    b.job_id DESC;
    
    SELECT * FROM employees;
    SELECT * FROM departments;
    SELECT * FROM  jobs;
    SELECT * FROM  locations;
--��������07 : ����̸�/�μ���ȣ/�μ��̸�/����ID �� ����ϵ� ����� �Ѹ� ������ ���� �μ��� ��ȸ
SELECT
    first_name, employees.department_id, department_name, location_id
FROM
    employees, departments , locations
WHERE
    employees.department_id(+) = departments.department_id
-- AND
   -- locations.location_id = departments.location_id

ORDER BY
    first_name ASC;


--��������08 : �����/����ID/���޸��� ����ϵ� ����� �Ѹ� ������ ���� ���޵� �Բ� ��ȸ
SELECT
    first_name, last_name, employees.job_id, job_title
FROM
    employees,jobs
WHERE
    employees.job_id(+)= jobs.job_id;

--��������09 : �μ���/�ּ�/���ø��� ����ϵ� �Ҽӵ� �μ��� ���� ���õ� ����غ�����
SELECT
    department_name, street_address,city
FROM
    locations l,departments d
WHERE
    d.location_id(+) = l.location_id;



