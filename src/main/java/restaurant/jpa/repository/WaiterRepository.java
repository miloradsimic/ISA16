package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Waiter;

public interface WaiterRepository extends CrudRepository<Waiter, Long>, QueryDslPredicateExecutor<Waiter> {

}
