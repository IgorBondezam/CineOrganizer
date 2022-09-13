package br.com.ticinema.cinema.service;

import br.com.ticinema.cinema.core.CrudService;
import br.com.ticinema.cinema.domain.Sessao;
import org.springframework.stereotype.Service;

@Service
public class SessaoService extends CrudService<Sessao, Long> {
    @Override
    protected Sessao editarEntidade(Sessao recuperado, Sessao entidade) {

        recuperado.setIdsessao(entidade.getIdsessao());
        recuperado.setDisponivel(entidade.getDisponivel());
        recuperado.setHorario(entidade.getHorario());
        recuperado.setIngressos(entidade.getIngressos());

        return recuperado;
    }
}
