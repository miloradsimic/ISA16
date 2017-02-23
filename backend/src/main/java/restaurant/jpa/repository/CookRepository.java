package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Cook;

public interface CookRepository extends CrudRepository<Cook, Long>, QueryDslPredicateExecutor<Cook>{

}
