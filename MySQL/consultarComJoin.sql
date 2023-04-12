select * from estados e , cidades c
where e.id = c.estado_id;

select e.nome, c.nome, regiao from estados e , cidades c
where e.id = c.estado_id;

select 
    c.nome as Cidades, 
    e.nome as Estados, 
    regiao
from estados e, cidades c
where e.id = c.estado_id;

select 
    c.nome as Cidades,
    e.nome as Estados,
    regiao as Região
    from estados e 
    INNER JOIN cidades c on e.id = c.estado_id 

SELECT e.nome, c.nome, regiao FROM estados e LEFT OUTER JOIN cidades C on e.id = c.estado_id
SELECT e.nome, c.nome, regiao FROM estados e RIGHT JOIN cidades C on e.id = c.estado_id --O OUTER não é necessário em nenhum dos dois só é legal
-- FULL OUTER JOIN não funciona no MySQL bruh
--Union funciona como um Full Join
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union 
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

