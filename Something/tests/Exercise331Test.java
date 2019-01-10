
import exercises.Exercise331;
import exercises.Parameter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests for method calcSumOfSquare from Exercise331
 * Using Boundary Values and Equivalence Partitioning Test Techniques
 * Need 4 Tests
 */
public class Exercise331Test {

    Exercise331 exercise331 = new Exercise331();

    /**
     * Test when n can be represent as a sum of square of 3 integers
     */
    @Test
    public void calcSumOfSquare() {
        List<Parameter> expected = new ArrayList<>();
        expected.add(new Parameter(2,2,2));
        assertEquals(expected, exercise331.calcSumOfSquare(12));
    }

    /**
     * Test when n is 0
     * Expected x=0, y=0, z=0
     */
    @Test
    public void calcSumOfSquareIf0() {
        List<Parameter> expected = new ArrayList<>();
        expected.add(new Parameter(0,0,0));
        assertEquals(expected, exercise331.calcSumOfSquare(0));
    }

    /**
     * Test when n is negative
     * Expected IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void calcSumOfSquareIfNegative() {
        exercise331.calcSumOfSquare(-15);
    }

    /**
     * Test when n can not be represent as a sum of square of 3 integers
     * Expected empty list
     */
    @Test
    public void canNotBeRepresent(){
        assertEquals(0, exercise331.calcSumOfSquare(15471).size());
    }

}