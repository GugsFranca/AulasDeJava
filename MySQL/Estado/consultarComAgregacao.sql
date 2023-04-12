select 
    regiao as 'Região',
    sum(populacao) as Total 
    from `estados`
    GROUP BY regiao
    order by Total desc

 select 
    sum(populacao) as Total 
    from `estados`


 select 
    regiao as Cringe,
    avg(populacao) as Total 
    from `estados`
    GROUP BY regiao
