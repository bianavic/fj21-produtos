insert into categoria (nome) values ('Informática');
insert into categoria (nome) values ('Smartphone');
insert into categoria (nome) values ('Automóvel');

insert into marca (nome) values ('APPLE');
insert into marca (nome) values ('SAMSUNG');

insert into marca (nome) values ('FIAT');
insert into marca (nome) values ('GM');
insert into marca (nome) values ('VOLKSWAGEN');
insert into marca (nome) values ('FORD');

insert into produto (marca_id, categoria_id, preco, nome) values (1, 1, 20000, 'MacBook Pro');
insert into produto (marca_id, categoria_id, preco, nome) values (1, 1, 15000, 'MacBook Air');
insert into produto (marca_id, categoria_id, preco, nome) values (1, 2, 12000, 'Iphone 12');

insert into produto (marca_id, categoria_id, preco, nome) values (2, 2, 6000, 'Galaxy Note 10');
insert into produto (marca_id, categoria_id, preco, nome) values (2, 2, 5500, 'Galaxy S20');

insert into produto (marca_id, categoria_id, preco, nome) values (3, 3, 25000, 'Uno'); -- FIAT
insert into produto (marca_id, categoria_id, preco, nome) values (3, 3, 40000, 'Palio'); -- FIAT
insert into produto (marca_id, categoria_id, preco, nome) values (3, 3, 35000, 'Mobi'); -- FIAT
insert into produto (marca_id, categoria_id, preco, nome) values (3, 3, 15000, 'Stilo'); -- FIAT

insert into produto (marca_id, categoria_id, preco, nome) values (4, 3, 60000, 'Ônix'); -- GM
insert into produto (marca_id, categoria_id, preco, nome) values (4, 3, 100000, 'Cruze'); -- GM
insert into produto (marca_id, categoria_id, preco, nome) values (4, 3, 20000, 'Celta'); -- GM

insert into produto (marca_id, categoria_id, preco, nome) values (5, 3, 37000, 'Gol'); -- VOLKS
insert into produto (marca_id, categoria_id, preco, nome) values (5, 3, 86000, 'Golf'); -- VOLKS
insert into produto (marca_id, categoria_id, preco, nome) values (5, 3, 74000, 'Polo'); -- VOLKS
insert into produto (marca_id, categoria_id, preco, nome) values (5, 3, 11000, 'Jetta'); -- VOLKS

insert into produto (marca_id, categoria_id, preco, nome) values (6, 3, 64000, 'Fiesta'); -- FORD
insert into produto (marca_id, categoria_id, preco, nome) values (6, 3, 89000, 'Focus'); -- FORD
insert into produto (marca_id, categoria_id, preco, nome) values (6, 3, 120000, 'Fusion'); -- FORD
insert into produto (marca_id, categoria_id, preco, nome) values (6, 3, 53000, 'Ka'); -- FORD