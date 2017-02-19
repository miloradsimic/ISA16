package restaurant.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import restaurant.jpa.service.DrinkService;
import restaurant.jpa.service.ShiftService;

@Controller
public class RestaurantController {

	
	@Autowired
	private ShiftService shiftService;
	
	
	@GetMapping("/shift")
	@ResponseBody
	@Transactional(readOnly = true)
	public String getMeShift() {
		return this.shiftService.findById(1).getName();
	}
	
}
