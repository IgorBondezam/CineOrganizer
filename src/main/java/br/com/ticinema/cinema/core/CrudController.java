package br.com.ticinema.cinema.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

public abstract class CrudController<T extends CrudDomain<ID> , D, ID> extends ReadController<T, D, ID> {


    @PostMapping
    public ResponseEntity<D> criar(@RequestBody D dto){

        var entidade = converter.dtoParaEntidade(dto);
        var salvo = service.criar(entidade);

        ServletUriComponentsBuilder builder = ServletUriComponentsBuilder.fromCurrentRequest();

        var uri = builder.path("/{id}").buildAndExpand(salvo.getId()).toUri();

        return ResponseEntity.created(uri).body(converter.entidadeParaDTO(salvo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<D> editar(@PathVariable("id") ID id, @RequestBody D dto){

        var NovaEntidade = converter.dtoParaEntidade(dto);
        var salvo = service.editar(id, NovaEntidade);

        return ResponseEntity.ok(converter.entidadeParaDTO(salvo));

    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(@PathVariable("id") ID id){
        service.excluir(id);
        return  ResponseEntity.noContent().build();
    }



}
