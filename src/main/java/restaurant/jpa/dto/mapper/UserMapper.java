package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.GuestProfileResponseDTO;
import restaurant.jpa.dto.UserLoginResponseDTO;

public class UserMapper {
	public static GuestProfileResponseDTO mapEntityIntoDTO(User entity) {
		GuestProfileResponseDTO dto = new GuestProfileResponseDTO();
		
		dto.email = entity.getEmail();
		dto.name = (entity.getName());
		
		return dto;
	}
}
