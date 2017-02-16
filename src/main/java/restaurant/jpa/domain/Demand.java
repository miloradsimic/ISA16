package restaurant.jpa.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "demand")
public class Demand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@OneToMany
	@Column(name = "demand_item_id", nullable = false)
	private Set<DemandItem> demandItems;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	
	@Column(name = "demand_end", nullable = false)
	private Date demandEnd;
	

	public Demand() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<DemandItem> getDemandItems() {
		return demandItems;
	}

	public void setDemandItems(Set<DemandItem> demandItems) {
		this.demandItems = demandItems;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Date getDemandEnd() {
		return demandEnd;
	}

	public void setDemandEnd(Date demandEnd) {
		this.demandEnd = demandEnd;
	}
	
	
	
}
