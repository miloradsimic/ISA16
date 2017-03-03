package restaurant.jpa.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restaurant.jpa.AppUtils;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.request.IdDTO;
import restaurant.jpa.dto.response.FullAdminResponseDTO;
import restaurant.jpa.dto.response.UserProfileResponseDTO;
import restaurant.jpa.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminsController {

	@Autowired
	private UserService userService;
	
	
	
	
	
	@RequestMapping(path = "/admins", method = RequestMethod.GET)
	Collection<FullAdminResponseDTO> getAdmins(@RequestHeader("Authorization") String encoded) {
		
		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);
		
		return this.userService.findAllAdmins(username, password);
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	Boolean deleteAdmin(@RequestHeader("Authorization") String encoded, @RequestBody IdDTO dto) {
		
		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);
		
		return this.userService.deleteAdmin(username, password, dto.id);
	}
	
	@RequestMapping(path = "/create", method = RequestMethod.POST)
	Boolean createAdmin(@RequestHeader("Authorization") String encoded, @RequestBody UserDTO dto) {
		
		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);
		
		return this.userService.createAdmin(username, password, dto);
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.POST)
	String updateAdmin(@RequestHeader("Authorization") String encoded, @RequestBody FullAdminResponseDTO dto) {
		
		String username = AppUtils.getUsernameFromBasic(encoded);
		String password = AppUtils.getPasswordFromBasic(encoded);
		
		String response = this.userService.updateAdmin(username, password, dto);
		System.out.println("RESPONSE: Admin update -> " + response);
		return response;
	}
	
}
