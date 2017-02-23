package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.RatingEmployee;

public interface RatingEmployeeRepository extends CrudRepository<RatingEmployee, Long>, QueryDslPredicateExecutor<RatingEmployee> {

}
