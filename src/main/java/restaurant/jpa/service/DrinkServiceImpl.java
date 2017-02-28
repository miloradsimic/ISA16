package restaurant.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import restaurant.jpa.domain.Drink;
import restaurant.jpa.repository.DrinkRepository;

@Service
@Transactional
public class DrinkServiceImpl implements DrinkService{
	
	@Autowired
	private DrinkRepository drinkRepository;

	
	@Override
	public Drink getDrink(String name) {
		Assert.notNull(name, "Fill name field!");
		
		Drink gonnaBeDeletedAnyway = new Drink();
		
		return gonnaBeDeletedAnyway;
		
	}

}
