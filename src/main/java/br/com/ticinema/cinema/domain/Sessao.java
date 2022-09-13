package br.com.ticinema.cinema.domain;

import br.com.ticinema.cinema.core.CrudDomain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sessao implements CrudDomain<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idsessao;

    private LocalDate horario;
    private Boolean disponivel;

    @OneToMany(mappedBy = "sessao")
    private List<Ingresso> ingressos = new ArrayList<>();

//    @OneToOne
//    @JoinColumn(name = "sala_id", referencedColumnName = "idsala")
//    private Sala sala;
//
//    @OneToOne
//    @JoinColumn(name = "filme_id", referencedColumnName = "idfilme")
//    private Filme filme;




    @Override
    public Long getId() {
        return idsessao;
    }
}
