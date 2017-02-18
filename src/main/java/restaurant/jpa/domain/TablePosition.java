package restaurant.jpa.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "table_position")
public class TablePosition {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Max(value = 10, message = "Out of range!")
	@Min(value = 1, message = "Out of range!")
	@Column(name = "row", nullable = false)
	private int row;

	@Max(value = 5, message = "Out of range!")
	@Min(value = 1, message = "Out of range!")
	@Column(name = "col", nullable = false)
	private int col;

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "position", cascade = CascadeType.ALL)
	private RestaurantTable restaurantTable;
}
