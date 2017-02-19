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
 * QReon is a Querydsl query type for Reon
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReon extends EntityPathBase<Reon> {

    private static final long serialVersionUID = -235077608L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReon reon = new QReon("reon");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QRestaurant restaurant;

    public QReon(String variable) {
        this(Reon.class, forVariable(variable), INITS);
    }

    public QReon(Path<? extends Reon> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReon(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReon(PathMetadata metadata, PathInits inits) {
        this(Reon.class, metadata, inits);
    }

    public QReon(Class<? extends Reon> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

