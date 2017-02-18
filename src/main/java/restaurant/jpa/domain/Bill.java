package restaurant.jpa.domain;

import java.util.Date;
import java.util.HashSet;
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
@Table(name = "tbl_bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@ManyToOne
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	@ManyToOne
	@JoinColumn(name = "waiter_id", nullable = false)
	private Waiter waiter;

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_table_id", nullable = false)
	private RestaurantTable restaurantTable;

	@Column(name = "creation_date", nullable = false)
	private Date creationDate;

	@OneToMany
	//@JoinColumn(name = "menu_item_id", nullable = false)
	private Set<MenuItem>  menuItems = new HashSet<>();

	// TODO: This anotation could be removed, because this data could be
	// calculated
	@Column(name = "total", nullable = false)
	private double total;

	public Bill() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Set<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(Set<MenuItem> billItems) {
		this.menuItems = billItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
