package restaurant.jpa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.jpa.AppUtils;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.UserLoginResponseDTO;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.UserService;

@RestController
@RequestMapping("/auth")
public class AuthenticationControler {

	@Autowired
    private UserRepository repository;

	@Autowired
	private UserService service;
	
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public UserLoginResponseDTO tryToLogin(@RequestHeader("Authorization") String encoded) {
		
		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);

		return this.service.findByUsernameAndPasswordLogin(username, password);
	}
	

	
	@RequestMapping(path="/logout", method = RequestMethod.GET)
	public boolean tryToLogin(HttpSession httpSession) {
		httpSession.setAttribute("user", null);
		return true;
	}
	
	
}
