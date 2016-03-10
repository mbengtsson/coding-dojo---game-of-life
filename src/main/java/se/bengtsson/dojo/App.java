package se.bengtsson.dojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Coding dojo 3, Game of Life
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        final int width = 10;
        final int height = 10;

        final Set<Point> points = new HashSet<>();

        points.add(new Point(4, 5));
        points.add(new Point(5, 5));
        points.add(new Point(5, 4));
        points.add(new Point(6, 5));
        points.add(new Point(5, 6));

        final GameOfLife gameOfLife = new GameOfLife(width, height);

        gameOfLife.calculateAndPrintToN(7, points, 200);


    }
}
