package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.ListPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.PathInits;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QGuest is a Querydsl query type for Guest
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QGuest extends EntityPathBase<Guest> {

    private static final long serialVersionUID = 1292837330L;

    public static final QGuest guest = new QGuest("guest");

    public final QUser _super = new QUser(this);

    //inherited
    public final StringPath email = _super.email;

    public final ListPath<Guest, QGuest> friendOf = this.<Guest, QGuest>createList("friendOf", Guest.class, QGuest.class, PathInits.DIRECT2);

    public final ListPath<Guest, QGuest> friends = this.<Guest, QGuest>createList("friends", Guest.class, QGuest.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath password = _super.password;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Role> role = _super.role;

    public QGuest(String variable) {
        super(Guest.class, forVariable(variable));
    }

    public QGuest(Path<? extends Guest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QGuest(PathMetadata metadata) {
        super(Guest.class, metadata);
    }

}

