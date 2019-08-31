package by.piatkouskaya.starwars.controller;

import by.piatkouskaya.starwars.factory.SpaceShipFactory;
import by.piatkouskaya.starwars.model.SpaceShipDto;
import by.piatkouskaya.starwars.model.Spaceship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreaterController {

    private final SpaceShipFactory spaceShipFactory;

    @Autowired
    public CreaterController(SpaceShipFactory spaceShipFactory) {
        this.spaceShipFactory = spaceShipFactory;
    }

    @PostMapping(value = "/getShip")
    public Spaceship getSpaceShip(@RequestBody SpaceShipDto spaceShipDto) {
        return spaceShipFactory.createSpaceShip(spaceShipDto);
    }
}
