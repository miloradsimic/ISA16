package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.Repository;

import restaurant.jpa.domain.Shift;

public interface ShiftRepository extends Repository<Shift, Long>, QueryDslPredicateExecutor<Shift>{

}
