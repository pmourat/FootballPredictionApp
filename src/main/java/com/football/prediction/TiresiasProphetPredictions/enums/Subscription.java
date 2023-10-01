package com.football.prediction.TiresiasProphetPredictions.enums;

public enum Subscription {
    FREE(1),
    PRO(2);

    private final int id;

    Subscription(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
