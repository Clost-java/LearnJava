package LearnJava;

import java.util.Objects;

/**
 * @author:clost
 * @date:2022/7/13
 */
public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);


    }
}
class Point{

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
