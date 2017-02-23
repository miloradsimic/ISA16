package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOfferItem is a Querydsl query type for OfferItem
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOfferItem extends EntityPathBase<OfferItem> {

    private static final long serialVersionUID = -1289690487L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOfferItem offerItem = new QOfferItem("offerItem");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QIngredient ingredient;

    public final EnumPath<restaurant.jpa.domain.enums.OfferStatus> offerStatus = createEnum("offerStatus", restaurant.jpa.domain.enums.OfferStatus.class);

    public final NumberPath<Double> pricePerUnit = createNumber("pricePerUnit", Double.class);

    public final QRestaurant restaurant;

    public final QSupplier supplier;

    public QOfferItem(String variable) {
        this(OfferItem.class, forVariable(variable), INITS);
    }

    public QOfferItem(Path<? extends OfferItem> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOfferItem(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOfferItem(PathMetadata metadata, PathInits inits) {
        this(OfferItem.class, metadata, inits);
    }

    public QOfferItem(Class<? extends OfferItem> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ingredient = inits.isInitialized("ingredient") ? new QIngredient(forProperty("ingredient")) : null;
        this.restaurant = inits.isInitialized("restaurant") ? new QRestaurant(forProperty("restaurant")) : null;
        this.supplier = inits.isInitialized("supplier") ? new QSupplier(forProperty("supplier"), inits.get("supplier")) : null;
    }

}

