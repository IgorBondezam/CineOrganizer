package br.com.ticinema.cinema.controller;

import br.com.ticinema.cinema.DTO.ClienteDTO;
import br.com.ticinema.cinema.DTO.IngressoDTO;
import br.com.ticinema.cinema.core.CrudController;
import br.com.ticinema.cinema.core.CrudRepository;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, ClienteDTO, Long> {



    public ClienteRepository getRepository(){return (ClienteRepository) repository;}

    @GetMapping("/semLoop")
    public ResponseEntity<List<ClienteDTO>> listaDto() {
        var clientes = getRepository().findAll();

        var clientesDTO =clientes.stream()
                .map(c -> new ClienteDTO(c.getIdcliente(),
                        c.getEmail(),
                        c.getNome(),
                        c.getIngressos().stream().map(i -> new IngressoDTO(i.getIdingresso(), i.getValor(),
                                        i.getQuantidade(), i.getSessao()))
                                .collect(Collectors.toList())
                )).collect(Collectors.toList());
        return ResponseEntity.ok(clientesDTO);
    }
}
