package com.flz.utils;

import java.util.List;
import java.util.Optional;

public interface IService<T,ID> {

    public T save(T t);
    public Iterable<T> saveAll(Iterable<T> t);
    public T update(T t);
    public void delete(T t);
    public void deleteById(ID id);
    public Optional<T> findById(ID id);
    public List<T> findAll();
}
