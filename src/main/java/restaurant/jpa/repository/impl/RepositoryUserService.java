package restaurant.jpa.repository.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.UserLoginDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;
import restaurant.jpa.dto.mapper.UserMapper;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.UserService;

@Service
public class RepositoryUserService implements UserService {

	private UserRepository repository;

	@Autowired
	private RepositoryUserService(UserRepository repository) {
		this.repository = repository;
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
	public Collection<UserLoginResponseDTO> findAll() {
		Iterable<User> users  = repository.findAll();
		
		Collection<UserLoginResponseDTO> retVal = new ArrayList<UserLoginResponseDTO>();
		for (User user : users) {
			UserLoginResponseDTO u= new UserLoginResponseDTO();
			u.name = user.getName();
			u.email = user.getEmail();
			retVal.add(u);
		}
		return retVal;
	}

	@Override
	public UserLoginResponseDTO findByUsernameAndPassword(String username, String password) {
		
		Predicate pred = UserPredicates.hasUsernameAndPassword(username, password);
		
		return UserMapper.mapEntityIntoDTO(repository.findOne(pred));
	}
	

}
