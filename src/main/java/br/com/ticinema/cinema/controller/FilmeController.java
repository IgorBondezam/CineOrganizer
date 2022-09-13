package br.com.ticinema.cinema.controller;

import br.com.ticinema.cinema.DTO.FilmeDTO;
import br.com.ticinema.cinema.core.CrudController;

import br.com.ticinema.cinema.domain.Filme;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeController extends CrudController<Filme, FilmeDTO, Long> {
}
