package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("transport")
@Data
@NoArgsConstructor
public class Transport extends NotWar {

    private Integer capacity;

    public Transport(Integer armor, Integer fuel, String fuelType, String name, String color, Integer capacity) {
        super(armor, fuel, fuelType, name, color);
        this.capacity = capacity;
    }
}
