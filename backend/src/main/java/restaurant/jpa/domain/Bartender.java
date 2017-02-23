package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bartender")
public class Bartender extends Employee {

	public Bartender() {
	}
}
