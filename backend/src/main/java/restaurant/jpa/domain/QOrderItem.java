package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItem is a Querydsl query type for OrderItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOrderItem extends EntityPathBase<OrderItem> {

    private static final long serialVersionUID = 669156987L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItem orderItem = new QOrderItem("orderItem");

    public final QGuest guest;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMenuItem ordered_item;

    public final EnumPath<restaurant.jpa.domain.enums.OrderStatus> orderStatus = createEnum("orderStatus", restaurant.jpa.domain.enums.OrderStatus.class);

    public final DateTimePath<java.util.Date> ready_time = createDateTime("ready_time", java.util.Date.class);

    public final QRestaurant restaurant;

    public final QRestaurantTable restaurantTable;

    public final QWaiter waiter;

    public QOrderItem(String variable) {
        this(OrderItem.class, forVariable(variable), INITS);
    }

    public QOrderItem(Path<? extends OrderItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItem(PathMetadata metadata, PathInits inits) {
        this(OrderItem.class, metadata, inits);
    }

    public QOrderItem(Class<? extends OrderItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.guest = inits.isInitialized("guest") ? new QGuest(forProperty("guest")) : null;
        this.ordered_item = inits.isInitialized("ordered_item") ? new QMenuItem(forProperty("ordered_item"), inits.get("ordered_item")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.restaurantTable = inits.isInitialized("restaurantTable") ? new QRestaurantTable(forProperty("restaurantTable"), inits.get("restaurantTable")) : null;
        this.waiter = inits.isInitialized("waiter") ? new QWaiter(forProperty("waiter"), inits.get("waiter")) : null;
    }

}

