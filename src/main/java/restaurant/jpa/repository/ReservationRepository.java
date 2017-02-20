package restaurant.jpa.repository;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import restaurant.jpa.domain.Reservation;

public interface ReservationRepository  extends CrudRepository<Reservation, Long>, QueryDslPredicateExecutor<Reservation>{

}
