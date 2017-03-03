package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.Shift;
import restaurant.jpa.dto.response.ShiftResponseDTO;

public final class ShiftMapper {
	
	public static ShiftResponseDTO mapEntityIntoDTO(Shift entity) {
		ShiftResponseDTO dto = new ShiftResponseDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		
		return dto;
	}
	
}
