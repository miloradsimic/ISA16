package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Ingredient;

public interface IngredientRepository  extends CrudRepository<Ingredient, Long>, QueryDslPredicateExecutor<Ingredient>{

}
