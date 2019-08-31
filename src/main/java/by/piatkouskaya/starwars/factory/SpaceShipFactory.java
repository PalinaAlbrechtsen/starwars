package by.piatkouskaya.starwars.factory;

import by.piatkouskaya.starwars.model.Cruiser;
import by.piatkouskaya.starwars.model.DeathStar;
import by.piatkouskaya.starwars.model.Fighter;
import by.piatkouskaya.starwars.model.SpaceShipDto;
import by.piatkouskaya.starwars.model.Spaceship;
import by.piatkouskaya.starwars.model.SpyProbe;
import by.piatkouskaya.starwars.model.Transport;
import by.piatkouskaya.starwars.model.TypeOfShip;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;

@Service
public class SpaceShipFactory {

    public Spaceship createSpaceShip(SpaceShipDto spaceShipDto) {
        Spaceship spaceship = null;
        switch (Objects.requireNonNull(Arrays.stream(TypeOfShip.values())
                .filter(it -> it.getType().equals(spaceShipDto.getType()))
                .findAny()
                .orElse(null))) {
            case CRUISER:
                spaceship = getShip(spaceShipDto, Cruiser.class);
                break;
            case FIGHTER:
                spaceship = getShip(spaceShipDto, Fighter.class);
                break;
            case SPY_PROBE:
                spaceship = getShip(spaceShipDto, SpyProbe.class);
                break;
            case TRANSPORT:
                spaceship = getShip(spaceShipDto, Transport.class);
                break;
            case DEATH_STAR:
                spaceship = getShip(spaceShipDto, DeathStar.class);
                break;
            default:
                break;
        }
        return spaceship;
    }

    private static Spaceship getShip(SpaceShipDto spaceship, Class<? extends Spaceship> typeOfShip) {
        spaceship.getParameters().put("type", spaceship.getType());
        ObjectMapper objectMapper = new ObjectMapper();

        return objectMapper.convertValue(spaceship.getParameters(), typeOfShip);
    }
}
