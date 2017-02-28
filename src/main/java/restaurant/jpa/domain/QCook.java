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
 * QCook is a Querydsl query type for Cook
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCook extends EntityPathBase<Cook> {

    private static final long serialVersionUID = -235514866L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCook cook = new QCook("cook");

    public final QEmployee _super;

    //inherited
    public final StringPath email;

    public final EnumPath<restaurant.jpa.domain.enums.FoodType> foodType = createEnum("foodType", restaurant.jpa.domain.enums.FoodType.class);

    //inherited
    public final NumberPath<Double> hourlyPayRate;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    //inherited
    public final StringPath password;

    //inherited
    public final SetPath<Rating, QRating> ratings;

    // inherited
    public final QRestaurant restaurant;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Role> role;

    // inherited
    public final QShift shift;

    public QCook(String variable) {
        this(Cook.class, forVariable(variable), INITS);
    }

    public QCook(Path<? extends Cook> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCook(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCook(PathMetadata metadata, PathInits inits) {
        this(Cook.class, metadata, inits);
    }

    public QCook(Class<? extends Cook> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QEmployee(type, metadata, inits);
        this.email = _super.email;
        this.hourlyPayRate = _super.hourlyPayRate;
        this.id = _super.id;
        this.name = _super.name;
        this.password = _super.password;
        this.ratings = _super.ratings;
        this.restaurant = _super.restaurant;
        this.role = _super.role;
        this.shift = _super.shift;
    }

}

