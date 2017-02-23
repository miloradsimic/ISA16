package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.RatingMenuItem;

public interface RatingMenuItemRepository  extends CrudRepository<RatingMenuItem, Long>, QueryDslPredicateExecutor<RatingMenuItem>{

}
