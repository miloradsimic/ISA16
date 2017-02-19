package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;


/**
 * QBill is a Querydsl query type for Bill
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBill extends EntityPathBase<Bill> {

    private static final long serialVersionUID = -235550515L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBill bill = new QBill("bill");

    public final DateTimePath<java.util.Date> creationDate = createDateTime("creationDate", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<MenuItem, QMenuItem> menuItems = this.<MenuItem, QMenuItem>createSet("menuItems", MenuItem.class, QMenuItem.class, PathInits.DIRECT2);

    public final QRestaurant restaurant;

    public final QRestaurantTable restaurantTable;

    public final NumberPath<Double> total = createNumber("total", Double.class);

    public final QWaiter waiter;

    public QBill(String variable) {
        this(Bill.class, forVariable(variable), INITS);
    }

    public QBill(Path<? extends Bill> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBill(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBill(PathMetadata metadata, PathInits inits) {
        this(Bill.class, metadata, inits);
    }

    public QBill(Class<? extends Bill> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.restaurantTable = inits.isInitialized("restaurantTable") ? new QRestaurantTable(forProperty("restaurantTable"), inits.get("restaurantTable")) : null;
        this.waiter = inits.isInitialized("waiter") ? new QWaiter(forProperty("waiter"), inits.get("waiter")) : null;
    }

}

