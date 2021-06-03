package service;

public interface IGeneralService<T> {
    // by default, all methods are public abstract
    void add(T t); // abstract or non-abstract
    Iterable<T> findAll(); // public or protected
    void delete(Long id);
}
