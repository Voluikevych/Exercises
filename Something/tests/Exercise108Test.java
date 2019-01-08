
import exercises.Exercise108;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise108Test {

    Exercise108 exercise108 = new Exercise108();

    @Test
    public void calcDegree() {
        assertEquals(3,exercise108.calcDegree(7));
    }

    @Test
    public void calcDegreeIf0() {
        assertEquals(0,exercise108.calcDegree(0));
    }

    @Test
    public void calcDegreeIfNegative() {
        assertEquals(0,exercise108.calcDegree(-4));
    }

}