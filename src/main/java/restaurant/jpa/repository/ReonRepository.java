package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Reon;

public interface ReonRepository  extends CrudRepository<Reon, Long>, QueryDslPredicateExecutor<Reon>{

}
