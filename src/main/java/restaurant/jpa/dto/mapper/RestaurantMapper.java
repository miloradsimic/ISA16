package restaurant.jpa.dto.mapper;

import java.util.ArrayList;
import java.util.Collection;

import restaurant.jpa.domain.Restaurant;
import restaurant.jpa.dto.response.RestaurantResponseDTO;

public final class RestaurantMapper {
	
	public static RestaurantResponseDTO mapEntityIntoDTO(Restaurant entity) {
		
		RestaurantResponseDTO dto = new RestaurantResponseDTO();
		
		dto.id = entity.getId();
		dto.name = entity.getName();
		dto.description = entity.getDescription();
		
		return dto;
	}
	
	public static Collection<RestaurantResponseDTO> mapEntityIntoDTO(Iterable<Restaurant> entity) {
		
		Collection<RestaurantResponseDTO> collectionDTO = new ArrayList<>();
		
		for (Restaurant item : entity) {
			collectionDTO.add(mapEntityIntoDTO(item));
		}
		
		return collectionDTO;
	}
	

}
