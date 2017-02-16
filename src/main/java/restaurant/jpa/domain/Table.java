package restaurant.jpa.domain;

import java.awt.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import restaurant.jpa.domain.enums.TableStatusType;

@Entity
@javax.persistence.Table(name = "table")
public class Table {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "number", nullable = false)
	private int number;

	@ManyToOne(optional = false)
	@JoinColumn(name = "reon_id", nullable = false)
	private Reon reon;
	
	@Column(name = "position", nullable = false)
	private Point possition;
	
	@Column(name = "status", nullable = false)
	private TableStatusType status;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "waiter_id", nullable = false)
	private Waiter waiter;
	
	@Column(name = "max_seats", nullable = false)
	private int maxSeats;
	

	@ManyToOne(optional = false)
	@JoinColumn(name = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	
	

	public Table() {
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
