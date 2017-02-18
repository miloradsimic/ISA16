package restaurant.jpa.domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rating_employee")
public class RatingEmployee extends Rating {

	@ManyToOne(optional = false)
	@JoinColumn(name = "employee_id", nullable = false)
	private Employee employee;

	public RatingEmployee() {
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}