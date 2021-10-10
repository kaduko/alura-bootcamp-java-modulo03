create table autores(
	id bigint not null auto_increment,
	nome varchar(255) not null,
	email varchar(255) not null,
	datanascimento date not null,
	minicurriculo varchar (500) not null,
	primary key (id)
);