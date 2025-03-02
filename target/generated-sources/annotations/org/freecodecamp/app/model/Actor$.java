package org.freecodecamp.app.model;

import com.speedment.jpastreamer.field.ComparableField;
import com.speedment.jpastreamer.field.ReferenceField;
import com.speedment.jpastreamer.field.ShortField;
import com.speedment.jpastreamer.field.StringField;

import java.sql.Timestamp;
import java.util.Set;

/**
 * The generated base for entity {@link Actor} representing entities of the
 * {@code actor}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class Actor$ {
    
    /**
     * This Field corresponds to the {@link Actor} field "lastName".
     */
    public static final StringField<Actor> lastName = StringField.create(
        Actor.class,
        "lastName",
        Actor::getLastName,
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field "actorId".
     */
    public static final ShortField<Actor> actorId = ShortField.create(
        Actor.class,
        "actorId",
        Actor::getActorId,
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field "lastUpdate".
     */
    public static final ComparableField<Actor, Timestamp> lastUpdate = ComparableField.create(
        Actor.class,
        "lastUpdate",
        Actor::getLastUpdate,
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field "films".
     */
    public static final ReferenceField<Actor, Set<Film>> films = ReferenceField.create(
        Actor.class,
        "films",
        Actor::getFilms,
        false
    );
    /**
     * This Field corresponds to the {@link Actor} field "firstName".
     */
    public static final StringField<Actor> firstName = StringField.create(
        Actor.class,
        "firstName",
        Actor::getFirstName,
        false
    );
}