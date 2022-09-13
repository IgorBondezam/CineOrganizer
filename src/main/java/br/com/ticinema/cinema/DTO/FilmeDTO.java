package br.com.ticinema.cinema.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmeDTO {
    private Long idfilme;

    private String nomefilme;
    private String genero;
    private String classificacao;
}
