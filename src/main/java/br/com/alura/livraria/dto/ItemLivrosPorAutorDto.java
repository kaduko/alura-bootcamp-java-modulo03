package br.com.alura.livraria.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ItemLivrosPorAutorDto {
	private String autor;
	private Long quantidadeLivros;
	private Double percentual;
}
