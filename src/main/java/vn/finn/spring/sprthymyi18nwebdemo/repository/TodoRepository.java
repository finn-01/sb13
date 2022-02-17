package vn.finn.spring.sprthymyi18nwebdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.finn.spring.sprthymyi18nwebdemo.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
