package br.com.ticinema.cinema.repository;

import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Filme;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends CrudRepository<Filme, Long> {
}
