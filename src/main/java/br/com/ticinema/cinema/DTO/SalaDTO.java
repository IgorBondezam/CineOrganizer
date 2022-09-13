package br.com.ticinema.cinema.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SalaDTO {

    private Long idsala;

    private String nome;
    private Integer capacidadeSala;
}
