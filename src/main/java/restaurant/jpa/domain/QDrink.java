package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;
import com.querydsl.core.types.dsl.StringPath;

/**
 * QDrink is a Querydsl query type for Drink
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDrink extends EntityPathBase<Drink> {

	private static final long serialVersionUID = 1289981074L;

	private static final PathInits INITS = PathInits.DIRECT2;

	public static final QDrink drink = new QDrink("drink");

	public final QMenuItem _super;

	// inherited
	public final NumberPath<Long> id;

	// inherited
	public final StringPath name;

	// inherited
	public final NumberPath<Double> price;

	// inherited
	public final SetPath<Rating, QRating> ratings;

	// inherited
	public final QRestaurant restaurant;

	public QDrink(String variable) {
		this(Drink.class, forVariable(variable), INITS);
	}

	public QDrink(Path<? extends Drink> path) {
		this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
	}

	public QDrink(PathMetadata metadata) {
		this(metadata, PathInits.getFor(metadata, INITS));
	}

	public QDrink(PathMetadata metadata, PathInits inits) {
		this(Drink.class, metadata, inits);
	}

	public QDrink(Class<? extends Drink> type, PathMetadata metadata, PathInits inits) {
		super(type, metadata, inits);
		this._super = new QMenuItem(type, metadata, inits);
		this.id = _super.id;
		this.name = _super.name;
		this.price = _super.price;
		this.ratings = _super.ratings;
		this.restaurant = _super.restaurant;
	}

}
