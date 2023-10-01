package com.football.prediction.TiresiasProphetPredictions.enums;

public enum Result {
    HOME_TEAM(1),
    AWAY_TEAM(2),
    DRAW(3);

    private final int id;

    Result(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
