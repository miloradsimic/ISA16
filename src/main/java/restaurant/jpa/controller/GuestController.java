package restaurant.jpa.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import restaurant.jpa.dto.RestaurantDTO;
import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.FriendResponseDTO;
import restaurant.jpa.dto.GuestProfileResponseDTO;
import restaurant.jpa.dto.mapper.RoleMapper;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.RestaurantService;
import restaurant.jpa.service.ShiftService;
import restaurant.jpa.service.UserService;
import restaurant.jpa.AppUtils;
import restaurant.jpa.domain.enums.Role;

@RestController
@RequestMapping("/guest")
public class GuestController {

	
	@Autowired
	private ShiftService shiftService;

	@Autowired
    private UserRepository repository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestaurantService restaurantService;
	
	
	/*@GetMapping("/shift")
	@ResponseBody
	@Transactional(readOnly = true)
	public ShiftDTO getMeShift() {
		Predicate pred = UserPredicates.hasUsername(user.username);
        User dbUser = repository.findOne(pred);
		
		return this.shiftService.findById(1).getName();
	}*/
	
	
	@RequestMapping(path="/users", method = RequestMethod.GET)
	Collection<GuestProfileResponseDTO> readUsers() {
		
		return this.userService.findAll();
	}
	

	@RequestMapping(path="/restaurants", method = RequestMethod.GET)
	Collection<RestaurantDTO> getRestaurants() {
		return this.restaurantService.findAll();
	}
	

	@RequestMapping(path="/profile", method = RequestMethod.GET)
	GuestProfileResponseDTO getGuestProfile(@RequestHeader("Authorization") String encoded) {
		

		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);

		return this.userService.findByUsernameAndPassword(username, password);
	}
	
	@RequestMapping(path="/friends", method = RequestMethod.GET)
	Collection<FriendResponseDTO> getGuestFriends(@RequestHeader("Authorization") String encoded) {
		

		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);

		return this.userService.findAllFriends(username, password);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(path="/restaurants", method = RequestMethod.GET)
//	Collection<RestaurantDTO> getRestaurants(HttpSession session) {
//		
//		//if(!isAuthorized(session, new Role[]{Role.ADMIN,  Role.GUEST}))
//		//	return null;
//		
//		return this.restaurantService.findAll();
//	}
//	
//	
//	private boolean isAuthorized(HttpSession session, Role[] roles){
//		if(session.getAttribute("user") == null) { return false; }
//		
//		for (Role role : roles) {
//			if(RoleMapper.getIntRole(((UserLoginResponseDTO)session.getAttribute("user")).role) == role)
//				return true;
//		}
//		
//		return false;
//	}
	
}
