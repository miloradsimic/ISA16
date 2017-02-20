package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Shift;

public interface ShiftRepository extends CrudRepository<Shift, Long>, QueryDslPredicateExecutor<Shift>{

	
}
