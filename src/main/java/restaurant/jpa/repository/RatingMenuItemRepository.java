package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RatingMenuItemRepository  extends CrudRepository<RatingMenuItemRepository, Long>, QueryDslPredicateExecutor<RatingMenuItemRepository>{

}
