package repositories;


import java.util.List;

public interface Repository<T> {
    void save(T t);
    T findById(Long id);
    void delete(Long id);
    List<T> findAll();
}
