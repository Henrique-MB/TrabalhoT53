create database db_dadosalunos;
use db_dadosalunos;

-- Criando tabela
create table tb_dadosalunos(
id BIGINT AUTO_increment,
nome varchar(255) not null,
idade int not null,
turma varchar(255),
matricula int not null,
nota decimal not null,
primary Key (id)
);

insert into tb_dadosalunos( nome,idade,setor,matricula,nota)
values("Ricardo",10,"Quarta serie A",001,6.5);

-- mostrndo dados
select * from tb_dadosalunos;

-- inserindo dados
insert into tb_funcionarios( nome,idade,setor,matricula,nota)
values("João",10,"Quarta serie A",002,8.0),
("Ana",10,"Quarta Serie A",003,7),
("Maria",11,"Quarta Serie A",004,10),
("Mario",10,"Quarta Serie A",005,5.0);

select nome,salario from tb_funcionarios
where salario < 7;

select nome,sal ario from tb_funcionarios
where salario > 7;
