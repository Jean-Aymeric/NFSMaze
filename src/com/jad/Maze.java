package com.jad;

public class Maze {
    private Square[][] walls = new Square[][] {
            {Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Free,   Square.Free,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Wall,  Square.Wall,  Square.Exit,   Square.Wall,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,  Square.Wall,   Square.Wall,   Square.Wall,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Free,  Square.Free,   Square.Free,   Square.Free,  Square.Free,   Square.Wall},
            {Square.Wall,   Square.Wall,   Square.Free,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Free,   Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall},
            {Square.Wall,   Square.Free,   Square.Free,   Square.Free,   Square.Entrance,   Square.Free,   Square.Free,   Square.Free,   Square.Free,   Square.Wall},
            {Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall,   Square.Wall}
    };

    public Square getSquareByXY(int x, int y) {
        return this.walls[y][x];
    }
}
