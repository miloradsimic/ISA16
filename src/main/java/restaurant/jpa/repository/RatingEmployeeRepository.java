package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Employee;

public interface RatingEmployeeRepository extends CrudRepository<Employee, Long>, QueryDslPredicateExecutor<Employee> {

}
