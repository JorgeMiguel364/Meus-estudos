-- 1
INSERT INTO PRODUTORA
VALUES('A','Produtora1','Rua 1',1,,'Centro',11111111,'Americana','SP');

/*
    <CTRL>S - PBD220601_T02_>
*/

-- 2
INSERT INTO PRODUTORA
VALUES('A','Produtora1','Rua 1',1,NULL,'Centro',11111111,'Americana','SP');

-- 3
INSERT INTO PRODUTORA
VALUES(1,'Produtora1','Rua 1',1,NULL,'Centro',11111111,'Americana','SP');
COMMIT;
SELECT * FROM Produtora;

-- 4
INSERT INTO PRODUTORA
VALUES(1,'Produtora1',NULL,1,NULL,'Centro',11111111,'Americana','SP');

-- 5
INSERT INTO PRODUTORA
VALUES(1,'Produtora1','Rua 1',1,NULL,'Centro',11111111,'Americana','SP');
-- ERRO! Repetição de inserção.

-- 6
INSERT INTO PRODUTORA
VALUES(2,'Produtora2','Rua 2',2,NULL,'Centro',22222222,'Americana','SP');
COMMIT;
SELECT * FROM Produtora;

-- 7: Insira outra produtora, porém de outra cidade e estado
INSERT INTO PRODUTORA
VALUES(3,'Miguel Produtora','Rua das flores',189,NULL,'Centro',821743,'Conchas','SC');
COMMIT;
SELECT * FROM Produtora;

-- 8: Mostrar somente de SP
SELECT * FROM Produtora WHERE estado = 'SP';

-- 9: Corrigir a cidade da Produtora2 para Piracicaba
UPDATE PRODUTORA SET cidade = 'Piracicaba' WHERE id_produtora = 2;
COMMIT;
SELECT * FROM Produtora;

-- 10: Atualizando sem WHERE! ◄ PERIGO!
UPDATE PRODUTORA SET cidade = 'Piracicaba';
SELECT * FROM PRODUTORA;

ROLLBACK;
SELECT * FROM PRODUTORA;

-- 11: Mostrar os que não são de SP
SELECT * FROM PRODUTORA WHERE estado <> 'SP';

-- 12: Remover todos que não são de SP
DELETE FROM Produtora; -- ERRO! Apaga TODOS!
SELECT * FROM PRODUTORA;
-- Execute depois...
ROLLBACK;

-- CORRETO
DELETE FROM PRODUTORA WHERE estado <> 'SP';
SELECT * FROM PRODUTORA;

-- 13: Conforme DER, modelo lógico, crie a tabela Fone e insira 2 telefones para a Produtora 2
CREATE TABLE Fone(
    id_produtora smallint,
    sequencia smallint,
    ddd smallint,
    numero varchar(09),
    CONSTRAINT PK_Fone PRIMARY KEY (id_produtora, sequencia),
    CONSTRAINT FK_FoneProdutora FOREIGN KEY (id_produtora)
    REFERENCES Produtora (id_produtora)
    ON UPDATE cascade
    ON DELETE cascade
);
COMMIT;

-- 13b: Inserir telefones
INSERT INTO Fone VALUES(3,1,11,'123456789'); -- Erro! Não existe produtora 3

INSERT INTO Fone VALUES(1,1,11,'123456789');
INSERT INTO Fone VALUES(1,2,11,'123456789');
COMMIT;
SELECT * FROM Fone;

-- 14: Alterar a produtora 1 para id = 10
UPDATE Produtora SET id_produtora = 10 Where id_produtora = 1;
SELECT * FROM Produtora;
SELECT * FROM Fone











