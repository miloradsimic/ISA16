package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Bill;

public interface BillRepository  extends CrudRepository<Bill, Long>, QueryDslPredicateExecutor<Bill>{

}
