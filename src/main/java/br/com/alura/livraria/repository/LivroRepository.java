package br.com.alura.livraria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.alura.livraria.dto.ItemLivrosPorAutorDto;
import br.com.alura.livraria.modelo.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

	@Query("select new br.com.alura.livraria.dto.ItemLivrosPorAutorDto("
			+ "a.nome, "
			+ "count(l.id), "
			+ "round((count(l.id) * 1.0 / (select count(l2.id) from Livro l2)) * 100,2)"
			+ ")"
			+ "from Livro l, Autor a "
			+ "where l.autor.id = a.id "
			+ "group by a.nome")
	List<ItemLivrosPorAutorDto> consultaResumoLivrosPorAutor();

}
