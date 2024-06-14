
CREATE TABLE IF NOT EXISTS RESTAURANTE (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    estrelas INT NOT NULL,
    faixa_preco VARCHAR(50),
    detalhes TEXT
);

INSERT INTO RESTAURANTE (nome, estrelas, faixa_preco, detalhes) 
VALUES 
    ('Enogastro Bistrô', 5, 'R$ 70 - R$ 99', 'Detalhes sobre o Enogastro Bistrô'),
    ('La Pizzaria', 4, 'R$ 30 - R$ 59', 'Detalhes sobre o La Pizzaria'),
    ('Churrascaria do Gaúcho', 5, 'R$ 100 - R$ 150', 'Detalhes sobre o Churrascaria do Gaúcho'),
    ('Cantina Italiana', 3, 'R$ 40 - R$ 70', 'Detalhes sobre o Cantina Italiana'),
    ('Burguer House', 4, 'R$ 20 - R$ 50', 'Detalhes sobre o Burguer House');
