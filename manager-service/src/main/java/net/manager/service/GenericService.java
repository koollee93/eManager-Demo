package net.manager.service;

import net.manager.model.Identifiable;

import java.util.List;
import java.util.Optional;

public interface GenericService<T extends Identifiable> {

    void delete(T entity);

    Optional<T> findById(Long id);

    Long save(T entity);

    void save(List<T> entities);

    void saveOrUpdate(T entity);

    void update(T entity);

    List<T> getAll();
}
