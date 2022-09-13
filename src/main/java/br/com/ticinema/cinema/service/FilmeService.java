package br.com.ticinema.cinema.service;

import br.com.ticinema.cinema.core.CrudService;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.domain.Filme;
import org.springframework.stereotype.Service;

@Service
public class FilmeService extends CrudService<Filme, Long> {
    @Override
    protected Filme editarEntidade(Filme recuperado, Filme entidade) {

        recuperado.setIdfilme(entidade.getIdfilme());
        recuperado.setNomefilme(entidade.getNomefilme());
        recuperado.setClassificacao(entidade.getClassificacao());
        recuperado.setGenero(entidade.getGenero());

        return recuperado;
    }
}
