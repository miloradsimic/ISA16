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
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	public SystemManager() {
		role = Role.ADMIN;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
