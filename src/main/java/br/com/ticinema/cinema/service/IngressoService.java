package br.com.ticinema.cinema.service;

import br.com.ticinema.cinema.core.CrudService;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.domain.Ingresso;
import org.springframework.stereotype.Service;

@Service
public class IngressoService extends CrudService<Ingresso, Long> {

    @Override
    protected Ingresso editarEntidade(Ingresso recuperado, Ingresso entidade) {
        recuperado.setIdingresso(entidade.getIdingresso());
        recuperado.setValor(entidade.getValor());
        recuperado.setQuantidade(entidade.getQuantidade());
        recuperado.setCliente(entidade.getCliente());
        recuperado.setSessao(entidade.getSessao());

        return recuperado;
    }
}
