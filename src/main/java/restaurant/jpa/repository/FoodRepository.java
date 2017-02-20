package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Food;

public interface FoodRepository  extends CrudRepository<Food, Long>, QueryDslPredicateExecutor<Food>{

}
