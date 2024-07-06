insert into USUARIOS(id, username, password, role) values(100, 'ana@email.com', '$2a$12$jTxvHF6QsBkK/afxxZxYsuJFzJjPVO3zbMukZCxRg1SlcMUbsQWPu', 'ROLE_ADMIN');
insert into USUARIOS(id, username, password, role) values(101, 'bia@email.com', '$2a$12$jTxvHF6QsBkK/afxxZxYsuJFzJjPVO3zbMukZCxRg1SlcMUbsQWPu', 'ROLE_CLIENTE');
insert into USUARIOS(id, username, password, role) values(102, 'bob@email.com', '$2a$12$jTxvHF6QsBkK/afxxZxYsuJFzJjPVO3zbMukZCxRg1SlcMUbsQWPu', 'ROLE_CLIENTE');
insert into USUARIOS(id, username, password, role) values(103, 'toby@email.com', '$2a$12$jTxvHF6QsBkK/afxxZxYsuJFzJjPVO3zbMukZCxRg1SlcMUbsQWPu', 'ROLE_CLIENTE');

insert into CLIENTES(id, nome, cpf, id_usuario) values(10, 'Bianca Silva', '36852639002', 101);
insert into CLIENTES(id, nome, cpf, id_usuario) values(20, 'Roberto Gomes', '85529857051', 102);