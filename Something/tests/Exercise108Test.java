
import exercises.Exercise108;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Tests for method calcDegree from Exercise108
 * Using Boundary Values Test Techniques
 * Need 3 Tests
 */
public class Exercise108Test {

    Exercise108 exercise108 = new Exercise108();

    /**
     * Test when n is >0
     * Expected positive result
     */
    @Test
    public void calcDegree() {
        assertEquals(8,exercise108.calcDegree(7));
    }

    /**
     * Test when n is 0
     * Expected 1
     */
    @Test
    public void calcDegreeIf0() {
        assertEquals(1,exercise108.calcDegree(0));
    }

    /**
     * Test when n is negative
     * Expected IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calcDegreeIfNegative() {
        exercise108.calcDegree(-4);
    }

}