package by.piatkouskaya.starwars.controller;

import by.piatkouskaya.starwars.model.SpaceShipDto;
import by.piatkouskaya.starwars.model.Spaceship;
import by.piatkouskaya.starwars.model.Transport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreaterControllerTest {

    @Autowired
    private CreaterController createrController;

    @Test
    public void checkCreatingOfSpaceShip() {
        Spaceship transport = new Transport(1000, 500, "fuelType", "Victoria", "Red", 10);
        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("armor", 1000);
        parameters.put("fuel", 500);
        parameters.put("fuelType", "fuelType");
        parameters.put("name", "Victoria");
        parameters.put("color", "Red");
        parameters.put("capacity", 10);
        SpaceShipDto spaceShipDto = new SpaceShipDto("transport", parameters);
        assertEquals(createrController.getSpaceShip(spaceShipDto),transport);
    }
}
