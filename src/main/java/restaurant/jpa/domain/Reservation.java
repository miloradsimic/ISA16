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
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "guest_id", nullable = false)
	private Guest guest;

	@Column(name = "reservation_begin", nullable = false)
	private Date reservationBegin;

	/**
	 * Waiter initiate reservation ending when guest ask for bill.
	 */
	@Column(name = "reservation_end", nullable = false)
	private Date reservationEnd;

	/**
	 * Reservation start (begin) time + duration of reservation.
	 */
	@Column(name = "reservation_expire", nullable = false)
	private Date reservationExpire;

	@OneToMany
	@Column(name = "friend_id", nullable = false)
	private Set<Guest> friends;

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_table_id", nullable = false)
	private RestaurantTable restaurantTable;

	/**
	 * List of menu items with guest who ordered.
	 */
	@OneToMany
	@Column(name = "order_item_id", nullable = false)
	private Set<OrderItem> orders;

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	/**
	 * Only guest who reserved table can cancel reservation.
	 */
	@Column(name = "canceled", nullable = false)
	private boolean canceled;

	public Reservation() {
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

	public Date getReservationBegin() {
		return reservationBegin;
	}

	public void setReservationBegin(Date reservationBegin) {
		this.reservationBegin = reservationBegin;
	}

	public Date getReservationEnd() {
		return reservationEnd;
	}

	public void setReservationEnd(Date reservationEnd) {
		this.reservationEnd = reservationEnd;
	}

	public Date getReservationExpire() {
		return reservationExpire;
	}

	public void setReservationExpire(Date reservationExpire) {
		this.reservationExpire = reservationExpire;
	}

	public Set<Guest> getFriends() {
		return friends;
	}

	public void setFriends(Set<Guest> friends) {
		this.friends = friends;
	}

	public RestaurantTable getRestaurantTable() {
		return restaurantTable;
	}

	public void setRestaurantTable(RestaurantTable restaurantTable) {
		this.restaurantTable = restaurantTable;
	}

	public Set<OrderItem> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderItem> orders) {
		this.orders = orders;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public boolean isCanceled() {
		return canceled;
	}

	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}

}
