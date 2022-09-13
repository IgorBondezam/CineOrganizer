package br.com.ticinema.cinema.repository;

import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Sala;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends CrudRepository<Sala, Long> {
}
