package se.bengtsson.dojo;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GameOfLife {

    final int width;
    final int height;


    public GameOfLife(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Set<Point> calculateAndPrintToN(int n, Set<Point> points, long sleep) throws InterruptedException {
        Set<Point> next = new HashSet<>();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Point p = new Point(x, y);
                if (numberOfNeighbours(points, p) == 3 || (numberOfNeighbours(points, p) == 2 && points.contains(p))) {
                    next.add(p);
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("-----------------------");
        if (n == 0) return next;
        else {
            Thread.sleep(sleep);
            return calculateAndPrintToN(n - 1, next, sleep);
        }
    }

    public int numberOfNeighbours(Set<Point> points, Point point) {
        return point.getNeighbours().stream().filter(p -> points.contains(p)).collect(Collectors.toList()).size();
    }
}
