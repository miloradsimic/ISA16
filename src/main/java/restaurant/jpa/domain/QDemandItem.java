package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.DateTimePath;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemandItem is a Querydsl query type for DemandItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDemandItem extends EntityPathBase<DemandItem> {

    private static final long serialVersionUID = -1682688956L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemandItem demandItem = new QDemandItem("demandItem");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final DateTimePath<java.util.Date> demandEnd = createDateTime("demandEnd", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIngredient ingredient;

    public final QRestaurant restaurant;

    public QDemandItem(String variable) {
        this(DemandItem.class, forVariable(variable), INITS);
    }

    public QDemandItem(Path<? extends DemandItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemandItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemandItem(PathMetadata metadata, PathInits inits) {
        this(DemandItem.class, metadata, inits);
    }

    public QDemandItem(Class<? extends DemandItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ingredient = inits.isInitialized("ingredient") ? new QIngredient(forProperty("ingredient")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

