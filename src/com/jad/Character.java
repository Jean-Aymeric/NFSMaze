package com.jad;

import java.awt.*;

public class Character {
    private final Point start;
    private final Point end;
    private final Maze maze;

    public Character() {
        start = new Point(4,8);
        end = new Point(6,2);
        maze = new Maze();
    }

    public String calculatePath() {
        return "";
    }
}
