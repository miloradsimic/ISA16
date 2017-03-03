package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.response.UserLoginResponseDTO;

public class UserLoginMapper {

	public static UserLoginResponseDTO mapEntityIntoDTO(User entity) {
		
		if(entity == null) {
			return null;
		}
		
		UserLoginResponseDTO dto = new UserLoginResponseDTO(RoleMapper.getStringRole(entity.getRole()));
		
		return dto;
	}
}
