package br.com.ticinema.cinema.converter;

import br.com.ticinema.cinema.DTO.ClienteDTO;
import br.com.ticinema.cinema.core.CrudConverter;
import br.com.ticinema.cinema.domain.Cliente;
import br.com.ticinema.cinema.domain.Ingresso;
import br.com.ticinema.cinema.repository.ClienteRepository;
import br.com.ticinema.cinema.repository.IngressoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClienteConverter implements CrudConverter<Cliente, ClienteDTO>  {



    @Override
    public ClienteDTO entidadeParaDTO(Cliente entidade) {
        var dto = new ClienteDTO();
        dto.setIdcliente(entidade.getIdcliente());
        dto.setEmail(entidade.getEmail());
        dto.setNome(entidade.getNome());


        return dto;
    }

    @Override
    public Cliente dtoParaEntidade(ClienteDTO dto) {
        var cliente = new Cliente();

        cliente.setIdcliente(dto.getIdcliente());
        cliente.setNome(dto.getNome());
        cliente.setSenha(dto.getSenha());
        cliente.setEmail(dto.getEmail());


        return cliente;
    }
}
