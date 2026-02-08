# Write your MySQL query statement below
SELECT e.name
FROM Employee e
INNER JOIN Employee AS p 
ON e.id=p.managerId
GROUP BY p.managerId
HAVING COUNT(p.managerId)>=5;