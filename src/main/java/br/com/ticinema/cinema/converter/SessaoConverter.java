package br.com.ticinema.cinema.converter;

import br.com.ticinema.cinema.DTO.SalaDTO;
import br.com.ticinema.cinema.DTO.SessaoDTO;
import br.com.ticinema.cinema.core.CrudConverter;
import br.com.ticinema.cinema.domain.Sessao;
import org.springframework.stereotype.Component;

@Component
public class SessaoConverter implements CrudConverter<Sessao, SessaoDTO> {
    @Override
    public SessaoDTO entidadeParaDTO(Sessao entidade) {
        var dto = new SessaoDTO();

        dto.setIdsessao(entidade.getIdsessao());
        dto.setHorario(entidade.getHorario());
        dto.setDisponivel(entidade.getDisponivel());
        dto.setIngresso(entidade.getIngressos());

        return dto;
    }

    @Override
    public Sessao dtoParaEntidade(SessaoDTO dto) {
        var sessao = new Sessao();

        sessao.setIdsessao(dto.getIdsessao());
        sessao.setHorario(dto.getHorario());
        sessao.setDisponivel(dto.getDisponivel());
        sessao.setIngressos(dto.getIngresso());

        return sessao;
    }
}
