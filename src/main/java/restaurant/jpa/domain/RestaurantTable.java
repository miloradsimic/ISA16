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
import javax.validation.constraints.Null;

import restaurant.jpa.domain.enums.TableStatus;

@Entity
@Table(name = "restaurant_table")
public class RestaurantTable {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(name = "number", nullable = false)
	private int number;

	@ManyToOne(optional = false)
	@JoinColumn(name = "reon_id", nullable = false)
	private Reon reon;
	

	@OneToOne(fetch = FetchType.LAZY)
	private TablePosition position;
	
	@Column(name = "status", nullable = false)
	private TableStatus status;

	@ManyToOne(optional = true)
	@JoinColumn(name = "waiter_id", nullable = true)
	private Waiter waiter;
	
	@Column(name = "max_seats", nullable = false)
	private int maxSeats;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	
	

	public RestaurantTable() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Reon getReon() {
		return reon;
	}

	public void setReon(Reon reon) {
		this.reon = reon;
	}

}
