package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.NoArgsConstructor;

@JsonTypeName("cruiser")
@NoArgsConstructor
public class Cruiser extends War {

    private Integer weaponAmount;

    private Cruiser(Integer armor, Integer fuel, String fuelType, String name, Integer firePower, Integer weaponAmount) {
        super(armor, fuel, fuelType, name, firePower);
        this.weaponAmount = weaponAmount;
    }
}
