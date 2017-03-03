package restaurant.jpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.AppUtils;
import restaurant.jpa.domain.User;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.FriendResponseDTO;
import restaurant.jpa.dto.response.UserProfileResponseDTO;
import restaurant.jpa.dto.response.RestaurantResponseDTO;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.GuestService;
import restaurant.jpa.service.RestaurantService;
import restaurant.jpa.service.ShiftService;
import restaurant.jpa.service.UserService;

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
	private GuestService guestService;

	@Autowired
	private RestaurantService restaurantService;

	/*
	 * @GetMapping("/shift")
	 * 
	 * @ResponseBody
	 * 
	 * @Transactional(readOnly = true) public ShiftDTO getMeShift() { Predicate
	 * pred = UserPredicates.hasUsername(user.username); User dbUser =
	 * repository.findOne(pred);
	 * 
	 * return this.shiftService.findById(1).getName(); }
	 */

	@RequestMapping(path = "/users", method = RequestMethod.GET)
	Collection<UserProfileResponseDTO> readUsers() {

		return this.userService.findAll();
	}

	@RequestMapping(path = "/restaurants", method = RequestMethod.GET)
	Collection<RestaurantResponseDTO> getRestaurants() {
		return this.restaurantService.findAll();
	}

	@RequestMapping(path = "/profile", method = RequestMethod.GET)
	UserProfileResponseDTO getGuestProfile(@RequestHeader("Authorization") String encoded) {

		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);

		return this.userService.findByUsernameAndPassword(username, password);
	}

	@RequestMapping(path = "/friends", method = RequestMethod.GET)
	Collection<FriendResponseDTO> getGuestFriends(@RequestHeader("Authorization") String encoded) {

		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);

		return this.userService.findAllFriends(username, password);
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String registerGuest(@RequestBody UserDTO newGuest) {
		
		return this.guestService.createGuest(newGuest);
	}

}
