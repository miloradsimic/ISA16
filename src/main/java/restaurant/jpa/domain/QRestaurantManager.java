package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QRestaurantManager is a Querydsl query type for RestaurantManager
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRestaurantManager extends EntityPathBase<RestaurantManager> {

    private static final long serialVersionUID = -293504342L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRestaurantManager restaurantManager = new QRestaurantManager("restaurantManager");

    public final QUser _super = new QUser(this);

    //inherited
    public final StringPath email = _super.email;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath password = _super.password;

    public final QRestaurant restaurant;

    public QRestaurantManager(String variable) {
        this(RestaurantManager.class, forVariable(variable), INITS);
    }

    public QRestaurantManager(Path<? extends RestaurantManager> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRestaurantManager(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRestaurantManager(PathMetadata metadata, PathInits inits) {
        this(RestaurantManager.class, metadata, inits);
    }

    public QRestaurantManager(Class<? extends RestaurantManager> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

