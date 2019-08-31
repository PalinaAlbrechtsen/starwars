package by.piatkouskaya.starwars.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class War extends RealSpaceShip {

    public Integer firePower;

    public War(Integer armor, Integer fuel, String fuelType, String name, Integer firePower) {
        super(armor, fuel, fuelType, name);
        this.firePower = firePower;
    }
}
