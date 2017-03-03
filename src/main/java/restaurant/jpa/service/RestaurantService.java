package restaurant.jpa.service;

import java.util.Collection;

import restaurant.jpa.domain.Restaurant;
import restaurant.jpa.dto.response.RestaurantResponseDTO;

public interface RestaurantService {

	Collection<RestaurantResponseDTO> findAll();

}
