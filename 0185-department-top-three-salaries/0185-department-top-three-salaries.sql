# Write your MySQL query statement below
SELECT d.name AS Department,e1.name AS Employee,e1.salary AS Salary
FROM Employee e1
JOIN Department d
ON e1.departmentID=d.id
WHERE 3 > (SELECT COUNT(DISTINCT(e2.Salary))
           FROM Employee e2
           WHERE e2.Salary>e1.Salary
           AND e1.departmentId=e2.DepartmentId);