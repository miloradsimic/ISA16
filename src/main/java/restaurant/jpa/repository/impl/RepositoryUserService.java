package restaurant.jpa.repository.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.AppConstants;
import restaurant.jpa.domain.Guest;
import restaurant.jpa.domain.SystemManager;
import restaurant.jpa.domain.User;
import restaurant.jpa.domain.enums.Role;
import restaurant.jpa.dto.mapper.FriendsMapper;
import restaurant.jpa.dto.mapper.UserLoginMapper;
import restaurant.jpa.dto.mapper.UserMapper;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.FriendResponseDTO;
import restaurant.jpa.dto.response.UserProfileResponseDTO;
import restaurant.jpa.dto.response.UserLoginResponseDTO;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.GuestRepository;
import restaurant.jpa.repository.SystemManagerRepository;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.UserService;

@Service
public class RepositoryUserService implements UserService {

	private UserRepository userRepository;
	private GuestRepository guestRepository;
	private SystemManagerRepository adminRepository;

	@Autowired
	private RepositoryUserService(UserRepository userRepository, GuestRepository guestRepository, SystemManagerRepository adminRepository) {
		this.userRepository = userRepository;
		this.guestRepository = guestRepository;
		this.adminRepository = adminRepository;
	}

	@Override
	public Collection<UserProfileResponseDTO> findAll() {
		Iterable<User> users = userRepository.findAll();

		// Treba mapper metoda, ali ovo se ne koristi
		Collection<UserProfileResponseDTO> retVal = new ArrayList<UserProfileResponseDTO>();
		for (User user : users) {
			UserProfileResponseDTO u = new UserProfileResponseDTO();
			u.name = user.getName();
			u.email = user.getEmail();
			retVal.add(u);
		}
		return retVal;
	}

	@Override
	public UserProfileResponseDTO findByUsernameAndPassword(String username, String password) {

		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);

		return UserMapper.mapEntityIntoDTO(userRepository.findOne(pred));
	}

	@Override
	public UserLoginResponseDTO findByUsernameAndPasswordLogin(String username, String password) {

		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);

		return UserLoginMapper.mapEntityIntoDTO(userRepository.findOne(pred));
	}

	@Override
	public Collection<FriendResponseDTO> findAllFriends(String username, String password) {

		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);

		User user = userRepository.findOne(pred);

		long id = user.getId();

		Guest guest = guestRepository.findOne(id);

		// Iterable<Guest> guests = ;
		return UserMapper.mapFriendEntityIntoDTO(guest.getFriends());
	}
	
	@Override
	public Collection<UserProfileResponseDTO> findAllAdmins(String username, String password) {

		
		Predicate pred1 = UserPredicates.hasUsernameAndPassword(username, password);
		User user = userRepository.findOne(pred1);
		
		if(user == null){
			return null;   //AppConstants.USER_NOT_LOGGED_IN; /DOESN'T EXIST
		}
		
		if(!user.getRole().equals(Role.ADMIN) && !user.getRole().equals(Role.SUPERUSER)){
			return null; // Not enough permisions
		}
		
		Predicate pred2 = UserPredicates.hasRoles(username, Role.ADMIN, Role.SUPERUSER);
		
		return UserMapper.mapEntityIntoDTO(userRepository.findAll(pred2));
		
	}

	@Override
	public Boolean deleteAdmin(String username, String password, long id) {
		

		Predicate pred1 = UserPredicates.hasUsernameAndPassword(username, password);
		User user = userRepository.findOne(pred1);
		

		if(user == null){
			return false;   //AppConstants.USER_NOT_LOGGED_IN;
		}
		
		if(!user.getRole().equals(Role.SUPERUSER)){
			return false; // Not enough permisions
		}
		
		if(userRepository.exists(id) == false ){
			return false; //user with <code>id</code> doesn't exist
		}
		
		userRepository.delete(id);
		
		return true;
	}

	@Override
	public Boolean createAdmin(String username, String password, UserDTO dto) {
		

		Predicate pred1 = UserPredicates.hasUsernameAndPassword(username, password);
		User user = userRepository.findOne(pred1);
		

		if(user == null){
			return false;   //AppConstants.USER_NOT_LOGGED_IN;
		}
		
		if(!user.getRole().equals(Role.SUPERUSER)){
			return false; // Not enough permisions
		}
		
		Predicate pred = UserPredicates.hasEmail(dto.email);
		User existingUser = userRepository.findOne(pred);
		
		if(existingUser != null){
			return false; //user already exists with that email
		}
		
		SystemManager newUser = UserMapper.mapDtoIntoEntityAdmin(dto);
		
		
		SystemManager admin = adminRepository.save(newUser);
		
		if(admin == null) {
			return false; //failed to create new user
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
