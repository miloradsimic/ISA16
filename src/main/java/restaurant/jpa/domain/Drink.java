package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tbl_drink")
public class Drink extends MenuItem {

	public Drink(){
	}
}
