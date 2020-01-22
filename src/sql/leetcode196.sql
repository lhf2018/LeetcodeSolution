# Write your MySQL query statement below
delete a from Person a,Person b
where a.Email=b.Email AND a.Id!=b.Id AND a.Id>b.Id