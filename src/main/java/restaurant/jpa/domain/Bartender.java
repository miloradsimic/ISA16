package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.Role;

@Entity
@Table(name = "bartender")
public class Bartender extends Employee {

	public Bartender() {
		role = Role.BARTENDER;
	}
}
