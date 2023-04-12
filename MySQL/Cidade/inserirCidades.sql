Select * from `estados` where nome = "Rio de Janeiro"

INSERT INTO `cidades`(nome, area, estado_id)
VALUES ("Campinas", 795, 29)

INSERT INTO `cidades`(nome, area, estado_id)
VALUES ("Nova Iguaçu", 521.25, 23)

INSERT INTO `cidades` (nome, area , estado_id)
VALUES("Caruaru", 920.6, (select id from estados WHERE sigla ="PE"))

insert into cidades(nome, area, estado_id)
VALUES ("Juazeiro do Norte", 28.2, (select id from estados where sigla = "CE"))

Select * from `cidades`
