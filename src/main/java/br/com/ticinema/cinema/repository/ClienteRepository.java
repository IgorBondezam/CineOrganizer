package br.com.ticinema.cinema.repository;

import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
