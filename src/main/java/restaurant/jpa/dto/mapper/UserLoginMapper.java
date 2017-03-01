package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.UserLoginResponseDTO;

public class UserLoginMapper {

	public static UserLoginResponseDTO mapEntityIntoDTO(User entity) {
		UserLoginResponseDTO dto = new UserLoginResponseDTO(RoleMapper.getStringRole(entity.getRole()));
		
		return dto;
	}
}
