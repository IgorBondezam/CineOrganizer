package br.com.ticinema.cinema.controller;

import br.com.ticinema.cinema.DTO.SessaoDTO;
import br.com.ticinema.cinema.core.CrudController;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.domain.Sessao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sessao")
public class SessaoController extends CrudController<Sessao, SessaoDTO, Long> {
}
