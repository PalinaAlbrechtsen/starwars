package by.piatkouskaya.starwars.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShipDto {

    private String type;
    private Map<String, Object> parameters;
}
