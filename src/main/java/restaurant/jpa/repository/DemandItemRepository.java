package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.DemandItem;

public interface DemandItemRepository  extends CrudRepository<DemandItem, Long>, QueryDslPredicateExecutor<DemandItem>{

}
