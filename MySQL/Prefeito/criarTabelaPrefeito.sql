CREATE TABLE prefeitos(
    id int unsigned not null Auto_increment PRIMARY KEY,
    nome VARCHAR(255) not null ,
    cidade_id int unsigned,
    UNIQUE KEY(cidade_id),
    FOREIGN KEY (cidade_id) REFERENCES cidades (id)
)

select *  from prefeitos