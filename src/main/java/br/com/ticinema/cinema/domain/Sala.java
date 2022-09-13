package br.com.ticinema.cinema.domain;

import br.com.ticinema.cinema.core.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sala implements CrudDomain<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsala;

    private String nome;
    private Integer capacidadesala;

    @Override
    public Long getId() {
        return idsala;
    }
}
