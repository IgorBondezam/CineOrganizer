package br.com.ticinema.cinema.service;

import br.com.ticinema.cinema.core.CrudService;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.domain.Sala;
import org.springframework.stereotype.Service;

@Service
public class SalaService extends CrudService<Sala, Long> {
    @Override
    protected Sala editarEntidade(Sala recuperado, Sala entidade) {

        recuperado.setIdsala(entidade.getIdsala());
        recuperado.setCapacidadesala(entidade.getCapacidadesala());
        recuperado.setNome(entidade.getNome());


        return recuperado;
    }
}
