-- Test

/*
[문항1] 오라클 연습용 테이블인 employees 테이블에서, 모든 사원들의 사번/이름/연봉을 출력해보세요
(연봉 컬럼에만 한글 별칭을 사용하고 $를 함께 출력, 이름은 first_name 컬럼입니다) (배점:20)
*/
SELECT employee_id, first_name, last_name, '$'|| salary*12  AS "연봉"  FROM employees;


 -- [문항3] 오라클 연습용 테이블인 employees 테이블에서,
-- '직급ID/직급에 속한 사원 수/직급별 평균월급'을 평균 월급 내림차순으로 조회해보세요 (배점:20)
SELECT job_id, COUNT(*) as "사원 수" ,AVG(salary) as "평균 급여" FROM employees GROUP BY job_id order by  AVG (salary) desc;
    
/*
	
[문항4] 50번 부서 사원들의 
'사번/사원이름/사원 성/매니저번호/매니저이름/매니저 성'을 조회하는 뷰를 생성해보세요 (배점:20)
*/

CREATE OR REPLACE VIEW eid_mid_view (
 사번,
 사원이름,
 사원성,
 매니저번호,
 매니저이름,
 매니저성
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
      
            select * from emp_mgr_view order by "매니저이름" DESC;

/*
서브쿼리를 이용해 Purchasing부서에서 근무하는 사원의 이름과 부서번호를 조회해보세요 (배점:20)
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
[문항3] 다음과 같은 시퀀스 오브젝트를 생성하는 DDL을 작성하세요 (배점:30)
시작값 207번, 1씩 증가, 최대값 5000번, 순환하지 않음, 캐시 없음, 시퀀스명은 자유
*/
CREATE SEQUENCE text_seq START WITH 207   MAXVALUE 5000 INCREMENT BY 1 CYCLE NOCACHE;


 select  * from employees;
 select  * from departments;
select * from jobs;
drop VIEW eid_mid_view;