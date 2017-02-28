package restaurant.jpa.service;

import java.util.Collection;

import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;

public interface UserService {
	
	UserLoginDTO findByUsername(String username, String password);
	
	Collection<UserLoginResponseDTO> findAll();
	
	UserLoginResponseDTO findByUsernameAndPassword(String username, String password);
	

}
