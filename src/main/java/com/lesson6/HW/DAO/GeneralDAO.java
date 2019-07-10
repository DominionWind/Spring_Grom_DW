package com.lesson6.HW.DAO;

import com.lesson6.HW.DAO.Interface.DAO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class GeneralDAO<T> implements DAO<T> {

    private Class<T> clazz;
    final void setClass( Class<T> clazz ){
        this.clazz = clazz;
    }

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public T save(T t) {
        entityManager.persist(t);
        return t;
    }

    @Override
    public T update(T t) {
        entityManager.merge(t);
        return t;
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(findById(id));
    }

    @Override
    public T findById(Long id) {
        return entityManager.find(clazz, id);
    }
}
