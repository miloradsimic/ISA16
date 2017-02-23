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
 * QRatingRestaurant is a Querydsl query type for RatingRestaurant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRatingRestaurant extends EntityPathBase<RatingRestaurant> {

    private static final long serialVersionUID = -677190528L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatingRestaurant ratingRestaurant = new QRatingRestaurant("ratingRestaurant");

    public final QRating _super;

    // inherited
    public final QGuest guest;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Rate> rate;

    //inherited
    public final DateTimePath<java.util.Date> ratingDate;

    public final QRestaurant restaurant;

    public QRatingRestaurant(String variable) {
        this(RatingRestaurant.class, forVariable(variable), INITS);
    }

    public QRatingRestaurant(Path<? extends RatingRestaurant> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatingRestaurant(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatingRestaurant(PathMetadata metadata, PathInits inits) {
        this(RatingRestaurant.class, metadata, inits);
    }

    public QRatingRestaurant(Class<? extends RatingRestaurant> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QRating(type, metadata, inits);
        this.guest = _super.guest;
        this.id = _super.id;
        this.rate = _super.rate;
        this.ratingDate = _super.ratingDate;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

