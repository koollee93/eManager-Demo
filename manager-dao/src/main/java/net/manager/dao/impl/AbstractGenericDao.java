package net.manager.dao.impl;

import net.manager.dao.GenericDao;
import net.manager.model.Identifiable;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public abstract class AbstractGenericDao<T extends Identifiable> implements GenericDao<T> {

    private Class<T> _entityPersistenceClass;
    @Autowired
    private SessionFactory _sessionFactory;

    public AbstractGenericDao(Class<T> entityPersistenceClass) {
        _entityPersistenceClass = entityPersistenceClass;
    }

    @Override
    public void delete(@NonNull T entity) {
        getCurrentSession().delete(entity);
    }

    @Override
    public Optional<T> findById(@NonNull Long id) {
        return Optional.ofNullable(getCurrentSession().get(getEntityPersistenceClass(), id));
    }

    @Override
    public Long save(@NonNull T entity) {
        return (Long) getCurrentSession().save(entity);
    }

    @Override
    public void save(List<T> entities) {
        for (T entity : entities) {
            getCurrentSession().save(entity);
        }
    }

    @Override
    public abstract List<T> getAll();

	@Override
    public void saveOrUpdate(@NonNull T entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void update(@NonNull T entity) {
        getCurrentSession().update(entity);
    }

    protected Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    public Class<T> getEntityPersistenceClass() {
        return _entityPersistenceClass;
    }

    private SessionFactory getSessionFactory() {
        return _sessionFactory;
    }
}
