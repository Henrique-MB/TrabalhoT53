create database db_Materialesportivo;
use db_Materialesportivo;

-- criando tabela
create table tb_produtos(
id  BIGINT AUTO_increment,
produto varchar(255) not null,
marca int not null,
setor varchar(255),
matricula int not null,
preco decimal not null,
primary Key (id)
);

insert into tb_produtos( produto,marca,setor,matricula,preco)
values("Bola de Futebol",Nyke,"Futebol",001,250);

-- mostrndo dados
select * from tb_produtos;

-- inserindo dados
insert into tb_estoque( produto,marca,setor,matricula,preço)
values("chuteira","Adidas","Futebol",002,300),
("Raquete","Adidas","Tenis",003,150),
 ("Luvas de Boxe","Nyke","Boxe",004,200),
("Tacos golfe","Nyke","Golfe",005,500);

select nome,preço from tb_produtos
where salario < 500;

select nome,preço from tb_produtos
where salario > 500;


