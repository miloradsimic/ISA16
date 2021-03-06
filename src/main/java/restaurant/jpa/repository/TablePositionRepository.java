package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.TablePosition;

public interface TablePositionRepository extends CrudRepository<TablePosition, Long>, QueryDslPredicateExecutor<TablePosition> {

}
