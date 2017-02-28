package restaurant.jpa.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.UserService;

@RestController
@RequestMapping("/auth")
public class LoginControler {

	@Autowired
    private UserRepository repository;

	@Autowired
	private UserService service;
	
	@RequestMapping(path="/login", method = RequestMethod.POST)
	public UserLoginResponseDTO tryToLogin(@RequestBody UserLoginDTO userReq, HttpSession httpSession) {
		
		UserLoginResponseDTO userResp = this.service.findByUsernameAndPassword(userReq.username, userReq.password);
		httpSession.setAttribute("user", userResp);
		
		return userResp;
	}
	

	
	@RequestMapping(path="/logout", method = RequestMethod.GET)
	public boolean tryToLogin(HttpSession httpSession) {
		httpSession.setAttribute("user", null);
		return true;
	}
	
	
	
	
}
