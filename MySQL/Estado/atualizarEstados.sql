update estados set nome = 'Maranhão' where sigla = 'MA'
Select nome, sigla from `estados` where sigla = "MA"

UPDATE `estados` SET nome = "Alagoas" where sigla = "AL"

update `estados`set nome = "Paraná", populacao = 11.32 where sigla = 'PR'
    SELECT est.nome, est.sigla, populacao 
    FROM estados est 
    WHERE sigla = "PR"