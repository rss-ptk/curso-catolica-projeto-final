INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (1, 'Autom�veis', 'An�ncios de carros, motos, pe�as e acess�rios', NULL, 'automoveis');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (2, 'Carros', 'An�ncios de carros novos e usados', 1, 'carros');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (3, 'Motos', 'An�ncios de motocicletas novas e usadas', 1, 'motos');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (4, 'Pe�as e Acess�rios', 'An�ncios de pe�as e acessorios para carros e motos', 1, 'pecas-e-acessorios-para-carros-e-motos');

INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (5, 'Im�veis', 'An�ncios de casas e apartamentos para venda ou loca��o', NULL, 'imoveis');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (6, 'Venda', 'An�ncios de casas e apartamentos a venda', 5, 'imoveis-a-venda');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (7, 'Aluguel', 'An�ncios de casas e apartamentos para loca��o', 5, 'imoveis-para-locacao');

INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (8, 'Eletr�nicos', 'An�ncios de celulares, tablets, TVs, computadores', NULL, 'eletronicos');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (9, 'Celulares', 'An�ncios de celulares, iphone, samsung, xiaomi e outras marcas', 8, 'celulares');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (10, 'Computadores', 'An�ncios de PC gamer e acess�rios', 8, 'computadores-e-acessorios');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (11, 'Audio, TV e Fotografia', 'An�ncios de TVs 4K, home theater e c�meras fotogr�ficas', 8, 'audio-tv-e-fotografia');

INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (12, 'Moda', 'An�ncios de roupas e cal�ados', NULL, 'moda-e-acessorios');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (13, 'Roupas', 'An�ncios de roupas masculunas e femininas, adulto e infantil', 12, 'roupas');
INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (14, 'Cal�ados', 'An�ncios de cal�ados masculinos e femininos, adulto e infantil', 12, 'calcados');

INSERT INTO categorias (id, nome, descricao, categoria_pai_id, url) values (15, 'Outros', 'outras categorias', NULL, 'outros-anuncios');


INSERT INTO usuarios (id, nome, email, senha, telefone) values (1, 'RODRIGO', 'rodrigo@mail.com', 'minhaSenha@forte2', '47 9 9988-7766');


INSERT INTO anuncios (titulo, descricao, valor, localizacao, categoria, destaque, usuario_id) values ('Bicileta masculina', 'semi nova, ainda na garantia', 200.00, 'Blumenau', 3, 0, 1);
INSERT INTO anuncios (titulo, descricao, valor, localizacao, categoria, destaque, usuario_id) values ('Radio positron usb/sd/aux', 'Radio positron usb/sd/aux', 110.00, 'iririu', 3, 1, 1);
INSERT INTO anuncios (titulo, descricao, valor, localizacao, categoria, destaque, usuario_id) values ('Teclado USB', 'Teclado USB', 15.00, 'iririu', 3, 1, 1);