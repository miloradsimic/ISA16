package restaurant.jpa.dto.mapper;

import java.util.ArrayList;
import java.util.Collection;

import restaurant.jpa.domain.Guest;
import restaurant.jpa.dto.FriendResponseDTO;

public class FriendsMapper {

	public static Collection<FriendResponseDTO> mapEntityIntoDTO(Iterable<Guest> entity) {
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

}
