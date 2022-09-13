package br.com.ticinema.cinema.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ClienteDTO {

    private Long idcliente;
    private String email;
    private String nome;
    private String senha;
    private List<IngressoDTO> ingresso;

    public ClienteDTO(Long idcliente, String email, String nome, List<IngressoDTO> ingresso) {
        this.idcliente = idcliente;
        this.email = email;
        this.nome = nome;
        this.ingresso = ingresso;
    }
}
