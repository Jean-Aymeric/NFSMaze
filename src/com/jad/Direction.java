package com.jad;

public enum Direction {
    North("Nord"), East("Est"), South("Sud"), West("Ouest");

    private final String name;

    Direction(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
