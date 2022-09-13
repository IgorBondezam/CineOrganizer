package br.com.ticinema.cinema.DTO;

import br.com.ticinema.cinema.domain.Sessao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngressoDTO {
    private Long idingresso;
    private Float valor;
    private Integer quantidade;
    private Long clienteId;
    private ClienteDTO clienteDTO;
    private Long sessaoId;
    private SessaoDTO sessaoDTO;

    @Deprecated
    private Sessao sessao;

    public IngressoDTO(Long idingresso, Float valor, Integer quantidade, Sessao sessao) {
        this.idingresso = idingresso;
        this.valor = valor;
        this.quantidade = quantidade;
        this.sessao = sessao;
    }
}
