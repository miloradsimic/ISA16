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
 * QSupplier is a Querydsl query type for Supplier
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSupplier extends EntityPathBase<Supplier> {

    private static final long serialVersionUID = 1696058258L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSupplier supplier = new QSupplier("supplier");

    public final QUser _super = new QUser(this);

    //inherited
    public final StringPath email = _super.email;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final SetPath<Ingredient, QIngredient> ingredients = this.<Ingredient, QIngredient>createSet("ingredients", Ingredient.class, QIngredient.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    //inherited
    public final StringPath password = _super.password;

    public final QRestaurant restaurant;

    public QSupplier(String variable) {
        this(Supplier.class, forVariable(variable), INITS);
    }

    public QSupplier(Path<? extends Supplier> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSupplier(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSupplier(PathMetadata metadata, PathInits inits) {
        this(Supplier.class, metadata, inits);
    }

    public QSupplier(Class<? extends Supplier> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
    }

}

