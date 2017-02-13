package restaurant.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import restaurant.jpa.service.DrinkService;

@Controller
public class RestaurantController {

	@Autowired
	private DrinkService drinkService;
	
	@GetMapping("/drink")
	@ResponseBody
	@Transactional(readOnly = true)
	public String getDrinkName() {
		return this.drinkService.getDrink("Sok").getName();
	}
	
}
