package advent.day1

import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

/**
 * Created by michaelkolakowski on 1/25/17.
 */
class EasterBunnyHeadquarterTest {
    EasterBunnyHeadquarter map

    @Before
    void setup() {
        map = new EasterBunnyHeadquarter()
    }

    @Test
    void simpleTest() {
        Point p = map.getEndpoint("R1")
        assertEquals(new Point(0,1), p)
    }

    @Test
    void addAnotherR() {
        Point p = map.getEndpoint("R2")
        assertEquals(new Point(0,2), p)
    }

    @Test
    void twoRs() {
        Point p = map.getEndpoint("R1, R1")
        assertEquals(new Point(1, 1), p)
    }

    @Test
    void threeRs() {
        Point p = map.getEndpoint("R1, R1, R1")
        assertEquals(new Point(1, 0), p)
    }

    @Test
    void fourRs() {
        Point p = map.getEndpoint("R1, R1, R1, R1")
        assertEquals(new Point(0, 0), p)
    }

    @Test
    void oneL() {
        Point p = map.getEndpoint("L1")
        assertEquals(new Point(0, -1), p)
    }

    @Test
    void twoLs() {
        Point p = map.getEndpoint("L1, L1")
        assertEquals(new Point(1, -1), p)
    }

    @Test
    void fourLs() {
        Point p = map.getEndpoint("L1, L1, L1, L1")
        assertEquals(new Point(0, 0), p)
    }

    @Test
    void oneRoneL() {
        Point p = map.getEndpoint("R1, L1")
        assertEquals(new Point(-1, 1), p)
    }

    @Test
    void biggerDirection() {
        Point p = map.getEndpoint("R13")
        assertEquals(new Point(0, 13), p)
    }

    @Test
    void actualData1() {
        Point p = map.getEndpoint("R2, L3")
        assertEquals(new Point(-3, 2), p)
    }

    @Test
    void actualData2() {
        Point p = map.getEndpoint("R5, L5, R5, R3")
        println "Point: " + p
        println "dist: " + (Math.abs(p.x) + Math.abs(p.y))
    }

    @Test
    void goForGold() {
        Point p = map.getEndpoint("L2, L5, L5, R5, L2, L4, R1, R1, L4, R2, R1, L1, L4, R1, L4, L4, R5, R3, R1, L1, R1, L5, L1, R5, L4, R2, L5, L3, L3, R3, L3, R4, R4, L2, L5, R1, R2, L2, L1, R3, R4, L193, R3, L5, R45, L1, R4, R79, L5, L5, R5, R1, L4, R3, R3, L4, R185, L5, L3, L1, R5, L2, R1, R3, R2, L3, L4, L2, R2, L3, L2, L2, L3, L5, R3, R4, L5, R1, R2, L2, R4, R3, L4, L3, L1, R3, R2, R1, R1, L3, R4, L5, R2, R1, R3, L3, L2, L2, R2, R1, R2, R3, L3, L3, R4, L4, R4, R4, R4, L3, L1, L2, R5, R2, R2, R2, L4, L3, L4, R4, L5, L4, R2, L4, L4, R4, R1, R5, L2, L4, L5, L3, L2, L4, L4, R3, L3, L4, R1, L2, R3, L2, R1, R2, R5, L4, L2, L1, L3, R2, R3, L2, L1, L5, L2, L1, R4")
        println "Point: " + p
        println "dist: " + (Math.abs(p.x) + Math.abs(p.y))
    }
}
