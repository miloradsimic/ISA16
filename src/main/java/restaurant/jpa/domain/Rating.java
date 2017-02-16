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

import restaurant.jpa.domain.enums.Rate;

@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	
	@Enumerated(value = EnumType.ORDINAL)
	@JoinColumn(name = "rate", nullable = false)
	private Rate rate;
	
	@Column(name = "rating_date")
	private Date ratingDate;
	
	@ManyToOne
	@JoinColumn(name = "guest_id", nullable = false)
	private Guest guest;
	
	
	
}
