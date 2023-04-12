insert into estados (id, nome,sigla,regiao,populacao)
values (50, "Ancapistão", "CR", "Sul", 0.34)

select * from `estados`

insert into `estados` (nome, sigla, regiao, populacao)
values("Comunistil", "CM", "Nordeste", 2.51)
update `estados` set id = 70 WHERE sigla = "CM"
