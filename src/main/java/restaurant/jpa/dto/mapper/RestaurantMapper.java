package restaurant.jpa.dto.mapper;

import java.util.ArrayList;
import java.util.Collection;

import restaurant.jpa.domain.Restaurant;
import restaurant.jpa.dto.RestaurantDTO;

public final class RestaurantMapper {
	
	public static RestaurantDTO mapEntityIntoDTO(Restaurant entity) {
		
		RestaurantDTO dto = new RestaurantDTO();
		
		dto.id = entity.getId();
		dto.name = entity.getName();
		dto.description = entity.getDescription();
		
		return dto;
	}
	
	public static Collection<RestaurantDTO> mapEntityIntoDTO(Iterable<Restaurant> entity) {
		
		Collection<RestaurantDTO> collectionDTO = new ArrayList<>();
		
		for (Restaurant item : entity) {
			collectionDTO.add(mapEntityIntoDTO(item));
		}
		
		return collectionDTO;
	}
	

}
