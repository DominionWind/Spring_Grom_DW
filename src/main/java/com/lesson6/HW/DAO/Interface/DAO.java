package com.lesson6.HW.DAO.Interface;

public interface DAO<T> {
    T save(T t);
    T update(T t);
    void delete (Long id);
    T findById(Long id);
}
