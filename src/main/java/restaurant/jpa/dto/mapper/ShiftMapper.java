package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.Shift;
import restaurant.jpa.dto.ShiftDTO;

public final class ShiftMapper {
	
	public static ShiftDTO mapEntityIntoDTO(Shift entity) {
		ShiftDTO dto = new ShiftDTO();
		
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		
		return dto;
	}
	
}
