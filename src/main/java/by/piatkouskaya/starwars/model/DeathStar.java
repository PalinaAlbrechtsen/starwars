package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("deathStar")
@Data
@NoArgsConstructor
public class DeathStar extends War {

    private Integer maxFighterAmount;

    public DeathStar(Integer armor, Integer fuel, String fuelType, String name, Integer firePower, Integer maxFighterAmount) {
        super(armor, fuel, fuelType, name, firePower);
        this.maxFighterAmount = maxFighterAmount;
    }
}
