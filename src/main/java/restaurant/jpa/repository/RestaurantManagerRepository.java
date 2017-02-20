package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.RestaurantManager;

public interface RestaurantManagerRepository extends CrudRepository<RestaurantManager, Long>, QueryDslPredicateExecutor<RestaurantManager> {

}
