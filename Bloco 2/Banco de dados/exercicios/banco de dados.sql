CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;
CREATE TABLE tb_classes (
id bigint auto_increment,
classe varchar(255) not null,
armas varchar(255),
primary key(id)
);
CREATE table tb_personagem(
id Bigint auto_increment,
nome varchar(255) Not Null,
origem varchar(255),
poder_ataque int,
poder _defessa int,
classe bigint,
primary key (id),
foreign key (id)classe






