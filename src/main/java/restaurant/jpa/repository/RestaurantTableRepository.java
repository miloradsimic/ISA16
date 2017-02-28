package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.RestaurantTable;

public interface RestaurantTableRepository extends CrudRepository<RestaurantTable, Long>, QueryDslPredicateExecutor<RestaurantTable> {

}
