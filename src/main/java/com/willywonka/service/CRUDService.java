package com.willywonka.service;

import java.util.List;

public interface CRUDService<T> {
    List<T> listar();
    void salvar(T entidade);
    void excluir(int id);
    T buscarPorId(int id);
}
