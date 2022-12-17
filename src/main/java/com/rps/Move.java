package com.rps;

public enum Move {
    ROCK,
    PAPER,
    SCISSORS,
    LIZARD,
    SPOCK;

    public boolean beats (Move opponentMove) {
        return switch (this) {
            case ROCK -> opponentMove == SCISSORS || opponentMove == LIZARD;
            case PAPER -> opponentMove == ROCK || opponentMove == SPOCK;
            case SCISSORS -> opponentMove == PAPER || opponentMove == LIZARD;
            case SPOCK -> opponentMove == SCISSORS || opponentMove == ROCK;
            case LIZARD -> opponentMove == SPOCK || opponentMove == PAPER;
        };
    }
}
