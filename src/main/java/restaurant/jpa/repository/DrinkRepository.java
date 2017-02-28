package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Drink;
import restaurant.jpa.domain.Shift;

public interface DrinkRepository extends CrudRepository<Drink, Long>, QueryDslPredicateExecutor<Drink>{

}
