package restaurant.jpa.repository.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.domain.User;
import restaurant.jpa.dto.FriendResponseDTO;
import restaurant.jpa.dto.GuestProfileResponseDTO;
import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;
import restaurant.jpa.dto.mapper.FriendsMapper;
import restaurant.jpa.dto.mapper.UserLoginMapper;
import restaurant.jpa.dto.mapper.UserMapper;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.GuestRepository;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.UserService;

@Service
public class RepositoryUserService implements UserService {

	private UserRepository repository;
	private GuestRepository guestRepository;

	@Autowired
	private RepositoryUserService(UserRepository repository, GuestRepository gRep) {
		this.repository = repository;
		this.guestRepository = gRep;
	}

	@Transactional
	@Override
	public UserLoginDTO findByUsername(String username, String password) {
		/*if (username == null || password == null)
			return null;
		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);
		User dbUser = repository.findOne(pred);

		if (dbUser == null)
			return null;

		UserLoginResponseDTO userRespDTO = new UserLoginResponseDTO();
		userRespDTO.email = dbUser.getEmail();
		userRespDTO.name = dbUser.getName();

		httpSession.setAttribute("user", userRespDTO);

		return userRespDTO;*/
		return null;
	}

	@Override
	public Collection<GuestProfileResponseDTO> findAll() {
		Iterable<User> users  = repository.findAll();
		
		//Treba mapper metoda, ali ovo se ne koristi
		Collection<GuestProfileResponseDTO> retVal = new ArrayList<GuestProfileResponseDTO>();
		for (User user : users) {
			GuestProfileResponseDTO u= new GuestProfileResponseDTO();
			u.name = user.getName();
			u.email = user.getEmail();
			retVal.add(u);
		}
		return retVal;
	}
	

	@Override
	public GuestProfileResponseDTO findByUsernameAndPassword(String username, String password) {
		
		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);
		
		return UserMapper.mapEntityIntoDTO(repository.findOne(pred));
	}
	
	@Override
	public UserLoginResponseDTO findByUsernameAndPasswordLogin(String username, String password) {
		
		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);
		
		return UserLoginMapper.mapEntityIntoDTO(repository.findOne(pred));
	}

	@Override
	public Collection<FriendResponseDTO> findAllFriends(String username, String password) {

		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);
		
		User user = repository.findOne(pred);
		
		long id = user.getId();
		
		Guest guest = guestRepository.findOne(id);
		
//		Iterable<Guest> guests = ;
		return FriendsMapper.mapEntityIntoDTO(guest.getFriends());
	}
	

}
