package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Restaurant;
import restaurant.jpa.domain.User;

public interface RestaurantRepository extends CrudRepository<Restaurant, Long>, QueryDslPredicateExecutor<Restaurant> {

	Iterable<Restaurant> findAll();
}
