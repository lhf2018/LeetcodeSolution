# Write your MySQL query statement below
select b.Id from Weather a left join Weather b on datediff(b.RecordDate,a.RecordDate)=1
where b.Temperature>a.Temperature