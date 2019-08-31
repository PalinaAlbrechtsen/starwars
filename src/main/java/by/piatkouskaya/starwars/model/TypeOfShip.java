package by.piatkouskaya.starwars.model;

import lombok.Getter;

@Getter
public enum TypeOfShip {

    TRANSPORT("transport"),
    FIGHTER("fighter"),
    CRUISER("cruiser"),
    SPY_PROBE("spyProbe"),
    DEATH_STAR("deathStar");

    private String type;

    TypeOfShip(String type) {
        this.type = type;
    }
}
