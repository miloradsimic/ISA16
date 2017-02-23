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
 * QRatingEmployee is a Querydsl query type for RatingEmployee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRatingEmployee extends EntityPathBase<RatingEmployee> {

    private static final long serialVersionUID = -1120471887L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatingEmployee ratingEmployee = new QRatingEmployee("ratingEmployee");

    public final QRating _super;

    public final QEmployee employee;

    // inherited
    public final QGuest guest;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Rate> rate;

    //inherited
    public final DateTimePath<java.util.Date> ratingDate;

    public QRatingEmployee(String variable) {
        this(RatingEmployee.class, forVariable(variable), INITS);
    }

    public QRatingEmployee(Path<? extends RatingEmployee> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatingEmployee(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatingEmployee(PathMetadata metadata, PathInits inits) {
        this(RatingEmployee.class, metadata, inits);
    }

    public QRatingEmployee(Class<? extends RatingEmployee> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QRating(type, metadata, inits);
        this.employee = inits.isInitialized("employee") ? new QEmployee(forProperty("employee"), inits.get("employee")) : null;
        this.guest = _super.guest;
        this.id = _super.id;
        this.rate = _super.rate;
        this.ratingDate = _super.ratingDate;
    }

}

