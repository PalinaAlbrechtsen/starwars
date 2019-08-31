package by.piatkouskaya.starwars.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeName("spyProbe")
@Data
@NoArgsConstructor
public class SpyProbe extends NotWar {

    private String scanSensor;

    public SpyProbe(Integer armor, Integer fuel, String fuelType, String name, String color, String scanSensor) {
        super(armor, fuel, fuelType, name, color);
        this.scanSensor = scanSensor;
    }
}
