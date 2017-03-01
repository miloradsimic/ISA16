package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.domain.User;

public interface GuestRepository extends CrudRepository<Guest, Long>, QueryDslPredicateExecutor<Guest>{

	
}
