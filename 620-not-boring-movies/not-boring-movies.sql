select * from cinema
where id&1 = 1 and description not like 'boring'
order by rating desc;