create schema filmeangular
CREATE TABLE filmeangular.filme(
   imdbID     VARCHAR(9) NOT NULL PRIMARY KEY
  ,Title      VARCHAR(100) NOT NULL
  ,Year       VARCHAR(40)  NULL
  ,Rated      VARCHAR(50)  NULL
  ,Released   VARCHAR(100) NULL
  ,Runtime    VARCHAR(20) NULL
  ,Genre      VARCHAR(100)  NULL
  ,Director   VARCHAR(100)  NULL
  ,Writer     VARCHAR(1000)  NULL
  ,Actors     VARCHAR(200)  NULL
  ,Plot       VARCHAR(1000)  NULL
  ,Language   VARCHAR(200)  NULL
  ,Country    VARCHAR(50)  NULL
  ,Awards     VARCHAR(100)  NULL
  ,Poster     VARCHAR(300)  NULL
  ,Metascore  VARCHAR(5)   NULL
  ,imdbRating VARCHAR(30)  NULL
  ,imdbVotes  VARCHAR(20)  NULL
  ,Type       VARCHAR(20)  NULL
  ,DVD        VARCHAR(80)   NULL
  ,BoxOffice  VARCHAR(40)  NULL
  ,Production VARCHAR(40)  NULL
  ,Website    VARCHAR(100)  NULL
  ,Response   VARCHAR(10)  NULL
);
CREATE TABLE filmeangular.usuario (
	id serial primary key,
	nome varchar(200) not null,
	usuario varchar(50) not null,
	email varchar(200) not null,
	senha varchar(50) not null);
CREATE TABLE filmeangular.recomendacoes (
	id serial primary key,
	hora timestamp(0) not null,
	texto varchar(2000) null,
	id_usuario integer not null,
	imdbid_filme varchar(10) null,
	constraint fk_usr foreign key (id_usuario) references filmeangular.usuario (id),
	constraint fk_filme foreign key (imdbid_filme) references filmeangular.filme (imdbid));

kkkk


select * from filmeangular.filme where lower(title) like '%venga%'



create table filmeangular.search (
	id serial primary key,
	title varchar(200) not null,
	year varchar(20) null,
	type varchar(40) null,
	poster varchar(300) null,
	imdbid varchar(10) not null);

create table filmeangular.comentario (
	id serial primary key,
	texto varchar(2000) null,
	hora timestamp(0) not null,
	id_usuario integer null,
	imdbid_filme varchar(15) not null,
	constraint fk_comentario_usuario foreign key (id_usuario) references filmeangular.usuario (id),
	constraint fk_id_filme foreign key (imdbid_filme) references filmeangular.filme (imdbID));

Select * FROM filmeangular.comentario WHERE imdbid_filme = 'tt1436480'