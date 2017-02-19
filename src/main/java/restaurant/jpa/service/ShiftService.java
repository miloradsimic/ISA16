package restaurant.jpa.service;

import restaurant.jpa.dto.ShiftDTO;

public interface ShiftService {

	ShiftDTO findById(long id);
	
}
