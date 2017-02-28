package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QFood is a Querydsl query type for Food
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFood extends EntityPathBase<Food> {

    private static final long serialVersionUID = -235425500L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFood food = new QFood("food");

    public final QMenuItem _super;

    public final EnumPath<restaurant.jpa.domain.enums.FoodType> foodType = createEnum("foodType", restaurant.jpa.domain.enums.FoodType.class);

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    //inherited
    public final NumberPath<Double> price;

    //inherited
    public final SetPath<Rating, QRating> ratings;

    // inherited
    public final QRestaurant restaurant;

    public QFood(String variable) {
        this(Food.class, forVariable(variable), INITS);
    }

    public QFood(Path<? extends Food> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFood(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFood(PathMetadata metadata, PathInits inits) {
        this(Food.class, metadata, inits);
    }

    public QFood(Class<? extends Food> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QMenuItem(type, metadata, inits);
        this.id = _super.id;
        this.name = _super.name;
        this.price = _super.price;
        this.ratings = _super.ratings;
        this.restaurant = _super.restaurant;
    }

}

