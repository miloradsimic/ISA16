package restaurant.jpa.repository;

import org.springframework.data.repository.Repository;

import restaurant.jpa.domain.Drink;

public interface DrinkRepository extends Repository<Drink, Long>{

	public Drink findByName(String name);
}
