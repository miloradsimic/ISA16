package restaurant.jpa.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "restaurant")
public class Restaurant {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Max(value = 24, message = "Hour is out of range!")
	@Min(value = 0, message = "Hour is out of range!")
	@Column(name = "open_hour", nullable = false)
	private int openHour;

	@Max(value = 24, message = "Hour is out of range!")
	@Min(value = 0, message = "Hour is out of range!")
	@Column(name = "close_hour", nullable = false)
	private int closeHour;

	@OneToMany
	@Column(name = "rating_id")
	private Set<Rating> ratings;

	@OneToMany
	@Column(name = "menu_item_id")
	private Set<MenuItem> menu;

	@OneToMany // TODO: Popravi ovu vezu, treba biti ManyToMany
	@Column(name = "ingredient_id")
	private Set<Ingredient> ingredients;

	public Restaurant() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getOpenHour() {
		return openHour;
	}

	public void setOpenHour(int openHour) {
		this.openHour = openHour;
	}

	public int getCloseHour() {
		return closeHour;
	}

	public void setCloseHour(int closeHour) {
		this.closeHour = closeHour;
	}

	public Set<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(Set<Rating> ratings) {
		this.ratings = ratings;
	}

	public Set<MenuItem> getMenu() {
		return menu;
	}

	public void setMenu(Set<MenuItem> menu) {
		this.menu = menu;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
