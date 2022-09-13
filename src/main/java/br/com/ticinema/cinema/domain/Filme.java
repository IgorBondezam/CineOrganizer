package br.com.ticinema.cinema.domain;

import br.com.ticinema.cinema.core.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Filme implements CrudDomain<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idfilme;

    private String nomefilme;
    private String genero;
    private String classificacao;













    @Override
    public Long getId() {
        return idfilme;
    }
}
