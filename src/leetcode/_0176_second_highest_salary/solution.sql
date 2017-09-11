SELECT CASE 
           WHEN MAX(Salary) = MIN(Salary) THEN NULL
           ELSE MIN(Salary)
       END AS SecondHighestSalary
  FROM (
    SELECT ID, Salary
      FROM Employee
    UNION ALL
    SELECT '0', null
     ORDER BY Salary DESC
     LIMIT 2
  ) AS E
