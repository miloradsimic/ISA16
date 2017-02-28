package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.OfferItem;

public interface OfferItemRepository  extends CrudRepository<OfferItem, Long>, QueryDslPredicateExecutor<OfferItem>{

}
