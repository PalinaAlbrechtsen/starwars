package by.piatkouskaya.starwars.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public abstract class RealSpaceShip implements Spaceship {

    Integer armor;
    Integer fuel;
    String fuelType;
    String name;

    public RealSpaceShip(Integer armor, Integer fuel, String fuelType, String name) {
        this.armor = armor;
        this.fuel = fuel;
        this.fuelType = fuelType;
        this.name = name;
    }
}
