package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.dto.request.UserDTO;

public class GuestMapper {

	public static Guest mapDtoIntoEntity(UserDTO dto) {
		Guest entity = new Guest();
		entity.setName(dto.name);
		entity.setPassword(dto.password);
		entity.setEmail(dto.email);

		return entity;
	}
}
