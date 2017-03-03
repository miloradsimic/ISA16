package restaurant.jpa.dto.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.validator.constraints.Email;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.domain.SystemManager;
import restaurant.jpa.domain.User;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.FriendResponseDTO;
import restaurant.jpa.dto.response.UserProfileResponseDTO;

public class UserMapper {
	public static UserProfileResponseDTO mapEntityIntoDTO(User entity) {
		UserProfileResponseDTO dto = new UserProfileResponseDTO();

		dto.email = entity.getEmail();
		dto.name = (entity.getName());
		dto.id = (entity.getId());

		return dto;
	}
	
	public static Collection<FriendResponseDTO> mapFriendEntityIntoDTO(Iterable<Guest> entity) {
		Collection<FriendResponseDTO> dtos = new ArrayList<>();
		FriendResponseDTO dto = new FriendResponseDTO();

		for (Guest g : entity) {
			dto = new FriendResponseDTO();
			dto.id = g.getId();
			dto.name = g.getName();
			dtos.add(dto);
		}
		return dtos;
	}
	
	public static SystemManager mapDtoIntoEntityAdmin(UserDTO dto){
		SystemManager entity = new SystemManager();
		
		entity.setEmail(dto.email);
		entity.setName(dto.name);
		entity.setPassword(dto.password);
		
		return entity;
		
	}

	public static Collection<UserProfileResponseDTO> mapEntityIntoDTO(Iterable<User> entity) {
		Collection<UserProfileResponseDTO> dtos = new ArrayList<>();
		UserProfileResponseDTO dto = new UserProfileResponseDTO();

		for (User g : entity) {
			dto = mapEntityIntoDTO(g);
			dtos.add(dto);
		}
		return dtos;
	}
}
