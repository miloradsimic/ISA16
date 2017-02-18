package restaurant.jpa.domain;

import static javax.persistence.InheritanceType.TABLE_PER_CLASS;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.Rate;

@Entity
// koncept jedna tabela po konkretnoj klasi
@Inheritance(strategy = TABLE_PER_CLASS)
public abstract class Rating {

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
