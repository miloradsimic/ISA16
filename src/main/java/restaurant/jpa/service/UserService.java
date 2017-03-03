package restaurant.jpa.service;

import java.util.Collection;

import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.FriendResponseDTO;
import restaurant.jpa.dto.response.UserProfileResponseDTO;
import restaurant.jpa.dto.response.UserLoginResponseDTO;

public interface UserService {

	Collection<UserProfileResponseDTO> findAll();

	UserProfileResponseDTO findByUsernameAndPassword(String username, String password);

	UserLoginResponseDTO findByUsernameAndPasswordLogin(String username, String password);

	Collection<FriendResponseDTO> findAllFriends(String username, String password);

	Collection<UserProfileResponseDTO> findAllAdmins(String username, String password);
	
	Boolean deleteAdmin(String username, String password, long id);

	Boolean createAdmin(String username, String password, UserDTO dto);

}
