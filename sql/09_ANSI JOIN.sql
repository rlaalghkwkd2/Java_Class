-- 09_ANSI JOIN.sql

-- ANSI (미국 국가 표준 협회)에서 정한 표준을 따르는 JOIN문법

-- ANSI CROSS JOIN
SELECT * FROM employees CROSS JOIN departments;

-- ANSI INNER JOIN : 조건에 맞는 행만 등장하는 JOIN
SELECT * FROM employees e INNER  JOIN departments d ON e.department_id = d.department_id;   

-- ANSI OUTER JOIN : 조건에 안 맞는 행도 보고싶을 때 사용하는 JOIN
    -- LEFT OUTER JOIN : 오른쪽에 (+)를 붙인 경우와 같음
    -- RIGHT OUTER JOIN : 왼쪽에 (+)를 붙인 경우와 같음
    -- FULL OUTER JOIN : 양쪽에 (+)를 붙인 경우와 같음
    
SELECT 
        first_name, department_name
 FROM
         employees e  RIGHT OUTER  JOIN  departments d
 ON
    e.department_id = d.department_id;


SELECT
    last_name, department_name
FROM
    employees e LEFT OUTER  JOIN departments d
ON
    e.department_id = d.department_id;
    
    
SELECT
    last_name,  department_name
FROM
    employees e FULL OUTER JOIN departments d
ON
    e.department_id = d.department_id
AND last_name = 'King'
ORDER BY
    last_name;
    
-- ANSI JOIN을 이용할 떄 JOIN조건에 이용되는 컬럼명이 같은 경우
-- USING을 이용해 쿼리문을 간소화 할 수 있다.

SELECT *  FROM employees e INNER  join departments d USING(department_id);

SELECT * FROM employees e LEFT JOIN departments d USING(department_id);

SELECT * FROM employees e RIGHT JOIN departments d USING(department_id);

SELECT * FROM employees e FULL OUTER JOIN departments d USING(department_id);





-- JOIN에 사용되는 조건과 필요해서 사용하는 조건이 구분된다
SELECT
    last_name, department_id, department_name
FROM
    employees e INNER JOIN departments d USING(department_id)
WHERE
    salary <= 10000
ORDER BY
    salary DESC;
    
    SELECT * FROM employees;
    SELECT * FROM departments;
    SELECT * FROM  jobs;
    SELECT * FROM  locations;
    
-- ANSI JOIN을 이용하여 풀어보세요

--연습문제01 : FIRST_NAME이 Neena인 사원과 같은 도시에서 근무하는 모든 사원의 이름과 부서번호를 조회해보세요
SELECT
    first_name,  last_name,  department_id
FROM
       employees 
    INNER JOIN departments USING(department_id)
    INNER JOIN locations USING (location_id)
WHERE
    city = (
 SELECT
            city
            FROM
                employees
                    INNER JOIN departments USING (department_id)
                    INNER JOIN locations USING (location_id)
                    WHERE
                    first_name = 'Neena'
                    );
        
        
--연습문제02 : FIRST_NAME이 Neena인 사원과 급여가 5000이상 차이나지 않는 모든 사원을 조회해보세요
SELECT e1.* FROM
    employees e1 INNER JOIN employees e2 ON e2.first_name = 'Neena'       --and e1.salary BETWEEN e2.salary - 5000 and e2.salary + 5000; -- BETWEEN 그사이 만족값
AND ABS
    (e2.salary - e1.salary) <= 5000
ORDER BY
        e1.salary DESC;
  

--연습문제03: 시애틀에서 근무하는 모든 사원의 이름/부서명/도시를 조회
SELECT
    first_name, last_name, department_name, city
FROM
    employees
        INNER JOIN departments USING(department_id)
        INNER JOIN locations USING(location_id)
where
    locations.city = 'Seattle';

--연습문제04: 매니저의 이름이 King인 모든 사원의 이름/직책명/연봉을 조회
SELECT
     a.first_name, 
     a.last_name ,
    jobs.job_title,
     a.salary * (NVL(a.commission_pct,0) +1 ) * 12
FROM
    employees a
        INNER JOIN employees b on a.manager_id = b.employee_id  AND b.last_name = 'King'
        INNER  JOIN jobs on a.job_id = jobs.job_id;







    