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
 * QShift is a Querydsl query type for Shift
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QShift extends EntityPathBase<Shift> {

    private static final long serialVersionUID = 1303535740L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QShift shift = new QShift("shift");

    public final NumberPath<Integer> beginHour = createNumber("beginHour", Integer.class);

    public final NumberPath<Integer> endHour = createNumber("endHour", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QRestaurant restaurant;

    public QShift(String variable) {
        this(Shift.class, forVariable(variable), INITS);
    }

    public QShift(Path<? extends Shift> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QShift(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QShift(PathMetadata metadata, PathInits inits) {
        this(Shift.class, metadata, inits);
    }

    public QShift(Class<? extends Shift> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

