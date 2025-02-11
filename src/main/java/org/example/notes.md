select MAX(salary) as second_hightest_salary
from Employee
where salary < (select MAX(salary) from Employee);