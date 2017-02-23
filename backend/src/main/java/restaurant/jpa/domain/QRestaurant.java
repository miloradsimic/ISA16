package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;


/**
 * QRestaurant is a Querydsl query type for Restaurant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRestaurant extends EntityPathBase<Restaurant> {

    private static final long serialVersionUID = 1055441795L;

    public static final QRestaurant restaurant = new QRestaurant("restaurant");

    public final NumberPath<Integer> closeHour = createNumber("closeHour", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createSet("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final SetPath<MenuItem, QMenuItem> menu = this.<MenuItem, QMenuItem>createSet("menu", MenuItem.class, QMenuItem.class, PathInits.DIRECT2);

    public final NumberPath<Integer> openHour = createNumber("openHour", Integer.class);

    public final SetPath<Rating, QRating> ratings = this.<Rating, QRating>createSet("ratings", Rating.class, QRating.class, PathInits.DIRECT2);

    public QRestaurant(String variable) {
        super(Restaurant.class, forVariable(variable));
    }

    public QRestaurant(Path<? extends Restaurant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRestaurant(PathMetadata metadata) {
        super(Restaurant.class, metadata);
    }

}

