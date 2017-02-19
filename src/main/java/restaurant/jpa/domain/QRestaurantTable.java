package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRestaurantTable is a Querydsl query type for RestaurantTable
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRestaurantTable extends EntityPathBase<RestaurantTable> {

    private static final long serialVersionUID = 2003911179L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRestaurantTable restaurantTable = new QRestaurantTable("restaurantTable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> maxSeats = createNumber("maxSeats", Integer.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final QTablePosition position;

    public final QReon reon;

    public final QRestaurant restaurant;

    public final EnumPath<restaurant.jpa.domain.enums.TableStatus> status = createEnum("status", restaurant.jpa.domain.enums.TableStatus.class);

    public final QWaiter waiter;

    public QRestaurantTable(String variable) {
        this(RestaurantTable.class, forVariable(variable), INITS);
    }

    public QRestaurantTable(Path<? extends RestaurantTable> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRestaurantTable(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRestaurantTable(PathMetadata metadata, PathInits inits) {
        this(RestaurantTable.class, metadata, inits);
    }

    public QRestaurantTable(Class<? extends RestaurantTable> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.position = inits.isInitialized("position") ? new QTablePosition(forProperty("position"), inits.get("position")) : null;
        this.reon = inits.isInitialized("reon") ? new QReon(forProperty("reon"), inits.get("reon")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.waiter = inits.isInitialized("waiter") ? new QWaiter(forProperty("waiter"), inits.get("waiter")) : null;
    }

}

