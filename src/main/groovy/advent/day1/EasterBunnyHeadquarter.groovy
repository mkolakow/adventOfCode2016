package advent.day1

/**
 * Created by michaelkolakowski on 1/25/17.
 */
class EasterBunnyHeadquarter {

    private static final int UP = 0
    private static final int RIGHT = 1
    private static final int DOWN= 2
    private static final int LEFT = 3

    private int pointingDirection = LEFT

    Point getEndpoint(String directions) {
        Point p = new Point(0,0)


        directions.split(',').each { dir ->
            dir = dir.trim()
            def distance = dir.substring(1).toInteger()
            def turn = dir.substring(0,1)
            def adjustment = 0

            if(turn == 'R') {
                adjustment = 1
            } else if(turn == 'L') {
                adjustment = -1
            }

            //adjust pointing direction
            pointingDirection = (pointingDirection + adjustment) % 4
            if(pointingDirection < 0) {
                pointingDirection = LEFT
            }

            //decide what to do with distance
            if(pointingDirection == UP) {
                p.y += distance
            } else if(pointingDirection == RIGHT) {
                p.x += distance
            } else if(pointingDirection == DOWN) {
                p.y -= distance
            } else if(pointingDirection == LEFT) {
                p.x -= distance
            }
        }

        return p
    }
}
