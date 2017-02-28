package restaurant.jpa.dto.mapper;

import restaurant.jpa.domain.enums.Role;

public class RoleMapper {

	public static Role getIntRole(String role) {

		switch (role) {
		case "admin": {
			return Role.ADMIN;
		}
		case "bartender": {
			return Role.BARTENDER;
		}
		case "cook": {
			return Role.COOK;
		}
		case "guest": {
			return Role.ADMIN;
		}
		case "manager": {
			return Role.MANAGER;
		}
		case "supplier": {
			return Role.SUPPLIER;
		}
		case "waiter": {
			return Role.WAITER;
		}
		default: return null;
		}
	}
	
	
	public static String getStringRole(Role role) {

		switch (role) {
		case ADMIN:
			return "admin";
		case BARTENDER:
			return "bartender";
		case COOK:
			return  "cook";
		case GUEST:
			return  "guest";
		case MANAGER:
			return "manager";
		case SUPPLIER:
			return "supplier";
		case WAITER:
			return  "waiter";
		default:
			System.out.println("/n/nError in UserMapper class");
			System.out.println("Role not supported! Role: " + role + "/n/n");
			return null;
		}
	}
}
