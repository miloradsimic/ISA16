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

}
