package com.rps;

public class Player {

    private final String name;
    private int points = 0;

    public Player(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
