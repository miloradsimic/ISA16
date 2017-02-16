package restaurant.jpa.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long restaurant_id;

	@Max(value = 24, message = "Hour is out of range!")
	@Min(value = 0, message = "Hour is out of range!")
	@Column(name = "open_hour", nullable = false)
	private int openHour;
	
	@Max(value = 24, message = "Hour is out of range!")
	@Min(value = 0, message = "Hour is out of range!")
	@Column(name = "close_hour", nullable = false)
	private int closeHour;
	
	

	@OneToMany
	@Column(name = "rating_id")
	private Set<Rating> ratings;
	
	@OneToMany
	@Column(name = "ingredient_id")
	private Set<Ingredient> ingredients;
	
}
