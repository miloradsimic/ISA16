package restaurant.jpa.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.FoodType;

@Entity
@Table(name = "cook")
public class Cook extends Employee {

	@Column(name = "food_type", nullable = false)
	private FoodType foodType;

	public Cook() {
	}

	@Enumerated(EnumType.ORDINAL)
	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}

}
