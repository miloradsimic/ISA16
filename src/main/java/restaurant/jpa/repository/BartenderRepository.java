package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Bartender;

public interface BartenderRepository extends CrudRepository<Bartender, Long>, QueryDslPredicateExecutor<Bartender>{ {

}
