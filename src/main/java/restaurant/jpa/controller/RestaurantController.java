package restaurant.jpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.UserLoginResponseDTO;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.ShiftService;
import restaurant.jpa.service.UserService;

@RestController
public class RestaurantController {

	
	@Autowired
	private ShiftService shiftService;

	@Autowired
    private UserRepository repository;
	
	@Autowired
	private UserService service;
	
	
	/*@GetMapping("/shift")
	@ResponseBody
	@Transactional(readOnly = true)
	public ShiftDTO getMeShift() {
		Predicate pred = UserPredicates.hasUsername(user.username);
        User dbUser = repository.findOne(pred);
		
		return this.shiftService.findById(1).getName();
	}*/
	
	
	@RequestMapping(path="/users", method = RequestMethod.GET)
	Collection<UserLoginResponseDTO> readUsers() {
		
		return this.service.findAll();
	}
	
}
