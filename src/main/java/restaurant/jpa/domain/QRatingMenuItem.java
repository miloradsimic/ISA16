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
 * QRatingMenuItem is a Querydsl query type for RatingMenuItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRatingMenuItem extends EntityPathBase<RatingMenuItem> {

    private static final long serialVersionUID = 1376930581L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatingMenuItem ratingMenuItem = new QRatingMenuItem("ratingMenuItem");

    public final QRating _super;

    // inherited
    public final QGuest guest;

    //inherited
    public final NumberPath<Long> id;

    public final QMenuItem menuItem;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Rate> rate;

    //inherited
    public final DateTimePath<java.util.Date> ratingDate;

    public QRatingMenuItem(String variable) {
        this(RatingMenuItem.class, forVariable(variable), INITS);
    }

    public QRatingMenuItem(Path<? extends RatingMenuItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatingMenuItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatingMenuItem(PathMetadata metadata, PathInits inits) {
        this(RatingMenuItem.class, metadata, inits);
    }

    public QRatingMenuItem(Class<? extends RatingMenuItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QRating(type, metadata, inits);
        this.guest = _super.guest;
        this.id = _super.id;
        this.menuItem = inits.isInitialized("menuItem") ? new QMenuItem(forProperty("menuItem"), inits.get("menuItem")) : null;
        this.rate = _super.rate;
        this.ratingDate = _super.ratingDate;
    }

}

