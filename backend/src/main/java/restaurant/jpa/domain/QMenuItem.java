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
 * QMenuItem is a Querydsl query type for MenuItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMenuItem extends EntityPathBase<MenuItem> {

    private static final long serialVersionUID = -1539698984L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuItem menuItem = new QMenuItem("menuItem");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Double> price = createNumber("price", Double.class);

    public final SetPath<Rating, QRating> ratings = this.<Rating, QRating>createSet("ratings", Rating.class, QRating.class, PathInits.DIRECT2);

    public final QRestaurant restaurant;

    public QMenuItem(String variable) {
        this(MenuItem.class, forVariable(variable), INITS);
    }

    public QMenuItem(Path<? extends MenuItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuItem(PathMetadata metadata, PathInits inits) {
        this(MenuItem.class, metadata, inits);
    }

    public QMenuItem(Class<? extends MenuItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

