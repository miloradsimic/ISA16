package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long>, QueryDslPredicateExecutor<Supplier> {

}
