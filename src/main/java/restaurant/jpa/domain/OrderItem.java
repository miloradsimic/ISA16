package restaurant.jpa.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.OrderStatus;

@Entity
@Table(name = "order_item")
public abstract class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "guest_id", nullable = false)
	private Guest guest;

	@ManyToOne(optional = false)
	@JoinColumn(name = "waiter_id", nullable = false)
	private Waiter waiter;

	@ManyToOne(optional = false)
	@JoinColumn(name = "menu_item_id", nullable = false)
	private MenuItem ordered_item;

	@ManyToOne(optional = false)
	@JoinColumn(name = "table_id", nullable = false)
	private restaurant.jpa.domain.Table table;

	@Column(name = "ready_time", nullable = false)
	private Date ready_time;

	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "order_status")
	private OrderStatus orderStatus;

	public OrderItem() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Waiter getWaiter() {
		return waiter;
	}

	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}

	public MenuItem getOrdered_item() {
		return ordered_item;
	}

	public void setOrdered_item(MenuItem ordered_item) {
		this.ordered_item = ordered_item;
	}
	
	public Date getReady_time() {
		return ready_time;
	}

	public void setReady_time(Date ready_time) {
		this.ready_time = ready_time;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	

}
