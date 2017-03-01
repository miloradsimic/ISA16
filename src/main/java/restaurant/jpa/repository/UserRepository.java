package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.GuestProfileResponseDTO;

public interface UserRepository extends CrudRepository<User, Long>, QueryDslPredicateExecutor<User> {
	
	Iterable<User> findAll();
	
	
}