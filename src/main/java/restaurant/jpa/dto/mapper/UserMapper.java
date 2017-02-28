package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.User;
import restaurant.jpa.dto.UserLoginResponseDTO;

public class UserMapper {
	public static UserLoginResponseDTO mapEntityIntoDTO(User entity) {
		UserLoginResponseDTO dto = new UserLoginResponseDTO();
		
		dto.email = entity.getEmail();
		dto.name = (entity.getName());
		
		switch (entity.getRole()) {
		case ADMIN:
			dto.role = "admin";
			
			break;
		case BARTENDER:
			dto.role = "bartender";
			
			break;
		case COOK:
			dto.role = "cook";
			
			break;
		case GUEST:
			dto.role = "guest";
			
			break;
		case MANAGER:
			dto.role = "manager";
			
			break;
		case SUPPLIER:
			dto.role = "supplier";
			
			break;
		case WAITER:
			dto.role = "waiter";
			
			break;

		default:
			System.out.println("/n/nError in UserMapper class");
			System.out.println("Role not supported! Role: " + entity.getRole() + "/n/n");
			break;
		}
		
		return dto;
	}
}
