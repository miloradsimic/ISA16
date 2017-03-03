package restaurant.jpa.dto.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.validator.constraints.Email;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.domain.SystemManager;
import restaurant.jpa.domain.User;
import restaurant.jpa.dto.request.UserDTO;
import restaurant.jpa.dto.response.FriendResponseDTO;
import restaurant.jpa.dto.response.FullAdminResponseDTO;
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
	
	public static SystemManager mapDtoIntoEntityAdminNew(UserDTO dto){
		SystemManager entity = new SystemManager();
		
		entity.setEmail(dto.email);
		entity.setName(dto.name);
		entity.setPassword(dto.password);
		
		return entity;
		
	}
	
	public static SystemManager mapDtoIntoEntityAdmin(FullAdminResponseDTO dto){
		SystemManager entity = new SystemManager();
		
		entity.setEmail(dto.email);
		entity.setName(dto.name);
		entity.setPassword(dto.password);
		entity.setId(dto.id);
		
		return entity;
		
	}

	public static Collection<FullAdminResponseDTO> mapEntityIntoDTO(Iterable<User> entity) {
		Collection<FullAdminResponseDTO> dtos = new ArrayList<>();
		FullAdminResponseDTO dto = new FullAdminResponseDTO();

		for (User g : entity) {
			dto = mapEntityIntoAdminDTO(g);
			dtos.add(dto);
		}
		return dtos;
	}
	
	public static FullAdminResponseDTO mapEntityIntoAdminDTO(User entity) {
		FullAdminResponseDTO dto = new FullAdminResponseDTO();

		dto.email = entity.getEmail();
		dto.name = (entity.getName());
		dto.password = (entity.getPassword());
		dto.id = (entity.getId());

		return dto;
	}
	
}
