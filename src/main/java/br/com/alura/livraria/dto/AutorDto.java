package br.com.alura.livraria.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorDto {
	private int id;
	private String nome;
	private String email;
	private LocalDate datanascimento;
	private String minicurriculo;		

}
