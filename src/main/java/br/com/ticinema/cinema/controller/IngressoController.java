package br.com.ticinema.cinema.controller;

import br.com.ticinema.cinema.DTO.IngressoDTO;
import br.com.ticinema.cinema.core.CrudController;
import br.com.ticinema.cinema.domain.Ingresso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ingresso")
public class IngressoController extends CrudController<Ingresso, IngressoDTO, Long> {
}
