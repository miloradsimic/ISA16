package restaurant.jpa.service;

import java.util.Collection;

import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;
import restaurant.jpa.dto.FriendResponseDTO;
import restaurant.jpa.dto.GuestProfileResponseDTO;

public interface UserService {
	
	UserLoginDTO findByUsername(String username, String password);
	
	Collection<GuestProfileResponseDTO> findAll();
	
	GuestProfileResponseDTO findByUsernameAndPassword(String username, String password);
	UserLoginResponseDTO findByUsernameAndPasswordLogin(String username, String password);

	
	Collection<FriendResponseDTO> findAllFriends(String username, String password);

}
