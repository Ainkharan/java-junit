public class Compass {
    public enum Point{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public enum Direction{
        LEFT,
        RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction) {
        if ((point == Point.NORTH) && (direction == Direction.RIGHT)) {
            return Point.EAST;
        } else if (point == Point.EAST && direction == Direction.RIGHT) {
            return Point.SOUTH;
        } else if (point == Point.SOUTH && direction == Direction.RIGHT) {
            return Point.WEST;
        } else if (point == Point.WEST && direction == Direction.RIGHT) {
            return Point.NORTH;
        }// Left
        else if (point == Point.NORTH && direction == Direction.LEFT) {
            return Point.WEST;
        } else if (point == Point.EAST && direction == Direction.LEFT) {
            return Point.NORTH;
        } else if (point == Point.SOUTH && direction == Direction.LEFT) {
            return Point.EAST;
        } else if (point == Point.WEST && direction == Direction.LEFT) {
            return Point.SOUTH;
        }

        return null;
    }
}
