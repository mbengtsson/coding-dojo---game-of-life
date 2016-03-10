package se.bengtsson.dojo;

import java.util.HashSet;
import java.util.Set;

public class Point {

    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Set<Point> getNeighbours() {
        Set<Point> nb = new HashSet<>();
        nb.add(new Point(x, y - 1));
        nb.add(new Point(x, y + 1));
        nb.add(new Point(x - 1, y - 1));
        nb.add(new Point(x - 1, y));
        nb.add(new Point(x - 1, y + 1));
        nb.add(new Point(x + 1, y - 1));
        nb.add(new Point(x + 1, y));
        nb.add(new Point(x + 1, y + 1));

        return nb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
