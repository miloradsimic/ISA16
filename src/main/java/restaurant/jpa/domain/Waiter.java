package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.Role;

@Entity
@Table(name = "waiter")
public class Waiter extends Employee {
	
	public Waiter() {
		role = Role.WAITER;
	}

	
}
