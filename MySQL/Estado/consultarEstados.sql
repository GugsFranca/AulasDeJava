SELECT * FROM estados
SELECT nome, sigla from `estados`

Select sigla, nome as 'Nome dos Estados' from estados where regiao = 'SuL'

SELECT nome, regiao, populacao from `estados` 
where populacao >= 10
order by populacao

SELECT nome, regiao, populacao from `estados` 
where populacao >= 10
order by populacao desc --desc é == a decrescente