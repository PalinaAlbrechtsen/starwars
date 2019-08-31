package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("fighter")
@Data
@NoArgsConstructor
public class Fighter extends War{

    private Integer speed;

    public Fighter(Integer armor, Integer fuel, String fuelType, String name, Integer firePower, Integer speed) {
        super(armor, fuel, fuelType, name, firePower);
        this.speed = speed;
    }
}
