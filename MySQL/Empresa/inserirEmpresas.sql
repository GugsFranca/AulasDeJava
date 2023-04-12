ALTER TABLE empresas MODIFY cnpj VARCHAR(14);

insert into empresas(nome, cnpj)
values("Bradesco", 90001620000138),
    ("VAle", 28125361000183),
    ("Cielo", 99918522000134);


desc empresas
desc prefeitos

select * from empresas;
select * from empresa_unidades
select * from cidades

insert into empresa_unidades(empresa_id, cidade_id, sede)
values (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);
    
select e.nome,c.nome from empresas e INNER join cidades c 