# Write your MySQL query statement bel
SELECT employee_id,
    (
        if ( mod(employee_id, 2) =1 AND name not like'm%',
            salary, 0 ) ) AS BONUS
    FROM Employees
    ORDER BY employee_id ASC;
