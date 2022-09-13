package br.com.ticinema.cinema.repository;

import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Ingresso;
import org.springframework.stereotype.Repository;

@Repository
public interface IngressoRepository extends CrudRepository<Ingresso, Long> {
}
