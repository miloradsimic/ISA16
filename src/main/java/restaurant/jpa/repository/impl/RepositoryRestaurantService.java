package restaurant.jpa.repository.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.Predicate;

import restaurant.jpa.dto.mapper.RestaurantMapper;
import restaurant.jpa.dto.mapper.UserMapper;
import restaurant.jpa.dto.response.RestaurantResponseDTO;
import restaurant.jpa.queries.UserPredicates;
import restaurant.jpa.repository.RestaurantRepository;
import restaurant.jpa.service.RestaurantService;

@Service
public class RepositoryRestaurantService implements RestaurantService {

	private RestaurantRepository restaurantRepository;

	//NOTE: Constructor injection
	@Autowired
	public RepositoryRestaurantService(RestaurantRepository repository) {
		this.restaurantRepository = repository;
	}

	

	@Override
	public Collection<RestaurantResponseDTO> findAll() {

		return RestaurantMapper.mapEntityIntoDTO(restaurantRepository.findAll());
	}
	
	
}
