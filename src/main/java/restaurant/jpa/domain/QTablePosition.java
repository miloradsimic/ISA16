package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTablePosition is a Querydsl query type for TablePosition
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTablePosition extends EntityPathBase<TablePosition> {

    private static final long serialVersionUID = -687741679L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTablePosition tablePosition = new QTablePosition("tablePosition");

    public final NumberPath<Integer> col = createNumber("col", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QRestaurant restaurant;

    public final QRestaurantTable restaurantTable;

    public final NumberPath<Integer> row = createNumber("row", Integer.class);

    public QTablePosition(String variable) {
        this(TablePosition.class, forVariable(variable), INITS);
    }

    public QTablePosition(Path<? extends TablePosition> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTablePosition(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTablePosition(PathMetadata metadata, PathInits inits) {
        this(TablePosition.class, metadata, inits);
    }

    public QTablePosition(Class<? extends TablePosition> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.restaurantTable = inits.isInitialized("restaurantTable") ? new QRestaurantTable(forProperty("restaurantTable"), inits.get("restaurantTable")) : null;
    }

}

