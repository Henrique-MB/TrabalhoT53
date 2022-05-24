create database db_rh;
use db_rh;

-- Criando tabela
create table tb_funcionarios(
id BIGINT AUTO_increment,
nome varchar(255) not null,
idade int not null,
setor varchar(255),
matricula int not null,
salario decimal not null,
primary Key (id)
);

insert into tb_funcionarios( nome,idade,setor,matricula,salario)
values("Ricardo",35,"Manutenção",001,1.500);

-- mostrndo dados
select * from tb_funcionarios;

-- inserindo dados
insert into tb_funcionarios( nome,idade,setor,matricula,salario)
values("João",43,"segurança",002,2000.00),
("Ana",40,"Copa",003,3000.00),
("Maria",45,"Cozinha",004,2000.30),
("Mario",50,"Eletrica",005,3000.00);

select nome,salario from tb_funcionarios
where salario < 2000;

select nome,sal ario from tb_funcionarios
where salario > 2000;




-- inserindo novo atributo salario
alter table tb_funcionarios
add Salario Decimal;

