-- 05_유용한 함수.sql

/*
    # DUAL 테이블
         - 계산 연습하는 테이블
         - 하나의 행만 가지고 있는 테스트용 테이블
*/

SELECT 1 FROM dual;

-- ABS(n) : 절대값
SELECT ABS (-99) FROM dual;

-- FLOOR(n) : 버림
SELECT FLOOR(3.14) FROM dual;

-- ROUND(n) : 반올림
SELECT 3.55, ROUND (3.55) FROM dual;

-- CEIL(n) : 올림
SELECT 3.11, CEIL(3.11) FROM dual;

-- MOD(value, divider  ) : 나머지 연산
SELECT MOD(5, 3) FROM dual;

-- TRUNC (value, 자리) : 지정한 자리값 이하를 버린다.
SELECT TRUNC(1234.56789, 2) FROM dual;
SELECT TRUNC(1234.56789, -1) FROM dual;
SELECT TRUNC(1234.56789, -2) FROM dual;

-- TRUNC와 sysdate
SELECT sysdate FROM dual; -- sysdate : 현재 날짜 및 시간을 구해준다.

-- TRUNC는 전달한 타입의 단위를 이용한다.
SELECT TRUNC(sysdate, 'YEAR') FROM dual;
SELECT TRUNC(sysdate, 'MONTH') FROM dual;
SELECT TRUNC(sysdate, 'DAY') FROM dual;

-- LOWER
SELECT LOWER('ABC') FROM dual;

-- UPPER
SELECT UPPER('abc') FROM dual;

-- SUBSTR(str, start, numOfChar)
-- start부터 해당 개수만큼의 문자를 자른다.
SELECT SUBSTR('Hello world!', 1, 5) FROM dual; -- 1 base
SELECT SUBSTR('Hello world!', 6) FROM dual; -- start에서 끝까지

-- LENGTH
SELECT LENGTH('12345') FROM dual;

-- LPAD(원본, 길이, 채울 문자)
-- RPAD(원본, 길이, 채울 문자)
SELECT LPAD('MENU', 20, '#') FROM dual; 
SELECT RPAD('MENU', 20, '#') FROM dual;

-- LTRIM(원본, 제거할 문자)
-- RTRIM(원본, 제거할 문자)
SELECT LTRIM('#######MENU','#') FROM dual;
SELECT RTRIM('MENU#######','#') FROM dual;
SELECT '       MENU', LTRIM('       MENU') FROM dual;
SELECT ('MENU       '), RTRIM('MENU       ') FROM dual;

-- TRIM() :앞 뒤의 특정 문자를 제거한다.
SELECT TRIM('#' FROM '#######MENU#######') FROM dual;

-- 날짜 다루기
SELECT sysdate - 1 as 어제, sysdate as 오늘, sysdate + 1 as 내일, sysdate + 2 as "내일 모레" FROM dual;

-- 날짜 - 날짜
SELECT last_name, FLOOR((sysdate - hire_date) / 365) AS 근무일수 FROM employees;

-- 날짜 형식 지정하기
SELECT last_name, TO_CHAR(hire_date, 'CC YYYY MM DD DY HH:mm:ss') FROM employees;
/*
    YYYY : 년도
    YY : 년도(2자리)
    MM : 월을 숫자로
    MON : 월을 문자로
    DD : 날짜
    DAY : 요일
    DY : 요일을 줄임말로
    HH : 시
    HH24 : 24시
    HH12 : 12시
    mm : 분
    ss : 초
    AM, PM : 오전 오후 표시 
*/

-- ROUND를 날짜와 함께 이용하기
SELECT last_name, TRUNC(hire_date, 'MONTH') FROM employees;
SELECT last_name, TO_CHAR(ROUND(hire_date, 'MM'), 'CC YY-MM-DD HH:mm:ss') FROM employees;
SELECT last_name, ROUND(hire_date, 'MONTH') FROM employees;

/*
    CC : 세기(Centry, 51년 이후로 반올림)
    YEAR : 7월 1일 이후부터 반올림
    MONTH : 16일 기준으로 반올림
    DAY : 한 주 단위로 반올림 (그 주의 시작지점으로 감)
*/

-- TRUNC와 ROUND에 날짜 포맷을 사용할 수 있다.
-- 사용한 날짜 포맷값까지 내림 또는 반올림한다.

-- MONTHS_BETWEEN : 두 날짜 사이의 개월 수를 구한다.
SELECT MONTHS_BETWEEN(sysdate, hire_date) FROM employees;
SELECT TRUNC(MONTHS_BETWEEN(sysdate, hire_date)) FROM employees;
SELECT FLOOR(MONTHS_BETWEEN(sysdate, hire_date)) FROM employees;

-- ADD_MONTHS(date, num) : 해당 날짜에 전달한 개월 수를 추가한다.
SELECT last_name, hire_date, ADD_MONTHS(hire_date, 6) FROM employees;

-- NEXT_DAY(date,  요일) : 해당 날짜를 기준으로 다음 요일의 날짜를 찾는다.
SELECT NEXT_DAY(sysdate, '화요일') FROM dual;
SELECT NEXT_DAY(sysdate, '수요일') FROM dual;
SELECT NEXT_DAY(sysdate, '월요일') FROM dual;

