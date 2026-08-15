# Write your MySQL query statement below
select u.name, SUM(t.amount) as balance from Users u join Transactions t on u.account =t.account group by u.account,u.name having SUM(amount)>10000;