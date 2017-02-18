package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rating_restaurant")
public class RatingRestaurant extends Rating {


	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
}
