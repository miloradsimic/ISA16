package restaurant.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "shift")
public class Shift {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(name = "name", nullable = false)
	private String name;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	


	@Column(name = "begin_hour", nullable = false)
	private int beginHour;
	
	@Column(name = "end_hour", nullable = false)
	private int endHour;

	
}
