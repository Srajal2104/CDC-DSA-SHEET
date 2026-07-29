# Write your MySQL query statement below
SELECT name 
FROM SalesPerson S
WHERE sales_id NOT IN(
    SELECT O.sales_id
    FROM Company C
    JOIN Orders O
    ON C.com_id=O.com_id
    WHERE C.name='RED'
);