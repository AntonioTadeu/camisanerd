CREATE TABLE produto(
                        id                     INT NOT NULL,
                        nome                   VARCHAR(120) NOT NULL,
                        descricao              VARCHAR(200) NOT NULL,
                        preco                  FLOAT NOT NULL
                        fotoUrl                VARCHAR(600),
                        dataCadastro           DATE NOT NULL,
                        dataUltimaAtualizacao  TIMESTAMP NOT NULL,
);