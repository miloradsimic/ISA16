package restaurant.jpa.service;

import java.util.Collection;

import restaurant.jpa.domain.Restaurant;
import restaurant.jpa.dto.RestaurantDTO;

public interface RestaurantService {

	Collection<RestaurantDTO> findAll();

}
