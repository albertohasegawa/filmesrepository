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
	senha varchar(50) not null,
	





select * from filmeangular.filme where lower(title) like '%venga%'


