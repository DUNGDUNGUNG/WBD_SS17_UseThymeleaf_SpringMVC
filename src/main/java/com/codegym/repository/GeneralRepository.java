package com.codegym.repository;

import java.util.List;

public interface GeneralRepository<T> {
    List<T> findAll();

    void save(T customer);

    void update(int id, T customer);

    T findById(int id);

    void remove(int id);

}
