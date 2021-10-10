create table livros(
	id bigint not null auto_increment,
	titulo varchar(255) not null,
	datalancamento date not null,
	quantidadepaginas varchar (500) not null,
	autor_id bigint, 
	primary key (id),
	foreign key (autor_id) references autores(id)
);