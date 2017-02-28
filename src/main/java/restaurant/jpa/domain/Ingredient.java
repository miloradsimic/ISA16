package restaurant.jpa.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import restaurant.jpa.domain.enums.IngredientUnit;
import restaurant.jpa.domain.enums.StockLevel;

@Entity
@Table(name = "ingredient")
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	@Column(name = "name", nullable = false)
	private String name;

	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "unit", nullable = false)
	private IngredientUnit unit;

	@Enumerated(value = EnumType.ORDINAL)
	@Column(name = "stock_level", nullable = false)
	private StockLevel stockLevel;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "ingredient_supplier", joinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "supplier_id", referencedColumnName = "id"))
	private Set<Supplier> suppliers;

	public Ingredient() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IngredientUnit getUnit() {
		return unit;
	}

	public void setUnit(IngredientUnit unit) {
		this.unit = unit;
	}

	public StockLevel getStockLevel() {
		return stockLevel;
	}

	public void setStockLevel(StockLevel stockLevel) {
		this.stockLevel = stockLevel;
	}

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
}
