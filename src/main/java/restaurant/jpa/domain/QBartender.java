package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.SetPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QBartender is a Querydsl query type for Bartender
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBartender extends EntityPathBase<Bartender> {

    private static final long serialVersionUID = -1208075359L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBartender bartender = new QBartender("bartender");

    public final QEmployee _super;

    //inherited
    public final StringPath email;

    //inherited
    public final NumberPath<Double> hourlyPayRate;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final StringPath name;

    //inherited
    public final StringPath password;

    //inherited
    public final SetPath<Rating, QRating> ratings;

    // inherited
    public final QRestaurant restaurant;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Role> role;

    // inherited
    public final QShift shift;

    public QBartender(String variable) {
        this(Bartender.class, forVariable(variable), INITS);
    }

    public QBartender(Path<? extends Bartender> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBartender(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBartender(PathMetadata metadata, PathInits inits) {
        this(Bartender.class, metadata, inits);
    }

    public QBartender(Class<? extends Bartender> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QEmployee(type, metadata, inits);
        this.email = _super.email;
        this.hourlyPayRate = _super.hourlyPayRate;
        this.id = _super.id;
        this.name = _super.name;
        this.password = _super.password;
        this.ratings = _super.ratings;
        this.restaurant = _super.restaurant;
        this.role = _super.role;
        this.shift = _super.shift;
    }

}

