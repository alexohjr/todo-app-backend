package com.heoch.todoapplication.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QTodoEntity is a Querydsl query type for TodoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTodoEntity extends EntityPathBase<TodoEntity> {

    private static final long serialVersionUID = 1973641494L;

    public static final QTodoEntity todoEntity = new QTodoEntity("todoEntity");

    public final BooleanPath done = createBoolean("done");

    public final DateTimePath<java.util.Date> regDt = createDateTime("regDt", java.util.Date.class);

    public final StringPath title = createString("title");

    public final StringPath todoId = createString("todoId");

    public final StringPath userId = createString("userId");

    public QTodoEntity(String variable) {
        super(TodoEntity.class, forVariable(variable));
    }

    public QTodoEntity(Path<? extends TodoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTodoEntity(PathMetadata metadata) {
        super(TodoEntity.class, metadata);
    }

}

