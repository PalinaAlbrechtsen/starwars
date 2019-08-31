package by.piatkouskaya.starwars.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class NotWar extends RealSpaceShip {

    String color;

    public NotWar(Integer armor, Integer fuel, String fuelType, String name, String color) {
        super(armor, fuel, fuelType, name);
        this.color = color;
    }
}
