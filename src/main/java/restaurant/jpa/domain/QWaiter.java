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
 * QWaiter is a Querydsl query type for Waiter
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWaiter extends EntityPathBase<Waiter> {

    private static final long serialVersionUID = 1862967336L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QWaiter waiter = new QWaiter("waiter");

    public final QEmployee _super;

    //inherited
    public final StringPath email;

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

    // inherited
    public final QShift shift;

    public QWaiter(String variable) {
        this(Waiter.class, forVariable(variable), INITS);
    }

    public QWaiter(Path<? extends Waiter> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QWaiter(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QWaiter(PathMetadata metadata, PathInits inits) {
        this(Waiter.class, metadata, inits);
    }

    public QWaiter(Class<? extends Waiter> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QEmployee(type, metadata, inits);
        this.email = _super.email;
        this.hourlyPayRate = _super.hourlyPayRate;
        this.id = _super.id;
        this.name = _super.name;
        this.password = _super.password;
        this.ratings = _super.ratings;
        this.restaurant = _super.restaurant;
        this.shift = _super.shift;
    }

}

