package restaurant.jpa.service;

import restaurant.jpa.dto.response.ShiftResponseDTO;

public interface ShiftService {

	ShiftResponseDTO findById(long id);
	
}
