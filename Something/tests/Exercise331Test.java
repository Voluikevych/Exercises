
import exercises.Exercise331;
import exercises.Parameter;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Exercise331Test {

    Exercise331 exercise331 = new Exercise331();

    @Test
    public void calcSumOfSquare() {
        assertNotEquals(0, exercise331.calcSumOfSquare(15470).size());
    }

    @Test
    public void calcSumOfSquareIf0() {
        assertEquals(1, exercise331.calcSumOfSquare(0).size());
    }

    @Test
    public void calcSumOfSquareIfNegative() {
        assertEquals(0, exercise331.calcSumOfSquare(-15).size());
    }

    @Test
    public void canNotBeRepresent(){
        assertEquals(0, exercise331.calcSumOfSquare(15471).size());
    }

    @Test
    public void sumIsRight(){
       List<Parameter> result = exercise331.calcSumOfSquare(12);
        int x = result.get(0).getX();
        int y = result.get(0).getY();
        int z = result.get(0).getZ();
        int sum = x*x + y*y +z*z;
        assertEquals(12 , sum);
    }
}