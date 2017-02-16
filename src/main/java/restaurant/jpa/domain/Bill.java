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
@Table(name = "bill")
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	@ManyToOne
	@JoinColumn(name = "waiter_id", nullable = false)
	private Waiter waiter;

	@ManyToOne
	@JoinColumn(name = "table_id", nullable = false)
	private restaurant.jpa.domain.Table table;

	@Column(name = "creation_date", nullable = false)
	private Date creationDate;

	@OneToMany
	@Column(name = "menu_item_id", nullable = false)
	private Set<MenuItem> billItems;

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

	public Set<MenuItem> getBillItems() {
		return billItems;
	}

	public void setBillItems(Set<MenuItem> billItems) {
		this.billItems = billItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
