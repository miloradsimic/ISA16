package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.BooleanPath;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = 202757190L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final BooleanPath canceled = createBoolean("canceled");

    public final SetPath<Guest, QGuest> friends = this.<Guest, QGuest>createSet("friends", Guest.class, QGuest.class, PathInits.DIRECT2);

    public final QGuest guest;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<OrderItem, QOrderItem> orders = this.<OrderItem, QOrderItem>createSet("orders", OrderItem.class, QOrderItem.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> reservationBegin = createDateTime("reservationBegin", java.util.Date.class);

    public final DateTimePath<java.util.Date> reservationEnd = createDateTime("reservationEnd", java.util.Date.class);

    public final DateTimePath<java.util.Date> reservationExpire = createDateTime("reservationExpire", java.util.Date.class);

    public final QRestaurant restaurant;

    public final QRestaurantTable restaurantTable;

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.guest = inits.isInitialized("guest") ? new QGuest(forProperty("guest")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.restaurantTable = inits.isInitialized("restaurantTable") ? new QRestaurantTable(forProperty("restaurantTable"), inits.get("restaurantTable")) : null;
    }

}

