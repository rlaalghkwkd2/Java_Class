-- Test

/*
[����1] ����Ŭ ������ ���̺��� employees ���̺���, ��� ������� ���/�̸�/������ ����غ�����
(���� �÷����� �ѱ� ��Ī�� ����ϰ� $�� �Բ� ���, �̸��� first_name �÷��Դϴ�) (����:20)
*/
SELECT employee_id, first_name, last_name, '$'|| salary*12  AS "����"  FROM employees;


 -- [����3] ����Ŭ ������ ���̺��� employees ���̺���,
-- '����ID/���޿� ���� ��� ��/���޺� ��տ���'�� ��� ���� ������������ ��ȸ�غ����� (����:20)
SELECT job_id, COUNT(*) as "��� ��" ,AVG(salary) as "��� �޿�" FROM employees GROUP BY job_id order by  AVG (salary) desc;
    
/*
	
[����4] 50�� �μ� ������� 
'���/����̸�/��� ��/�Ŵ�����ȣ/�Ŵ����̸�/�Ŵ��� ��'�� ��ȸ�ϴ� �並 �����غ����� (����:20)
*/

CREATE OR REPLACE VIEW eid_mid_view (
 ���,
 ����̸�,
 �����,
 �Ŵ�����ȣ,
 �Ŵ����̸�,
 �Ŵ�����
)AS
    SELECT
              e1.employee_id,
              e1.first_name,
               e1.last_name,
                e1.manager_id,
                e2.first_name,
                e2.last_name
            FROM
          employees  e1, employees e2
          where  e1.manager_id = e2.employee_id;
      
            select * from emp_mgr_view order by "�Ŵ����̸�" DESC;

/*
���������� �̿��� Purchasing�μ����� �ٹ��ϴ� ����� �̸��� �μ���ȣ�� ��ȸ�غ����� (����:20)
*/

SELECT
    first_name,
   department_id
FROM
employees
 WHERE
    department_id =(
SELECT
    department_id
FROM
    departments
WHERE
    department_name = 'Purchasing'
);

/*
[����3] ������ ���� ������ ������Ʈ�� �����ϴ� DDL�� �ۼ��ϼ��� (����:30)
���۰� 207��, 1�� ����, �ִ밪 5000��, ��ȯ���� ����, ĳ�� ����, ���������� ����
*/
CREATE SEQUENCE text_seq START WITH 207   MAXVALUE 5000 INCREMENT BY 1 CYCLE NOCACHE;


 select  * from employees;
 select  * from departments;
select * from jobs;
drop VIEW eid_mid_view;