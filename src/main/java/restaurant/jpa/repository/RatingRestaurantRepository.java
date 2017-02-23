package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.RatingRestaurant;

public interface RatingRestaurantRepository  extends CrudRepository<RatingRestaurant, Long>, QueryDslPredicateExecutor<RatingRestaurant>{

}
