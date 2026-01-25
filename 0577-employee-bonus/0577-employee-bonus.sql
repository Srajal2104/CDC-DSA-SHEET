# Write your MySQL query statement below
SELECT e.name,b.bonus
FROM Employee AS e
LEFT JOIN Bonus AS b
ON e.empId=b.empId
WHERE b.Bonus<1000 OR b.Bonus IS NULL;