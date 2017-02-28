package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.EnumPath;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QSystemManager is a Querydsl query type for SystemManager
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSystemManager extends EntityPathBase<SystemManager> {

    private static final long serialVersionUID = -971600776L;

    public static final QSystemManager systemManager = new QSystemManager("systemManager");

    public final QUser _super = new QUser(this);

    //inherited
    public final StringPath email = _super.email;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final StringPath password = _super.password;

    //inherited
    public final EnumPath<restaurant.jpa.domain.enums.Role> role = _super.role;

    public QSystemManager(String variable) {
        super(SystemManager.class, forVariable(variable));
    }

    public QSystemManager(Path<? extends SystemManager> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSystemManager(PathMetadata metadata) {
        super(SystemManager.class, metadata);
    }

}

