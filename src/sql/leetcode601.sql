select distinct b.* from stadium a,stadium b,stadium c
where ((b.id=a.id+1 and b.id=c.id-1) or (b.id=a.id-1 and b.id=c.id-2) or (b.id=a.id+1 and b.id=c.id+2))
and b.people>=100 and c.people>=100 and a.people>=100 order by b.id;