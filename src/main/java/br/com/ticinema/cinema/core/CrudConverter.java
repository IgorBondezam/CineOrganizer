package br.com.ticinema.cinema.core;

public interface CrudConverter<T, D> {

    D entidadeParaDTO(T entidade);

    T dtoParaEntidade(D dto);

}
