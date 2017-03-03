package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.Role;

@Entity
@Table(name = "system_manager")
public class SystemManager  extends User{

	public SystemManager() {
		role = Role.ADMIN;
	}

}
