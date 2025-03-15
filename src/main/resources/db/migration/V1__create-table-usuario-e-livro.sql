CREATE TABLE usuarios (
    usuario_id BIGSERIAL NOT NULL,
    nome VARCHAR(255) NOT NULL,
    PRIMARY KEY (usuario_id)
);

CREATE TABLE livros (
    livro_id BIGSERIAL NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    is_available BOOLEAN NOT NULL,
    PRIMARY KEY (livro_id)
);