package br.com.ticinema.cinema.repository;

import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Sessao;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepository extends CrudRepository<Sessao, Long> {
}
