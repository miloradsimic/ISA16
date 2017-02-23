package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "waiter")
public class Waiter extends Employee {

	public Waiter() {
	}

	
}
