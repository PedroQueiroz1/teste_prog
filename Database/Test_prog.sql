#a) Selecione o nome dos usuários que não possuem telefone.
SELECT u.nome
FROM Usuario as u
LEFT JOIN Telefone as t ON t.id_usuario=u.id
WHERE t.numero IS NULL;


#b) Selecione o nome de todos os caminhoneiros do Rio de Janeiro.
SELECT u.nome
FROM Usuario AS u
JOIN Telefone AS t ON t.id_usuario=u.id
WHERE t.ddd=21;


#c) Selecione o nome dos cargos que possuem mais de 2 funcionários e ordene de forma decrescente.
SELECT c.nome
FROM Cargo AS c
JOIN Usuario AS u ON c.id=u.id_cargo
GROUP BY u.id_cargo
HAVING COUNT(u.id_cargo)>2
ORDER BY c.nome DESC;
