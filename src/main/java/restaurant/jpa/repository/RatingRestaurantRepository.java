package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RatingRestaurantRepository  extends CrudRepository<RatingRestaurantRepository, Long>, QueryDslPredicateExecutor<RatingRestaurantRepository>{

}
