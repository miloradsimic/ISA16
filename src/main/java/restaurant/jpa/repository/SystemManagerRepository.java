package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.SystemManager;

public interface SystemManagerRepository  extends CrudRepository<SystemManager, Long>, QueryDslPredicateExecutor<SystemManager>{

}
