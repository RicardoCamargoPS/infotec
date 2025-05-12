create database infotec;
use infotec;
create table usuarios(
cod_user int primary key,
usuario varchar(20)not null unique,
senha varchar(10) not null
);

describe usuarios;

insert into usuarios(cod_user, usuario,senha)
values(1,'Admin','135796');

select * from usuarios;