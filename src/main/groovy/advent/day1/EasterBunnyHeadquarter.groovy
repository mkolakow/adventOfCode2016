package advent.day1

/**
 * Created by michaelkolakowski on 1/25/17.
 */
class EasterBunnyHeadquarter {

    //TODO: enum?
    private static final int UP = 0
    private static final int RIGHT = 1
    private static final int DOWN= 2
    private static final int LEFT = 3

    private int pointingDirection = LEFT //todo: start facing up ;)

    List<Point> visits = []

    Point getEndpoint(String directions) {
        Point p = new Point(0,0)


        directions.split(',').each { dir ->
            dir = dir.trim()
            def distance = dir.substring(1).toInteger() //TODO: regex?
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
//                p.y += distance
                distance.times {
                    p.y++
                    if(visits.contains(p)) {
                        println "Revisit! " + p
                    }
                    visits <<  new Point(p.x, p.y)
                }
            } else if(pointingDirection == RIGHT) {
//                p.x += distance
                distance.times {
                    p.x++
                    if(visits.contains(p)) {
                        println "Revisit! " + p
                    }
                    visits <<  new Point(p.x, p.y)
                }
            } else if(pointingDirection == DOWN) {
//                p.y -= distance
                distance.times {
                    p.y--
                    if(visits.contains(p)) {
                        println "Revisit! " + p
                    }
                    visits <<  new Point(p.x, p.y)
                }
            } else if(pointingDirection == LEFT) {
//                p.x -= distance
                distance.times {
                    p.x--
                    if(visits.contains(p)) {
                        println "Revisit! " + p
                    }
                    visits <<  new Point(p.x, p.y)
                }
            }


//            visits <<  new Point(p.x, p.y)
        }

        return p
    }
}
