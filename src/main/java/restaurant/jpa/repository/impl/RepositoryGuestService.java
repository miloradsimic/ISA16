package restaurant.jpa.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.AppConstants;
import restaurant.jpa.domain.User;
import restaurant.jpa.dto.mapper.GuestMapper;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.GuestRepository;
import restaurant.jpa.repository.UserRepository;
import restaurant.jpa.service.GuestService;

@Service
public class RepositoryGuestService implements GuestService {

	private UserRepository userRepository;
	private GuestRepository guestRepository;

	@Autowired
	private RepositoryGuestService(UserRepository repository, GuestRepository gRep) {
		this.userRepository = repository;
		this.guestRepository = gRep;
	}

	@Override
	public String createGuest(UserDTO dto) {
		
		
		Predicate pred = UserPredicates.hasEmail(dto.email);
		User user = userRepository.findOne(pred);
		if(user != null){
			return AppConstants.USER_ALREADY_EXIST;
		}

		if (guestRepository.save(GuestMapper.mapDtoIntoEntity(dto)) == null) {
			return AppConstants.USER_ERROR;
		}
		return AppConstants.USER_REGISTERED_SUCCESFUL;
	}

}
