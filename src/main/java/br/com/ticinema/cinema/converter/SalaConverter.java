package br.com.ticinema.cinema.converter;

import br.com.ticinema.cinema.DTO.SalaDTO;
import br.com.ticinema.cinema.core.CrudConverter;
import br.com.ticinema.cinema.domain.Sala;
import org.springframework.stereotype.Component;

@Component
public class SalaConverter implements CrudConverter<Sala, SalaDTO> {
    @Override
    public SalaDTO entidadeParaDTO(Sala entidade) {

        var dto = new SalaDTO();

        dto.setIdsala(entidade.getIdsala());
        dto.setNome(entidade.getNome());
        dto.setCapacidadeSala(entidade.getCapacidadesala());

        return dto;
    }

    @Override
    public Sala dtoParaEntidade(SalaDTO dto) {
        var sala = new Sala();

        sala.setIdsala(dto.getIdsala());
        sala.setNome(dto.getNome());
        sala.setCapacidadesala(dto.getCapacidadeSala());

        return sala;    }
}
