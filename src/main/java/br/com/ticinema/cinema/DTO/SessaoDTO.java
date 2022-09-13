package br.com.ticinema.cinema.DTO;

import br.com.ticinema.cinema.domain.Ingresso;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessaoDTO {

    private Long idsessao;

    private LocalDate horario;
    private Boolean disponivel;
    private List<Ingresso> ingresso;
}
