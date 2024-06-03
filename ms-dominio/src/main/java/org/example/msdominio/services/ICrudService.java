package org.example.msdominio.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICrudService<T> {

    List<T> findAll();
    Page<T> findAll(Pageable pageable);
    T findById(long id);
    T save(T t);
    T update(long id, T t);
    void delete(long id);
}
