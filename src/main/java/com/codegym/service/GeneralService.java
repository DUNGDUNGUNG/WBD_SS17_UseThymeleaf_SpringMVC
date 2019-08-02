package com.codegym.service;

import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();

    void save(T customer);

    void update(int id, T customer);

    T findById(int id);

    void remove(int id);

}
