package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Cruiser.class, name = "cruiser"),
        @JsonSubTypes.Type(value = DeathStar.class, name = "deathStar"),
        @JsonSubTypes.Type(value = Fighter.class, name = "fighter"),
        @JsonSubTypes.Type(value = SpyProbe.class, name = "spyProbe"),
        @JsonSubTypes.Type(value = Transport.class, name = "transport")
})
public interface Spaceship {
}
