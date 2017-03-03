package restaurant.jpa.service;

import restaurant.jpa.dto.request.UserDTO;

public interface GuestService {

	public String createGuest(UserDTO guest);
	
}