-- LAST_DAY(date) : 해당 날짜가 속한 달의 마지막 날짜를 반환한다.
SELECT LAST_DAY(sysdate) FROM dual;
SELECT LAST_DAY('2020/02/01') FROM dual;

-- 형 변환 함수들
/*
        Number      - TO_CHAR ->      Character     - TO_DATE ->      Date
         Number      <- TO_NUMBER -      Character     <- TO_CHAR ->      Date
*/
-- 날짜를 문자로 변환
SELECT TO_CHAR(sysdate, 'YY/MM/DD HH:mi:ss day') FROM dual;

-- 숫자를 문자로 변환할 때의 포맷
/*
    0 : 자릿수를 나타낸다. 숫자가 비면 0으로 채운다.
    9 : 자릿수를 나타낸다. 숫자가 비면 빈칸으로 채운다. 
    L : 각 지역별 통화 기호를 붙인다.
    . : 소수점을 출력한다.
    , : 천 단위를 구분하는 쉼표를 사용
*/

SELECT TO_CHAR(1234) FROM dual;
SELECT TO_CHAR(12345,'00,000,000.00') FROM dual;
SELECT TO_CHAR(12345,'99999999') FROM dual;
SELECT last_name, TO_CHAR(salary, '99999L') FROM employees;

-- TO_DATE : 문자를 날짜로 변환
SELECT TO_DATE('1999/05/24', 'YYYY/MM/DD') FROM dual;
SELECT TO_DATE('19990524', 'YYYYMMDD') FROM dual;

-- TO_NAMBER : 문자를 숫자로 변환
SELECT TO_NUMBER('123,545', '999,999') FROM dual;

-- NVL : NULL을 다른 값으로 치환
SELECT NVL(null, 'other value') FROM dual;

SELECT last_name, NVL(commission_pct, 0) FROM employees;
SELECT last_name, 'CEO' AS manager_id FROM employees WHERE manager_id IS NULL;

-- DECODE() : switch case 같은 역할을 한다.
SELECT * FROM employees;




SELECT 
    last_name AS myname, 
    manager_id, 
    DECODE(manager_id, 
                                -- subquery : 쿼리문 내부에 사용되는 쿼리
                100,  (SELECT last_name FROM employees WHERE employee_id = 100), 
                102, 'De Haan',
                103, (SELECT last_name FROM employees WHERE employee_id = 103)
    ) AS manager_name 
FROM 
    employees
WHERE 
    manager_id IN (100,102,103);

-- 연습 문제 01 : 직급에 따라 급여를 인상해서 출력해보시오
--                   IT_PROG : 15% 인상
--                   FI_ACCOUNT : 10% 인상
--                   모든 종류의 CLERK  : 20% 인상
--  ※ 원래의 급여는 before_salary로 인상된 급여는 after_salary로 
--  급여가 변동된 사원만 이름과 함께 출력 할 것 

-- FROM TABLE 절에 SELECT문이 서브쿼리로 들어갈 수 있다.
-- ※ 서브쿼리에서 정한 컬럼의 별칭을 내부에서 정한 컬럼의 별칭을 바깥 SELECT문에서 사용할 수 있다.

-- 방법 1
SELECT * FROM (
SELECT 
    last_name, 
    salary as before_salary,
    job_id,
    DECODE(job_id, 
    'IT_PROG', salary * 1.15,
    'FI_ACCOUNT', salary * 1.1,
    'PU_CLERK', salary * 1.2,
     'ST_CLERK', salary * 1.2,
      'SH_CLERK', salary * 1.2
) AS after_salary
FROM 
    employees)
WHERE
   after_salary IS NOT NULL;

-- 방법 2
SELECT 
    last_name, 
    salary as before_salary,
    job_id,
    DECODE(job_id, 
    'IT_PROG', salary * 1.15,
    'FI_ACCOUNT', salary * 1.1,
    'PU_CLERK', salary * 1.2,
     'ST_CLERK', salary * 1.2,
      'SH_CLERK', salary * 1.2
) AS after_salary
FROM 
    employees
WHERE
   job_id IN ('IT_PROG', 'FI_ACCOUNT') OR job_id LIKE '%CLERK';
   
-- UNION 이용하기
SELECT last_name, job_id, salary as before_salary, salary *1.15 as after_salary 
FROM employees
WHERE job_id = 'IT_PROG'

UNION
SELECT last_name, job_id, salary, salary *1.1 
FROM employees
WHERE job_id = 'FI_ACCOUNT'

UNION
SELECT last_name, job_id, salary, salary *1.2 
FROM employees
WHERE job_id LIKE '%CLERK';

-- DECODE는 해당 컬럼의 값과 정확하게 일치하는 값만 이용할 수 있다는 단점이 있다.
-- 그럴 때는 CASE절을 이용한다.

-- CASE 이용하기
SELECT * FROM (SELECT 
    last_name, job_id, salary as befor_salary,
    CASE WHEN job_id = 'IT_PROG' THEN salary * 1.15
            WHEN job_id = 'FI_ACCOUNT' THEN salary * 1.1
            WHEN job_id LIKE '%CLERK' THEN salary * 1.2
    END AS after_salary
FROM 
    employees)
WHERE 
    after_salary IS NOT NULL;