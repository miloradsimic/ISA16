package restaurant.jpa.domain;

import static com.querydsl.core.types.PathMetadataFactory.forVariable;

import javax.annotation.Generated;

import com.querydsl.core.types.Path;
import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.types.dsl.EntityPathBase;
import com.querydsl.core.types.dsl.NumberPath;
import com.querydsl.core.types.dsl.StringPath;


/**
 * QSystemManager is a Querydsl query type for SystemManager
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSystemManager extends EntityPathBase<SystemManager> {

    private static final long serialVersionUID = -971600776L;

    public static final QSystemManager systemManager = new QSystemManager("systemManager");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath password = createString("password");

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

