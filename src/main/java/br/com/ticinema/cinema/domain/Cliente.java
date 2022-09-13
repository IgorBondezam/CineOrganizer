package br.com.ticinema.cinema.domain;

import br.com.ticinema.cinema.core.CrudDomain;
import liquibase.license.LicenseService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente implements CrudDomain<Long>, Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcliente;

    private String email;
    private String senha;
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private List<Ingresso> ingressos = new ArrayList<>();


    @Override
    public Long getId() {
        return idcliente;
    }
}
