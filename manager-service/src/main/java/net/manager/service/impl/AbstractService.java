package net.manager.service.impl;

import net.manager.dao.GenericDao;
import net.manager.model.Identifiable;
import net.manager.service.GenericService;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends Identifiable> implements GenericService<T> {

    @Override
    @Transactional
    public void delete(@NonNull T entity) {
        getEntityDao().delete(entity);
    }

    @Override
    public Optional<T> findById(@NonNull Long id) {
        return getEntityDao().findById(id);
    }

    @Override
    @Transactional
    public Long save(@NonNull T entity) {
        return getEntityDao().save(entity);
    }

    @Override
    @Transactional
    public void save(List<T> entities) {
        getEntityDao().save(entities);
    }

    @Override
    @Transactional
    public void saveOrUpdate(@NonNull T entity) {
        getEntityDao().saveOrUpdate(entity);
    }

    @Override
    @Transactional
    public void update(@NonNull T entity) {
        getEntityDao().update(entity);
    }

    @Override
    @Transactional
    public List<T> getAll() {
        return getEntityDao().getAll();
    }

    protected abstract GenericDao<T> getEntityDao();
}
