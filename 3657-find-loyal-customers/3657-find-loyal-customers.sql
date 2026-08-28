# Write your MySQL query statement below
SELECT customer_id
FROM customer_transactions
GROUP BY customer_id
HAVING SUM(transaction_type='purchase') > 2 AND
DATEDIFF(MAX(transaction_date),MIN(transaction_date)) > 29 AND
SUM(transaction_type='refund')/COUNT(*) < 0.2
ORDER BY 1