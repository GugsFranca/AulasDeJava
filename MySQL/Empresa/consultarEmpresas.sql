SELECT e.nome Empresa, c.nome as "Cidade"
from empresas e, empresa_unidades eu, cidades C 
where e.id = eu.empresa_id and c.id = eu.cidade_id
and sede = 1